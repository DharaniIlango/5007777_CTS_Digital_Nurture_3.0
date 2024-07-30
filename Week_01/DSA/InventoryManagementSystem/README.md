# Inventory Management System

## Description

This is a simple and efficient Inventory Management System implemented in Java. It allows users to add, update, delete, and display products in a warehouse inventory through a command-line interface. The system utilizes a `HashMap` to store products, ensuring efficient data storage and retrieval.

## Features

- **Add Product:** Add a new product to the inventory.
- **Update Product:** Update details of an existing product.
- **Delete Product:** Remove a product from the inventory.
- **Display Products:** View all products in the inventory.

## Usage

1. **Add Product:**

   - Enter product details such as ID, name, quantity, and price.

2. **Update Product:**

   - Enter the product ID of the product to be updated and provide the new details.

3. **Delete Product:**

   - Enter the product ID of the product to be deleted.

4. **Display Products:**
   - View the list of all products currently in the inventory.

## Analysis

### Time Complexity

1. **Add Product:**

   - **Operation:** Adding a product to the `HashMap`.
   - **Time Complexity:** O(1) on average.

2. **Update Product:**

   - **Operation:** Updating a product in the `HashMap`.
   - **Time Complexity:** O(1) on average.

3. **Delete Product:**

   - **Operation:** Deleting a product from the `HashMap`.
   - **Time Complexity:** O(1) on average.

4. **Display Products:**
   - **Operation:** Displaying all products in the `HashMap`.
   - **Time Complexity:** O(n), where n is the number of products.

### Optimizations

1. **Initial Capacity and Load Factor:**

   - Set an appropriate initial capacity and load factor for the `HashMap` to reduce resizing operations.

2. **Concurrency:**

   - Use `ConcurrentHashMap` for multi-threaded environments to provide thread-safe operations without external synchronization.

3. **Input Validation:**
   - Validate input data before performing operations to prevent unnecessary operations and potential errors.

## How to Run

1. Clone the repository or download the source code.
2. Open the project in your preferred Java IDE.
3. Compile and run the `Inventory` class.
4. Follow the on-screen instructions to interact with the system.

## Example

```plaintext
Inventory Management System
1. Add Product
2. Update Product
3. Delete Product
4. Display Products
5. Exit
Enter your choice: 1
Enter Product ID: 1
Enter Product Name: Product1
Enter Quantity: 10
Enter Price: 100.0
Product added successfully.

Inventory Management System
1. Add Product
2. Update Product
3. Delete Product
4. Display Products
5. Exit
Enter your choice: 4
Product [productId=1, productName=Product1, quantity=10, price=100.0]
```
