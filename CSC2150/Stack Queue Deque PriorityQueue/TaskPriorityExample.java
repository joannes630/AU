import java.util.PriorityQueue;

class Task implements Comparable<Task> {
    String name;
    int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority); // Min-heap based on priority
    }

    @Override
    public String toString() {
        return "Task{name='" + name + "', priority=" + priority + "}";
    }
}

public class TaskPriorityExample {
    public static void main(String[] args) {
        // Create a priority queue of tasks
        PriorityQueue<Task> taskQueue = new PriorityQueue<>();

        // Add tasks to the queue
        taskQueue.add(new Task("Task1", 3));
        taskQueue.add(new Task("Task2", 1));
        taskQueue.add(new Task("Task3", 4));
        taskQueue.add(new Task("Task4", 2));
        taskQueue.add(new Task("Task5", 5));

        // Process and print each task
        System.out.println("Processing tasks in priority order:");
        while (!taskQueue.isEmpty()) {
            System.out.println(taskQueue.poll()); // Removes and prints the highest priority task
        }

    }
}
