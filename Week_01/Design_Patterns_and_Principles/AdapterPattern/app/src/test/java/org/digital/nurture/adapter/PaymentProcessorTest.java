package org.digital.nurture.adapter;

import org.junit.jupiter.api.Test;

public class PaymentProcessorTest {
    @Test
    public void testPaymentProcessing() {
        PaymentProcessor GPayProcessor = new GPayAdapter(new GPayPaymentProcessor());
        PaymentProcessor PaytmProcessor = new PaytmAdapter(new PaytmPaymentProcessor());

        GPayProcessor.processPayment(100.0);
        PaytmProcessor.processPayment(200.0);
    }
}
