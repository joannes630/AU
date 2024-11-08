import java.util.PriorityQueue;
/*
    PriorityQueue key methods:
        add(element)        --> adds an element to the priority queue
        poll()              --> retrieves and removes the head of the queue
        peek()              --> returns the head of thie queue
 */

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Adding elements
        minHeap.add(30);
        minHeap.add(20);
        minHeap.add(10);

        // Displaying the elements based on priority
        System.out.println("PriorityQueue: " + minHeap); // Output may be unordered but head will have the lowest element

        // Accessing the head element
        System.out.println("Head element (peek): " + minHeap.peek()); // Output: 10 (smallest element)

        // Removing elements based on priority
        System.out.println("Removed element: " + minHeap.poll()); // Output: 10
        System.out.println("Removed element: " + minHeap.poll()); // Output: 20
    }
}