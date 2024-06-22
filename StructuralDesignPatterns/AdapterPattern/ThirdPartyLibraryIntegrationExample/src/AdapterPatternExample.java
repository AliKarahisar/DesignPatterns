public class AdapterPatternExample {
    public static void main(String[] args) {
        PaymentProcessor oldProcessor = new OldPaymentProcessor();
        oldProcessor.processPayment(100.0);

        NewPaymentService newService = new NewPaymentService();
        PaymentProcessor adapter = new PaymentAdapter(newService);
        adapter.processPayment(200.0);
    }
}