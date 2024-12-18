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
        minHeap.add(12);
        minHeap.add(20);
        minHeap.add(2);
        minHeap.add(11);
        minHeap.add(3);
        minHeap.add(5);
        minHeap.add(9);

        // Accessing the head element
        System.out.println("Head element: " + minHeap.poll()); // Output: 10 (smallest element)
        System.out.println("Head element: " + minHeap.peek());
    }
}