# AdapterPatternExample

This project demonstrates the implementation of the Adapter Pattern in Java. The Adapter Pattern is used to integrate multiple third-party payment gateways with different interfaces into a unified interface.

## Directory Structure

AdapterPatternExample/
├── build/
│ ├── classes/
│ ├── dependency-locks/
│ ├── libs/
│ └── reports/
├── gradle/
│ └── wrapper/
├── src/
│ ├── main/
│ │ └── java/
│ │ └── org/
│ │ └── digital/
│ │ └── nurture/
│ │ ├── adapter/
│ │ └── App.java
│ └── test/
│ └── java/
│ └── org/
│ └── digital/
│ └── nurture/
│ └── adapter/
│ └── PaymentProcessorTest.java
├── .gitignore
├── build.gradle
└── settings.gradle


## Files

- **PaymentProcessor.java**: Target interface for payment processing.
- **GPayPaymentProcessor.java**: Adaptee class for GPay payment processing.
- **PaytmPaymentProcessor.java**: Adaptee class for Paytm payment processing.
- **GPayAdapter.java**: Adapter for integrating GPay payment processing with the target interface.
- **PaytmAdapter.java**: Adapter for integrating Paytm payment processing with the target interface.
- **App.java**: Main class demonstrating the use of different payment gateways through the adapter.
- **PaymentProcessorTest.java**: Unit test class for verifying the payment processing.

## How to Run

1. Ensure you have Gradle installed. If not, follow the [Gradle installation instructions](https://gradle.org/install/).
2. Navigate to the project directory.
3. Build the project using Gradle:

    ```bash
    gradle build
    ```

4. Run the main class:

    ```bash
    gradle run
    ```

5. Run the tests:

    ```bash
    gradle test
    ```

You should see output demonstrating payments being processed through GPay and Paytm. The test class will execute the payment processing logic to ensure it works correctly.
