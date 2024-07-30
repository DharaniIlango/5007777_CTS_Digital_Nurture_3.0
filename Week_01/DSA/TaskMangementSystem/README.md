# Task Management System

## Description
This project implements a task management system using a singly linked list in Java, organized within the `tms` package. It allows for adding, searching, traversing, and deleting tasks.

## Files
- `src/tms/Task.java`: Defines the `Task` class with attributes like `taskId`, `taskName`, and `status`.
- `src/tms/Node.java`: Defines the `Node` class representing each node in the singly linked list.
- `src/tms/TaskManager.java`: Implements the singly linked list and provides methods to manage tasks.
- `src/tms/Main.java`: Contains the `main` method to test the functionality of the `TaskManager` class.

## Compiling and Running the Project

To compile and run the project, follow these steps:

1. **Navigate to the `src` directory:**

   ```bash
   cd task-management-system/src
    ```
2.**Compile the Java files:**  
    ```bash
    javac tms/*.java
    ```
3. **Run the `Main` class:**
    ```bash
    java tms.Main
    ```
    
## Usage
1. Create instances of `Task` with attributes.
2. Use `TaskManager` methods to manage tasks:
   - `addTask(Task task)`: Adds a task to the end of the list.
   - `searchTask(int taskId)`: Searches for a task by ID.
   - `traverseTasks()`: Prints all tasks.
   - `deleteTask(int taskId)`: Deletes a task by ID.

## Analysis
- **Add Task**: O(n)
- **Search Task**: O(n)
- **Traverse Tasks**: O(n)
- **Delete Task**: O(n)

Linked lists offer dynamic size and efficient insertions/deletions compared to arrays.
