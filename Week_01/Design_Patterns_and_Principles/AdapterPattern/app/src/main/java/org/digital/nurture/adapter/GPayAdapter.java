package org.digital.nurture.adapter;

public class GPayAdapter implements PaymentProcessor {
    private GPayPaymentProcessor GPayPaymentProcessor;

    public GPayAdapter(GPayPaymentProcessor GPayPaymentProcessor) {
        this.GPayPaymentProcessor = GPayPaymentProcessor;
    }

    @Override
    public void processPayment(double amount) {
        GPayPaymentProcessor.makePayment(amount);
    }
}
