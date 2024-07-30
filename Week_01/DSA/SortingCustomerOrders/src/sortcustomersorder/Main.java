package sortcustomersorder;

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(1, "Alice", 250.00),
            new Order(2, "Bob", 150.00),
            new Order(3, "Charlie", 300.00),
            new Order(4, "Diana", 200.00)
        };

        // Sort using BubbleSort
        Order[] bubbleSortedOrders = orders.clone();
        BubbleSort.sort(bubbleSortedOrders);
        System.out.println("Bubble Sort:");
        for (Order order : bubbleSortedOrders) {
            System.out.println(order);
        }

        // Sort using QuickSort
        Order[] quickSortedOrders = orders.clone();
        QuickSort.sort(quickSortedOrders, 0, quickSortedOrders.length - 1);
        System.out.println("Quick Sort:");
        for (Order order : quickSortedOrders) {
            System.out.println(order);
        }
    }
}
