package org.digital.nurture.adapter;

public class PaytmPaymentProcessor {
    public void charge(double amount) {
        System.out.println("Processing payment through PayTM: Rs. " + amount);
    }
}
