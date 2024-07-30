package org.digital.nurture;

public class WebApp implements Observer {
    private double stockPrice;

    @Override
    public void update(double stockPrice) {
        this.stockPrice = stockPrice;
        System.out.println("WebApp: Stock price updated to " + stockPrice);
    }
}
