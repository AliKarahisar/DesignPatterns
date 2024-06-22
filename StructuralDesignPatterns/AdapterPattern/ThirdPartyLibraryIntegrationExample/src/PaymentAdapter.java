public class PaymentAdapter implements PaymentProcessor {
    private NewPaymentService newPaymentService;

    public PaymentAdapter(NewPaymentService newPaymentService) {
        this.newPaymentService = newPaymentService;
    }

    @Override
    public void processPayment(double amount) {
        newPaymentService.makePayment(amount);
    }
}