package org.digital.nurture.adapter;

public class GPayPaymentProcessor {
    public void makePayment(double amount) {
        System.out.println("Processing payment through GPay: Rs. " + amount);
    }
}
