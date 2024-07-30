# Search Algorithms

## 1. Understand Search Algorithms

### Linear Search

Linear search is a simple algorithm that checks each element in a list sequentially until the desired element is found or the end of the list is reached. It works on both sorted and unsorted lists.

**Algorithm:**

1. Start at the beginning of the list.
2. Compare the current element with the target element.
3. If a match is found, return the index of the element.
4. If the end of the list is reached without finding a match, return a failure indication (e.g., `-1`).

**Example Code:**

```java
public class LinearSearch {
    public static int findElement(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1; // Element not found
    }
}
```

### Binary Search

Binary search is a more efficient algorithm that works on sorted lists by repeatedly dividing the search interval in half. It requires that the list be sorted prior to searching.

**Algorithm:**

1. Set initial search boundaries (low and high) to the start and end of the list.
2. Calculate the middle index of the current search range.
3. Compare the middle element with the target element.
4. If the middle element is the target, return the index.
5. If the target is less than the middle element, adjust the search range to the lower half.
6. If the target is greater, adjust the search range to the upper half.
7. Repeat until the target is found or the search range is empty.

**Example Code:**

```java
public class BinarySearch {
    public static int findElement(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // Element not found
    }
}
```

## 2. Analysis

### Time Complexity Comparison

1. **Linear Search:**

   - **Time Complexity:** O(n)
   - **Explanation:** In the worst-case scenario, every element in the list must be checked, so the time complexity is linear with respect to the number of elements.

2. **Binary Search:**
   - **Time Complexity:** O(log n)
   - **Explanation:** Binary search divides the search space in half with each iteration, resulting in a logarithmic time complexity.

### When to Use

1. **Linear Search:**

   - **When to Use:**
     - When the list is unsorted.
     - When the list is small, and the overhead of sorting for binary search is not justified.
   - **Advantages:**
     - Simple to implement.
     - Does not require sorted data.
   - **Disadvantages:**
     - Less efficient for large lists due to linear time complexity.

2. **Binary Search:**
   - **When to Use:**
     - When the list is sorted, or when sorting the list is feasible.
     - When the list is large, and efficient search performance is needed.
   - **Advantages:**
     - More efficient with large datasets due to logarithmic time complexity.
   - **Disadvantages:**
     - Requires the list to be sorted.
     - More complex to implement compared to linear search.

### Conclusion

- Linear Search is suitable for small or unsorted lists due to its simplicity.
- Binary Search is preferred for large, sorted lists due to its efficiency.
