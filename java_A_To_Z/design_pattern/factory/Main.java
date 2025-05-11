package factory;

public class Main {
public static void main(String[] args) {
	PaymentProcessorFactory factory = PaymentProcessorFactory.getInstance();
	PaymentProcessor processor = factory.getProcessor(PaymentType.CREDITCARD);
	PaymentProcessor processor2 = factory.getProcessor(PaymentType.CHECK);
	processor.process(100.0);
	processor2.process(200.0);
}
}
