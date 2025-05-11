package factory;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public class PaymentProcessorFactory {

    private static final PaymentProcessorFactory INSTANCE = new PaymentProcessorFactory();
    private final Map<PaymentType, Supplier<PaymentProcessor>> processors = new EnumMap<>(PaymentType.class);

    private PaymentProcessorFactory() {
        register(PaymentType.CREDITCARD, CreditCardProcessor::new);
        register(PaymentType.PAYPAL, PaypalProcessor::new);
        register(PaymentType.BANKTRANSFER, BankTransferProcessor::new);
    }

    private void register(PaymentType type, Supplier<PaymentProcessor> supplier) {
        processors.put(type, supplier);
    }

    public PaymentProcessor getProcessor(PaymentType type) {
        return processors.values().stream()
                .map(Supplier::get) 
                .filter(processor -> processor.supports(type))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No Processor for type: " + type));
    }


    public static PaymentProcessorFactory getInstance() {
        return INSTANCE;
    }
}
