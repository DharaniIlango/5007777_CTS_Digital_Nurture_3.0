// src/main/java/org/digital/nurture/GPayPayment.java
package org.digital.nurture;

public class GPayPayment implements PaymentStrategy {
    private String email;

    public GPayPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using GPay. Email: " + email);
    }
}
