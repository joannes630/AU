import java.util.Deque;
import java.util.ArrayDeque;

/*
    Deque key methods:
        addFirst(element)   --> adds an element to the head/top
        addLast(element)    --> adds an element to the tail/bottom
        removeFirst()         --> removes and returns the first element
        removeLast()          --> removes and returns the last element
        peekFirst()         --> Returns, but does not remove, the first element
        peekLast()          --> Returns, but does not remove, the last element
        size()              --> returns the number of elements in the deque
        isEmpty()           --> returns true if the deque is empty
 */

public class DequeQueueExample {
    public static void main(String[] args) {
        // Step 1: Create a queue of Strings using Deque
        Deque<String> queue = new ArrayDeque<>();

        // Step 2: Enqueue elements into the queue
        System.out.println("Enqueueing elements into the queue...");
        queue.addLast("apple"); // Add element to the end
        queue.addLast("banana");
        queue.addLast("cherry");
        System.out.println("Queue after enqueue: " + queue);

        // Step 3: Peek at the front element
        System.out.println("Peeking at the front element: " + queue.peekFirst());

        // Step 4: Dequeue elements from the front of the queue
        System.out.println("Dequeuing elements from the queue...");
        while (!queue.isEmpty()) {
            System.out.println("Dequeued element: " + queue.removeFirst());
            System.out.println("Queue after dequeue: " + queue);
        }
    }
}
