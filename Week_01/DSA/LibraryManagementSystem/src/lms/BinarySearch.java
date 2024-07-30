package lms;

import java.util.Arrays;

public class BinarySearch {
    public static Book findBookByTitle(Book[] books, String title) {
        // Sort books by title (assuming they are not sorted)
        Arrays.sort(books, (b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));

        int left = 0;
        int right = books.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = title.compareToIgnoreCase(books[mid].getTitle());

            if (result == 0) {
                return books[mid];
            }
            if (result < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return null; // Book not found
    }
}
