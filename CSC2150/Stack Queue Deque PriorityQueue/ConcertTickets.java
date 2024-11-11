import java.util.Deque;
import java.util.ArrayDeque;

/*
    Deque key methods:
        addFirst(element)   --> adds an element to the head/top
        addLast(element)    --> adds an element to the tail/bottom
        pollFirst()         --> removes and returns the first element
        pollLast()          --> removes and returns the last element
        peekFirst()         --> Returns, but does not remove, the first element
        peekLast()          --> Returns, but does not remove, the last element
        size()              --> returns the number of elements in the deque
        isEmpty()           --> returns true if the deque is empty
 */


public class ConcertTickets {
    public static void main(String[] args) {
        // Create a Deque to represent people in line for concert tickets
        Deque<String> ticketQueue = new ArrayDeque<>();
        int availableTickets = 3;

        // People joining the queue
        ticketQueue.addLast("Alice"); // Enqueue at the end
        ticketQueue.addLast("Bob");
        ticketQueue.addLast("Charlie");
        ticketQueue.addLast("Diana");
        ticketQueue.addLast("Edward");

        System.out.println("List of fans queued for a concert ticket: " + ticketQueue);

        // Process each person in the queue
        System.out.println("Processing ticket queue:");
        while (!ticketQueue.isEmpty() && availableTickets > 0) {
            // The person at the front of the line buys a ticket and leaves the queue
            String person = ticketQueue.removeFirst(); // Dequeue from the front
            System.out.println(person + " got a ticket.");
            availableTickets--;
        }

        System.out.println("Sorry, all tickets have been sold.");

        System.out.println("Fans who didn't get a ticket: " + ticketQueue);
    }
}
