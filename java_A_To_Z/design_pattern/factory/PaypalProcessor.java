package factory;

public class PaypalProcessor implements PaymentProcessor {

	@Override
	public void process(Double amount) {
		System.out.println("Payment Done By Paypal amount "+amount);

	}

	@Override
	public boolean supports(PaymentType paymentType) {
		return paymentType==PaymentType.PAYPAL;
	}

}
