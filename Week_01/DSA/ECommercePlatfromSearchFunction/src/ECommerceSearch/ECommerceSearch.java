package ECommerceSearch;

import ECommerceSearch.model.Product;
import ECommerceSearch.search.LinearSearch;
import ECommerceSearch.search.BinarySearch;
import java.util.Arrays;

public class ECommerceSearch {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Smartphone", "Electronics"),
            new Product(3, "Desk", "Furniture"),
            new Product(4, "Chair", "Furniture"),
            new Product(5, "Headphones", "Electronics")
        };

        // Example: Linear Search
        System.out.println("Linear Search:");
        Product foundProduct = LinearSearch.linearSearch(products, "Chair");
        if (foundProduct != null) {
            System.out.println("Product found: " + foundProduct);
        } else {
            System.out.println("Product not found.");
        }

        // Sort the products array for binary search
        Arrays.sort(products, (p1, p2) -> p1.getProductName().compareTo(p2.getProductName()));

        // Example: Binary Search
        System.out.println("Binary Search:");
        foundProduct = BinarySearch.binarySearch(products, "Chair");
        if (foundProduct != null) {
            System.out.println("Product found: " + foundProduct);
        } else {
            System.out.println("Product not found.");
        }
    }
}
