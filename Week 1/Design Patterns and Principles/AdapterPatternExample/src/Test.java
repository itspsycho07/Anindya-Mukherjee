public class Test{
    public static void main(String[] args) {
        PaymentProcessor upiProcessor = new UPIAdapter(new UPI());
        upiProcessor.processPayment(100.0);

        PaymentProcessor cardProcessor = new CardAdapter(new Card());
        cardProcessor.processPayment(200.0);

        PaymentProcessor cashProcessor = new CashAdapter(new Cash());
        cashProcessor.processPayment(300.0);
    }
}
