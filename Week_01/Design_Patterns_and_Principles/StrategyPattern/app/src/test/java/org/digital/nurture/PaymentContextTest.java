// src/test/java/org/digital/nurture/PaymentContextTest.java
package org.digital.nurture;

import org.junit.jupiter.api.Test;

public class PaymentContextTest {
    @Test
    public void testCreditCardPayment() {
        PaymentContext context = new PaymentContext();
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        context.executePayment(100);
    }

    @Test
    public void testGPayPayment() {
        PaymentContext context = new PaymentContext();
        context.setPaymentStrategy(new GPayPayment("user@example.com"));
        context.executePayment(200);
    }
}
