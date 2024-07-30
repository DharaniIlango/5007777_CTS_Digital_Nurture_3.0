package org.digital.nurture;

import org.digital.nurture.adapter.GPayAdapter;
import org.digital.nurture.adapter.GPayPaymentProcessor;
import org.digital.nurture.adapter.PaymentProcessor;
import org.digital.nurture.adapter.PaytmAdapter;
import org.digital.nurture.adapter.PaytmPaymentProcessor;

public class App {
    public static void main(String[] args) {
        PaymentProcessor gPayProcessor = new GPayAdapter(new GPayPaymentProcessor());
        PaymentProcessor paytmProcessor = new PaytmAdapter(new PaytmPaymentProcessor());

        gPayProcessor.processPayment(100.0);
        paytmProcessor.processPayment(200.0);
    }
}
