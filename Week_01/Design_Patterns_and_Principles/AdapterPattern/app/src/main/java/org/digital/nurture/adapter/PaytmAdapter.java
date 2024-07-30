package org.digital.nurture.adapter;

public class PaytmAdapter implements PaymentProcessor {
    private PaytmPaymentProcessor PaytmPaymentProcessor;

    public PaytmAdapter(PaytmPaymentProcessor PaytmPaymentProcessor) {
        this.PaytmPaymentProcessor = PaytmPaymentProcessor;
    }

    @Override
    public void processPayment(double amount) {
        PaytmPaymentProcessor.charge(amount);
    }
}
