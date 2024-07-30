# DependencyInjectionExample

This project demonstrates the use of Dependency Injection in Java. It consists of a simple customer management application where the service class depends on a repository class.

## Project Structure

- **src/main/java/org/digital/nurture/**

  - `CustomerRepository.java` - Interface for customer repository
  - `CustomerRepositoryImpl.java` - Implementation of the customer repository
  - `CustomerService.java` - Service class that depends on `CustomerRepository`
  - `Main.java` - Main class demonstrating dependency injection
  - `Customer.java` - Customer class for holding customer data

- **src/test/java/org/digital/nurture/**
  - `CustomerServiceTest.java` - Unit test for `CustomerService`

## Dependencies

- JUnit Jupiter for testing

## How to Run

1. Build the project using Gradle:

   ```sh
   ./gradlew build
   ```

2. Run the Application:
   ```sh
   ./gradlew run
   ```
3. Run the Tests:
   ```sh
   ./gradlew test
   ```
