package org.digital.nurture;

public class TestProxyPattern {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // Image will be loaded from the server
        image1.display();
        // Image will be loaded from the cache
        image1.display();

        // Image will be loaded from the server
        image2.display();
    }
}
