public class Test {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay using Credit Card
        PaymentStrategy creditCardPayment = new CreditCardPayment();
        context.setPaymentStrategy(creditCardPayment);
        context.pay(250.75);

        System.out.println();

        // Pay using PayPal
        PaymentStrategy payPalPayment = new PayPalPayment();
        context.setPaymentStrategy(payPalPayment);
        context.pay(89.50);
    }
}
