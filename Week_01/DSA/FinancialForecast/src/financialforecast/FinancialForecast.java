package financialforecast;

public class FinancialForecast {

    /**
     * Calculates the future value based on past value, growth rate, and number of periods.
     * 
     * @param pastValue  The initial value
     * @param growthRate The growth rate per period
     * @param periods    The number of periods to forecast
     * @return The future value
     */
    public static double calculateFutureValue(double pastValue, double growthRate, int periods) {
        // Base case: If no periods left, return the past value
        if (periods == 0) {
            return pastValue;
        }
        // Recursive case: Calculate future value for the next period
        return calculateFutureValue(pastValue * (1 + growthRate), growthRate, periods - 1);
    }
}
