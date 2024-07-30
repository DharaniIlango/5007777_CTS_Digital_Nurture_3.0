# BuilderPatternExample

## Overview

This project demonstrates the use of the Builder Pattern in Java to manage the construction of complex objects. In this case, it constructs a `Computer` object with optional attributes like CPU, RAM, and Storage.

## Directory Structure

BuilderPatternExample/
│
├── build.gradle
├── settings.gradle
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/
│ │ │ └── example/
│ │ │ ├── Computer.java
│ │ │ └── Main.java
│ └── test/
│ ├── java/
│ │ └── com/
│ │ └── example/
│ │ └── ComputerTest.java
│
└── README.md

## Build Configuration

This project uses Gradle for build automation. The `build.gradle` file includes the following configurations:

- **Plugins**:

  - `application` plugin to support building a CLI application in Java.

- **Repositories**:

  - Maven Central is used for resolving dependencies.

- **Dependencies**:

  - `testImplementation` for JUnit Jupiter.
  - `testRuntimeOnly` for the JUnit Platform Launcher.
  - `implementation` for Guava library.

- **Java Toolchain**:

  - Java version 21 is specified for the project.

- **Application Configuration**:

  - The main class is set to `org.digital.nurture.App`.

- **Test Configuration**:
  - JUnit Platform is used for unit tests.

## How to Run

1. **Build the Project**:
   ```bash
   ./gradlew build
   ```
2. **Run the Application:**
   ```bash
   java -cp build/classes/java/main org.digital.nurture.Main
   ```
3. **Run the Tests:**
   ```bash
   ./gradlew test
   ```
4. **Run the Application:**
   ```bash
   ./gradlew run
   ```

### Example Output

When running the application, you should see the output of the `Main` class which demonstrates different configurations of `Computer`.
