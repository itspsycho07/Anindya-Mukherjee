public class CardAdapter implements PaymentProcessor {
    private Card card;

    public CardAdapter(Card card) {
        this.card = card;
    }

    @Override
    public void processPayment(double amount) {
        card.Payment2(amount);
    }

}
