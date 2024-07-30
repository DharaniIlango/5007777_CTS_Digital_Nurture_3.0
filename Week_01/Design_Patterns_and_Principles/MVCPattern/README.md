# MVCPatternExample

This project demonstrates the implementation of the Model-View-Controller (MVC) design pattern using Java. It includes a simple web application for managing student records.

## Project Structure

- `src/main/java/org/digital/nurture/model/Student.java` - Model class representing a student.
- `src/main/java/org/digital/nurture/view/StudentView.java` - View class responsible for displaying student details.
- `src/main/java/org/digital/nurture/controller/StudentController.java` - Controller class that updates the model and interacts with the view.
- `src/main/java/org/digital/nurture/Main.java` - Entry point for demonstrating MVC functionality.

## Testing

- `src/test/java/org/digital/nurture/model/StudentTest.java` - Unit tests for the `Student` model class.
- `src/test/java/org/digital/nurture/view/StudentViewTest.java` - Unit tests for the `StudentView` class.
- `src/test/java/org/digital/nurture/controller/StudentControllerTest.java` - Unit tests for the `StudentController` class.

## How to Run

1. Ensure you have Java and Gradle installed.
2. Clone the repository.
3. Navigate to the project directory.
4. Run `./gradlew build` to build the project.
5. Run `java -cp build/classes/java/main org.digital.nurture.Main` to execute the application.