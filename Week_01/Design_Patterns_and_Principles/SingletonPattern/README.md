# SingletonPatternExample

This project demonstrates the Singleton design pattern in Java using a `Logger` class to ensure consistent logging throughout the application lifecycle.

## Directory Structure

DESIGN_PATTERNS_AND_SINGLETON_EXAMPLE
├── .dist
├── .gradle
├── app
│ ├── src
│ │ ├── main
│ │ │ ├── java
│ │ │ │ └── org
│ │ │ │ └── digital
│ │ │ │ └── nurture
│ │ │ │ └── Logger.java
│ │ ├── test
│ │ ├── java
│ │ │ └── org
│ │ │ └── digital
│ │ │ └── nurture
│ │ │ └── LoggerTest.java
├── gradle
│ ├── wrapper
│ │ ├── gradle-wrapper.jar
│ │ ├── gradle-wrapper.properties
├── .gitattributes
├── .gitignore
├── gradlew
├── gradlew.bat
├── build.gradle
└── settings.gradle

## How to Build and Run

1. **Build the project:**

   ```sh
   ./gradlew build
   ```

2. **Run the tests:**

   ```sh
   ./gradlew test
   ```

## Singleton Pattern

The Singleton pattern ensures that a class has only one instance and provides a global point of access to it. This is implemented in the `Logger` class with a private constructor and a static method to get the instance.

## Logger Class

The `Logger` class provides a `log` method to log messages. It ensures only one instance of the class is created and used.

## LoggerTest Class

The `LoggerTest` class uses JUnit 5 to test the Singleton pattern implementation by verifying that only one instance of the `Logger` class is created and used.
