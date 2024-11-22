import java.util.*;

// Class to represent a print job
class PrintJob {
    private String documentName;
    private int numberOfPages;
    private String priority;

    // Constructor
    public PrintJob(String documentName, int numberOfPages, String priority) {
        this.documentName = documentName;
        this.numberOfPages = numberOfPages;
        this.priority = priority;
    }

    // Getters
    public String getDocumentName() {
        return documentName;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Document: " + documentName + ", Pages: " + numberOfPages + ", Priority: " + priority;
    }
}

public class PrintQueueSystem {
    public static void main(String[] args) {
        Deque<PrintJob> printQueue = new ArrayDeque<>(); // Deque for print jobs

        // Add print jobs
        addPrintJob(printQueue, new PrintJob("Report.pdf", 10, "regular"), false);
        addPrintJob(printQueue, new PrintJob("Urgent_Memo.docx", 2, "urgent"), true);
        addPrintJob(printQueue, new PrintJob("Presentation.pptx", 20, "regular"), false);

        // Display the queue
        System.out.println("Current Print Queue:");
        printQueue.forEach(System.out::println);

        // Cancel the most recent job
        cancelLastPrintJob(printQueue);

        // Display the updated queue
        System.out.println("\nUpdated Print Queue:");
        printQueue.forEach(System.out::println);
    }

    // Method to add a print job
    public static void addPrintJob(Deque<PrintJob> queue, PrintJob job, boolean isUrgent) {
        if (isUrgent) {
            queue.addFirst(job); // Add to the front for urgent jobs
        } else {
            queue.addLast(job); // Add to the back for regular jobs
        }
        System.out.println("Added: " + job);
    }

    // Method to cancel the most recent print job
    public static void cancelLastPrintJob(Deque<PrintJob> queue) {
        if (!queue.isEmpty()) {
            PrintJob cancelledJob = queue.pollLast(); // Remove the last added job
            System.out.println("Cancelled: " + cancelledJob);
        } else {
            System.out.println("The print queue is empty. No job to cancel.");
        }
    }
}
