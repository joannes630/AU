import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo1 {
    public static void main(String[] args) {
        // Create a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Enqueue (add) elements to the queue
        queue.add("Element 1");
        queue.add("Element 2");
        queue.add("Element 3");

        // Display the elements in the queue
        displayQueue(queue);

        // Dequeue (remove) elements from the front
        System.out.println("Dequeued " + queue.remove());
        System.out.println("Dequeued " + queue.remove());

        // Display the updated queue
        displayQueue(queue);

        // Enqueue more elements
        queue.add("Element 4");
        queue.add("Element 5");

        // Display the updated queue
        displayQueue(queue);
    }

    // Display the elements in the queue
    private static void displayQueue(Queue<String> queue) {
        System.out.println("Elements in the queue: " + queue);
    }
}
