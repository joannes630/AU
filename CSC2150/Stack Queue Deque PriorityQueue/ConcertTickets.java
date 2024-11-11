import java.util.Deque;
import java.util.ArrayDeque;

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
