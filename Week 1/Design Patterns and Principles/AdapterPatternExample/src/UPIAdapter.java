public class UPIAdapter implements PaymentProcessor {
    private UPI upi;

    public UPIAdapter(UPI upi) {
        this.upi = upi;
    }

    @Override
    public void processPayment(double amount) {
        upi.Payment1(amount);
    }

}
