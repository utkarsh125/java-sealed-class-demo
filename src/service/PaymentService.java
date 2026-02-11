package service;

import model.Payment;
import processor.PaymentProcessor;

public class PaymentService {

    public void makePayment(Payment payment) {
        PaymentProcessor.process(payment);
    }
}
