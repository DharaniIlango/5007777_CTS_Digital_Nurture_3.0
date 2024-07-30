package org.digital.nurture;

public class MobileApp implements Observer {
    private double stockPrice;

    @Override
    public void update(double stockPrice) {
        this.stockPrice = stockPrice;
        System.out.println("MobileApp: Stock price updated to " + stockPrice);
    }
}
