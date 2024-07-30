package financialforecast;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Initial Value: ");
        double initialValue = scanner.nextDouble(); // Initial value
        System.out.print("Growth Rate: ");
        double growthRate = (scanner.nextDouble()/100);     // Growth rate in percentage(double)
        System.out.print("Time Period(in Months): ");
        int periods = scanner.nextInt();             // Forecast for specified periods
        double futureValue = FinancialForecast.calculateFutureValue(initialValue, growthRate, periods);
        System.out.printf("The future value after %d periods is: %.2f\n", periods, futureValue);
    }
}
