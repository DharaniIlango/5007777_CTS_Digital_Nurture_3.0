# CommandPatternExample

This project demonstrates the implementation of the Command Pattern in Java. The Command Pattern is a behavioral design pattern used to encapsulate all details of a request into a single object.

## Project Structure

- `src/main/java/org/digital/nurture/Command.java` - Interface defining the command.
- `src/main/java/org/digital/nurture/Light.java` - Receiver class that performs the actual operations.
- `src/main/java/org/digital/nurture/LightOnCommand.java` - Concrete command to turn on the light.
- `src/main/java/org/digital/nurture/LightOffCommand.java` - Concrete command to turn off the light.
- `src/main/java/org/digital/nurture/RemoteControl.java` - Invoker class that holds a command and triggers its execution.
- `src/main/java/org/digital/nurture/Main.java` - Main class to demonstrate the usage of the Command Pattern.
- `src/test/java/org/digital/nurture/CommandPatternTest.java` - Test class demonstrating the usage of commands.

## How to Run

1. Clone the repository.
2. Navigate to the project directory.
3. Run `gradle build` to build the project.
4. Run `gradle run` to execute the `Main` class and see the Command Pattern in action.
5. Run `gradle test` to execute the tests.

## Example Usage

1. `Light` class represents the device to be controlled.
2. `LightOnCommand` and `LightOffCommand` are concrete implementations of the `Command` interface.
3. `RemoteControl` is used to set and execute commands.
4. `Main` class demonstrates how to use these commands with a `RemoteControl`.