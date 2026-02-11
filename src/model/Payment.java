package model;

//sealed class usage enfoced here.
public sealed interface Payment permits CardPayment, UpiPayment, CashPayment {
    double amount();
}
