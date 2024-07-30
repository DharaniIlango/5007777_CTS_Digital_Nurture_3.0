package inventorymanagementsystem;

import java.util.Scanner;
import java.util.HashMap;

public class Inventory {
    private HashMap<String, Product> products;

    public Inventory() {
        products = new HashMap<>();
    }

    // Add a new product
    public void addProduct(Product product) {
        if (products.containsKey(product.getProductId())) {
            System.out.println("Product with this ID already exists.");
        } else {
            products.put(product.getProductId(), product);
            System.out.println("Product added successfully.");
        }
    }

    // Update an existing product
    public void updateProduct(Product product) {
        if (products.containsKey(product.getProductId())) {
            products.put(product.getProductId(), product);
            System.out.println("Product updated successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    // Delete a product
    public void deleteProduct(String productId) {
        if (products.containsKey(productId)) {
            products.remove(productId);
            System.out.println("Product deleted successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    // Display all products
    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("No products in the inventory.");
        } else {
            for (Product product : products.values()) {
                System.out.println(product);
            }
        }
    }

    private Product inputProduct(Scanner scanner, String action) {
        System.out.print("Enter Product ID: ");
        String productId = scanner.nextLine();
        System.out.print("Enter Product Name: ");
        String productName = scanner.nextLine();
        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        return new Product(productId, productName, quantity, price);
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nInventory Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Display Products");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice ;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                continue;
            }

            switch (choice) {
                case 1:
                    inventory.addProduct(inventory.inputProduct(scanner, "Add"));
                    break;
                case 2:
                    inventory.updateProduct(inventory.inputProduct(scanner, "Update"));
                    break;
                case 3:
                    System.out.print("Enter Product ID to delete: ");
                    String deleteProductId = scanner.nextLine();
                    inventory.deleteProduct(deleteProductId);
                    break;
                case 4:
                    inventory.displayProducts();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
