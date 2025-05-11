package factory;

public class CreditCardProcessor implements PaymentProcessor {

	@Override
	public void process(Double amount) {
		System.out.println("Payment Done By Credit_Card "+amount);
	}

	@Override
	public boolean supports(PaymentType paymentType) {
		return paymentType==PaymentType.CREDITCARD;
	}

}
