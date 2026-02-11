package model;

public final class CashPayment implements Payment {

    private final double amount;

    public CashPayment(double amount) {
        this.amount = amount;
    }

    public double amount() {
        return amount;
    }
}
