package org.digital.nurture;

import org.junit.jupiter.api.Test;

public class ProxyPatternTest {

    @Test
    public void testProxyImage() {
        Image image1 = new ProxyImage("test_image1.jpg");
        Image image2 = new ProxyImage("test_image2.jpg");

        image1.display();  // Should load from server and display
        image1.display();  // Should display from cache

        image2.display();  // Should load from server and display
    }
}
