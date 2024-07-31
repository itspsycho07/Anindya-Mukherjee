public class CashAdapter implements PaymentProcessor {
    private Cash cash;

    public CashAdapter(Cash cash) {
        this.cash = cash;
    }

    @Override
    public void processPayment(double amount) {
        cash.Payment3(amount);
    }

}
