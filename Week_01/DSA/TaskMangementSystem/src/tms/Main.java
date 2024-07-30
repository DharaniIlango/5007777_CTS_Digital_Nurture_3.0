package tms;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        // Adding tasks
        manager.addTask(new Task(1, "Task 1", "Pending"));
        manager.addTask(new Task(2, "Task 2", "In Progress"));
        
        // Traversing tasks
        manager.traverseTasks();

        // Searching for a task
        Task task = manager.searchTask(1);
        if (task != null) {
            System.out.println("Found: " + task);
        }

        // Deleting a task
        manager.deleteTask(1);
        manager.traverseTasks();
    }
}
