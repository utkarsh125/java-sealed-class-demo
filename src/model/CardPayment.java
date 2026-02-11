package model;

public final class CardPayment implements Payment {

    private final double amount;
    private final String cardNumber;

    public CardPayment(double amount, String cardNumber) {
        this.amount = amount;
        this.cardNumber = cardNumber;
    }

    public double amount() {
        return amount;
    }

    public String cardNumber() {
        return cardNumber;
    }
}
