package lms;

public class Main {
    public static void main(String[] args) {
        // Creating a sample list of books
        Book[] books = {
            new Book(1, "The Catcher in the Rye", "J.D. Salinger"),
            new Book(2, "To Kill a Mockingbird", "Harper Lee"),
            new Book(3, "1984", "George Orwell"),
            new Book(4, "Moby Dick", "Herman Melville")
        };

        // Linear search example
        System.out.println("Linear Search:");
        Book foundBookLinear = LinearSearch.findBookByTitle(books, "1984");
        System.out.println(foundBookLinear != null ? foundBookLinear : "Book not found");

        // Binary search example
        System.out.println("\nBinary Search:");
        Book foundBookBinary = BinarySearch.findBookByTitle(books, "1984");
        System.out.println(foundBookBinary != null ? foundBookBinary : "Book not found");
    }
}
