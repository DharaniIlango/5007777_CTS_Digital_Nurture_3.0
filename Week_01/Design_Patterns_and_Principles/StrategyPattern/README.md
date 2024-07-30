# StrategyPatternExample

This project demonstrates the Strategy Pattern by implementing a payment system with different payment methods (Credit Card and GPay).

## Project Structure

- `src/main/java/org/digital/nurture/PaymentStrategy.java` - Defines the PaymentStrategy interface.
- `src/main/java/org/digital/nurture/CreditCardPayment.java` - Concrete implementation of PaymentStrategy for Credit Card payments.
- `src/main/java/org/digital/nurture/GPayPayment.java` - Concrete implementation of PaymentStrategy for GPay payments.
- `src/main/java/org/digital/nurture/PaymentContext.java` - Context class to use the payment strategy.

- `src/test/java/org/digital/nurture/PaymentContextTest.java` - JUnit tests for verifying the payment strategies.

## Build and Run

1. Clone the repository.
2. Navigate to the project directory.
3. Run `./gradlew build` to build the project.
4. Run `./gradlew test` to execute the tests.

## Usage

- Create a `PaymentContext` object.
- Set the desired `PaymentStrategy` (e.g., `CreditCardPayment`, `GPayPayment`).
- Use `executePayment(int amount)` method to perform the payment.

## Example

```java
PaymentContext context = new PaymentContext();
context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
context.executePayment(100);
```

This setup ensures that we follow the Strategy Pattern effectively and our project is well-organized.