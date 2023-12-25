public class PaymentController {

	private Pay_Interface paymentMethod;
	
	public PaymentController() {
		
	}

	public void setPaymentMethod(Pay_Interface paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	public void pay() {
		this.paymentMethod.pay();		
	}
}
