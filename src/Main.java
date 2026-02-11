import model.*;
import service.PaymentService;

public class Main {

    public static void main(String[] args) {
        PaymentService service = new PaymentService();

        service.makePayment(new CardPayment(2000, "1234 5678 9112 0007"));
        service.makePayment(new CashPayment(900));
        service.makePayment(new UpiPayment(500, "utkarsh@paytm"));
    }
}
