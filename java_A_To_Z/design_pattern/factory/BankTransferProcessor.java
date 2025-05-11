package factory;

public class BankTransferProcessor implements PaymentProcessor {

	@Override
	public void process(Double amount) {
	System.out.println("Payment Done By Bank_Transfer Amount "+amount);
	}

	@Override
	public boolean supports(PaymentType paymentType) {
		return paymentType==PaymentType.BANKTRANSFER;
	}

}
