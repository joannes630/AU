import java.util.PriorityQueue;
import java.util.Collections;

/*
    PriorityQueue key methods:
        add(element)        --> adds an element to the priority queue
        poll()              --> retrieves and removes the head of the queue
        peek()              --> returns the head of thie queue
 */

public class MaxHeapExample {
    public static void main(String[] args) {
        // Create a PriorityQueue with a custom Comparator for max-heap behavior
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        // To change to min heap, remove the argument in the constructor

        // Adding elements to the max-heap
        maxHeap.add(10);
        maxHeap.add(1);
        maxHeap.add(30);
        maxHeap.add(5);
        maxHeap.add(20);
        maxHeap.add(3);

        // Print the elements in the max-heap order (by removing them)
        while (!maxHeap.isEmpty()) {
            System.out.println("The heap is " + maxHeap);
            System.out.println("The top of the heap is: " + maxHeap.poll()); // Removes and prints the largest element
        }
    }
}
