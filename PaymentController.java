public class PaymentController {
    private IPayment payment;

    public void setPaymentMethod(IPayment payment) {
		this.payment = payment;
	}

    public void pay() {
        payment.pay();
    }
}
