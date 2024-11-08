import java.util.LinkedList;
import java.util.Queue;

/*
    Queue key methods:
        add(element)        --> adds an element to the end of the queue
        remove()            --> removes and returns the front element
        peek()              --> returns the front element
        isEmpty()           --> checks if the Stack is empty
 */

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue elements
        queue.add(20);
        queue.add(10);
        queue.add(30);

        // Peek at the front element
        System.out.println("Front element: " + queue.peek()); // Output: 10

        // Dequeue the front element
        System.out.println("Removed element: " + queue.remove()); // Output: 10

        // Check if the queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty()); // Output: false
    }
}
