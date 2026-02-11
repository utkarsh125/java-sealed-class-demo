package model;

public final class UpiPayment implements Payment {

    private final double amount;
    private final String upiId;

    public UpiPayment(double amount, String upiId) {
        this.amount = amount;
        this.upiId = upiId;
    }

    public double amount() {
        return amount;
    }

    public String upiId() {
        return upiId;
    }
}
