package org.digital.nurture;

import org.junit.jupiter.api.Test;

public class StockMarketTest {

    @Test
    public void testObserverPattern() {
        StockMarket stockMarket = new StockMarket();
        MobileApp mobileApp = new MobileApp();
        WebApp webApp = new WebApp();

        stockMarket.register(mobileApp);
        stockMarket.register(webApp);

        stockMarket.setStockPrice(100.00);
        stockMarket.setStockPrice(105.50);
    }
}
