# Financial Forecasting Tool

This project implements a financial forecasting tool using recursion in Java. The tool predicts future financial values based on an initial value, a growth rate, and a number of periods.

## Project Structure

The project is organized as follows:

- `src/financialforecast/FinancialForecast.java`: Contains the recursive method for calculating future values.
- `src/financialforecast/Main.java`: Contains the main method to demonstrate and test the forecasting functionality.
- `README.md`: This file, providing information about the project.

## Description

### FinancialForecast.java

This file defines a class `FinancialForecast` with a static method `calculateFutureValue` to compute future financial values using recursion. The method:

- **Parameters**:
  - `pastValue`: The initial value at the start of the forecast.
  - `growthRate`: The growth rate per period (expressed as a decimal).
  - `periods`: The number of periods over which to forecast the future value.
- **Returns**: The future value after the specified number of periods.

### Main.java

This file contains the `Main` class with a `main` method that demonstrates the use of the `calculateFutureValue` method. It initializes the parameters and prints the resulting future value to the console.

## How to Build and Run

1. **Compile the Java Files**

   Open a terminal or command prompt and navigate to the root directory of the project. Use the following command to compile the Java files:

   ```bash
   javac src/financialforecast/*.java
   ```
2. **Run the Application**

    Execute the compiled application using the following command:
    ```bash
    java financialforecast.Main

    ```
This will run the `Main` class, which demonstrates the financial forecasting functionality.

## Example Output
    When you run the application, you should see an output similar to:
    ```bash
    The future value after 10 periods is: 1647.01
    ```
    
    This output indicates the forecasted value after 10 periods, given an initial value and a growth rate.
