# Decorator Pattern Example

This project demonstrates the use of the Decorator Pattern in Java. The Decorator Pattern allows you to dynamically add functionalities to objects. In this example, a notification system is implemented where notifications can be sent via multiple channels (Email, SMS, Slack) using decorators.

## Project Structure

- `src/main/java/com/example/`

  - `MainApp.java`: The main class demonstrating the Decorator Pattern.
  - `NotificationTest.java`: A test class for demonstrating the pattern (can be used for testing or demonstration).
  - `Notifier.java`: The component interface.
  - `EmailNotifier.java`: Concrete implementation of `Notifier` for email notifications.
  - `NotifierDecorator.java`: Abstract decorator class that implements `Notifier` and holds a reference to a `Notifier` object.
  - `SMSNotifierDecorator.java`: Concrete decorator class for adding SMS notification functionality.
  - `SlackNotifierDecorator.java`: Concrete decorator class for adding Slack notification functionality.

- `src/test/java/com/example/`
  - `DecoratorPatternTest.java`: Unit tests for verifying the behavior of decorators.

## Build and Run

1. **Build the Project**
   Build the project to compile the source code:
   ```sh
   ./gradlew build
   ```
2. **Run the Application:**
   Run the application to demonstrate the use of the Decorator Pattern:
   ```sh
   ./gradlew run
   ```

## Class Details

### `Notifier.java`

The `Notifier` interface with a method `send()` that needs to be implemented by concrete notifiers.

### `EmailNotifier.java`

Concrete implementation of `Notifier` that sends notifications via email.

### `NotifierDecorator.java`

Abstract decorator class that implements `Notifier` and contains a reference to a `Notifier` object. It is used to extend functionalities of concrete notifiers.

### `SMSNotifierDecorator.java`

Concrete decorator that adds SMS notification functionality to an existing `Notifier`.

### `SlackNotifierDecorator.java`

Concrete decorator that adds Slack notification functionality to an existing `Notifier`.

### `MainApp.java`

Main application class demonstrating how to use decorators to send notifications through multiple channels.

### `DecoratorPatternTest.java`

Unit tests for verifying the behavior of the decorators.

## Dependencies

- **JUnit**: For testing.
- **Guava**: Provides utility libraries for Java.

## Usage

1. **Add your own decorators**: Extend the `NotifierDecorator` class to add more functionalities.
2. **Modify notification channels**: Implement other `Notifier` implementations to support additional channels.
