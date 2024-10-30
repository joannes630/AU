package LinkedList;

// Node class for singly linked list
class Node {
    int data;      // Value stored in the node
    Node next;     // Reference to the next node

    // Constructor
    public Node(int data) {
        this.data = data;
        this.next = null; // Initially, the next node is null
    }
}

// LinkedList class
class LinkedList {
    Node head;     // Head of the linked list

    // Constructor to create an empty list
    public LinkedList() {
        head = null;
    }

    // Add a new node at the end of the list
    public void append(int data) {
        // Create a new node
        Node newNode = new Node(data);

        // If the list is empty, make the new node the head
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to the end of the list and add the new node
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Add a new node at the beginning of the list
    public void prepend(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // The new node points to the current head
        head = newNode;      // Update the head to the new node
    }

    // Delete the first node with the specified value
    public void delete(int data) {
        // If the list is empty, return
        if (head == null) {
            return;
        }

        // If the node to be deleted is the head
        if (head.data == data) {
            head = head.next; // Move the head to the next node
            return;
        }

        // Traverse the list to find the node to delete
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        // If the node is found, skip over it
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    // Method to search for a value in the list
    public boolean search(int data) {
        Node current = head;

        // Traverse through the list
        while (current != null) {
            if (current.data == data) {
                return true;  // Value found
            }
            current = current.next;
        }

        return false;  // Value not found
    }

    // Display all the elements in the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Add elements to the list
        list.append(10);
        list.append(20);
        list.append(30);
        list.prepend(5);

        // Print the linked list
        list.printList(); // Output: 5 -> 10 -> 20 -> 30 -> null

        // Delete an element
        list.delete(20);

        // Search for an item in the linked list
        System.out.println("Is the value 30 in the list? " + list.search(30));

        list.printList(); // Output: 5 -> 10 -> 30 -> null
    }
}
