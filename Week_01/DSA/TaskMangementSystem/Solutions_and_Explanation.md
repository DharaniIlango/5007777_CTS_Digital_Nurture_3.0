# Linked Lists

## 1. Understand Linked Lists

### Singly Linked List
A singly linked list is a type of linked list where each node contains a single link field pointing to the next node in the sequence. The list is traversed in a single direction (from the head to the end). Each node consists of:
- **Data**: The value or object stored in the node.
- **Next**: A reference to the next node in the list.

**Structure:**
[Data | Next] -> [Data | Next] -> [Data | Next] -> NULL

### Doubly Linked List
A doubly linked list is a type of linked list where each node contains two link fields: one pointing to the next node and one pointing to the previous node. This allows traversal in both directions (forward and backward). Each node consists of:
- **Data**: The value or object stored in the node.
- **Next**: A reference to the next node in the list.
- **Prev**: A reference to the previous node in the list.

**Structure:**
NULL <- [Prev | Data | Next] <-> [Prev | Data | Next] <-> [Prev | Data | Next] -> NULL

## 2. Analysis

### Time Complexity of Each Operation

- **Add Task (Singly Linked List)**:
  - **At the end**: O(n) - Requires traversing the list to find the end.
  - **At the beginning**: O(1) - Directly inserted at the head.

- **Search Task**: O(n) - Requires traversing the list to find the task by ID.

- **Traverse Tasks**: O(n) - Requires iterating through all nodes in the list.

- **Delete Task**: O(n) - Requires traversing the list to find the task and its previous node for removal.

### Advantages of Linked Lists Over Arrays

- **Dynamic Size**: Linked lists can grow or shrink dynamically, unlike arrays that have a fixed size. This flexibility allows efficient memory utilization.

- **Efficient Insertions/Deletions**: Adding or removing elements in the middle of a linked list does not require shifting elements as in an array. This makes insertions and deletions more efficient, especially in large datasets.

- **No Wasted Space**: Arrays may waste space if the allocated size is larger than needed. Linked lists use memory only for the actual elements, avoiding the overhead of unused space.

- **Memory Efficiency**: Linked lists use additional memory for pointers, but they avoid the overhead of resizing operations, which can be costly for arrays when elements are added or removed frequently.
