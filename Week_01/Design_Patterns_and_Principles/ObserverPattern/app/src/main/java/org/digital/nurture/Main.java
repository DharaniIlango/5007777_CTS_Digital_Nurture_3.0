package org.digital.nurture;

public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();
        MobileApp mobileApp = new MobileApp();
        WebApp webApp = new WebApp();

        stockMarket.register(mobileApp);
        stockMarket.register(webApp);

        stockMarket.setStockPrice(100.00);
        stockMarket.setStockPrice(105.50);
    }
}
