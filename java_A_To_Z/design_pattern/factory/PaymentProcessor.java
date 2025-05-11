package factory;

public interface PaymentProcessor {
void process(Double amount);
boolean supports(PaymentType paymentType);
}
