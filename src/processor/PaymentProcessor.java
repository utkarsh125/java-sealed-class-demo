//this is the processor layer
//switch case usage enforced here.
package processor;

import model.*;

public class PaymentProcessor {

    public static void process(Payment payment) {
        switch (payment) {
            case CardPayment cp -> System.out.println(
                "Card payment: " + cp.amount() + " Card: " + cp.cardNumber()
            );
            case UpiPayment upi -> System.out.println(
                "UPI payment: " + upi.amount() + " UPI: " + upi.upiId()
            );
            case CashPayment cash -> System.out.println(
                "Cash payment: " + cash.amount()
            );
        }
    }
}
