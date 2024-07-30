# ProxyPatternExample

This project demonstrates the Proxy Design Pattern implemented in Java. The Proxy Pattern is used to provide a surrogate or placeholder for another object to control access to it. In this example, we use the Proxy Pattern to add lazy initialization and caching to an image viewer application.

## Project Structure

- `src/main/java/org/digital/nurture/example/`:

  - `Image.java`: Interface defining the subject.
  - `RealImage.java`: Real subject class that loads images from a remote server.
  - `ProxyImage.java`: Proxy class that manages lazy initialization and caching.
  - `TestProxyPattern.java`: Main class to test the Proxy Pattern implementation.

- `src/test/java/org/digital/nurture/`:
  - `ProxyPatternTest.java`: JUnit test class for the Proxy Pattern.

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/ProxyPatternExample.git
   ```
2. Navigate to the project directory:
   ```bash
   cd ProxyPatternExample
   ```
3. Build the project using Gradle:
   ```bash
   ./gradlew build
   ```
4. Run the main class to see the Proxy Pattern in action:
   ```bash
   ./gradlew run
   ```
5. Run Tests:
   `bash
 ./gradlew test
 `
   Explanation

---

- **`RealImage`**: Loads the image from the remote server and displays it.
- **`ProxyImage`**: Manages the loading and caching of images. It initializes the `RealImage` only when necessary (lazy initialization).
- **`TestProxyPattern`**: Demonstrates how the proxy pattern works with the image loading and caching.