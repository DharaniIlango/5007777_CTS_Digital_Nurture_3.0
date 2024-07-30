# FactoryMethodPatternExample

This project demonstrates the implementation of the Factory Method Pattern in Java for a document management system.

## Project Structure

- `src/main/java/org/digital/nurture/document/` - Contains interfaces and concrete classes for different document types.
- `src/main/java/org/digital/nurture/factory/` - Contains abstract and concrete factory classes for creating documents.
- `src/test/java/org/digital/nurture/MainTest.java` - Contains the main class to test the Factory Method implementation.

## How to Run

1. **Clone the repository:**

   ```bash
   git clone <repository-url>
   cd FactoryMethodPatternExample
   ```

2. **Build the Project:**
   ```bash
   ./gradlew build
   ```
3. **Run the Tests:**
   ```bash
   ./gradlew test
   ```
4. **Run the `MainTest` Class:**
   You can run the `MainTest` class using your preferred IDE or with the following command:
   ```bash
   ./gradlew run
   ```

### Design Pattern Used

The project uses the Factory Method Pattern to create different types of documents (`WordDocument`, `PdfDocument`, `ExcelDocument`) through a common interface (`Document`) and factory classes.
