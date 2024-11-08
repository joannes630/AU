// Node class for doubly linked list
class Node {
    int data;      // Value stored in the node
    Node next;     // Reference to the next node
    Node prev;     // Reference to the previous node

    // Constructor
    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

// DoublyLinkedList class
class DoublyLinkedList {
    Node head;     // Head of the linked list
    Node tail;     // Tail of the linked list

    // Constructor to create an empty list
    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        if (head == null)
            return true;
        else
            return false;
    }

    public int getSize() {
        int size = 0;
        Node current = head;

        while (current != null) {
            size++;
            current = current.next;
        }

        return size;
    }

    // Display all the elements in the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Add a new node at the beginning of the list
    public void prepend(int data) {
        Node newNode = new Node(data);

        // If the list is empty, make the new node both head and tail
        if (head == null) {
            head = tail = newNode;
        } else {
            // Insert the new node before the current head
            newNode.next = head;
            head.prev = newNode;
            head = newNode;  // Update head to the new node
        }
    }

    // Add a new node at the end of the list
    public void append(int data) {
        Node newNode = new Node(data);

        // If the list is empty, make the new node both head and tail
        if (head == null) {
            head = tail = newNode;
        } else {
            // Set the new node as the next of the tail and update its prev
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;  // Update tail to the new node
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

    // Delete the first node with the specified value
    public void delete(int data) {
        /* Scenarios:
         * 1. List is empty
         * 2. The node to delete is at the head
         * 3. The node to delete is at the tail
         * 4. The node to delete is in the middle
         */

        // If the list is empty, return
        if (head == null) {
            return;
        }

        // If the node to be deleted is the head
        if (head.data == data) {
            head = head.next;  // Move the head to the next node
            if (head != null) {
                head.prev = null;  // Update the prev reference of the new head
            } else {
                tail = null; // If head becomes null, tail should also be null
            }
            return;
        }

        // If the node to be deleted is the tail
        if (tail.data == data) {
            tail = tail.prev; // Move the tail to the previous node
            if (tail != null) {
                tail.next = null; // Update the next reference of the new tail
            } else {
                head = null; // If tail becomes null, head should also be null
            }
            return;
        }

        // Traverse the list to find the node to delete
        Node current = head;
        while (current != null && current.data != data) {
            current = current.next;
        }

        // If the node is found, update the links to remove it
        if (current != null) {
            if (current.next != null) {  // If it's not the last node
                current.next.prev = current.prev;
            }
            if (current.prev != null) {  // If it's not the first node
                current.prev.next = current.next;
            }
        }
    }
}

public class DoublyLinkedListExample2 {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        System.out.println("Adding elements to the list...");
        list.append(10);
        list.append(20);
        list.prepend(5);
        list.append(30);

        System.out.println("List after adding elements:");
        list.printList(); // Expected: 5 <-> 10 <-> 20 <-> 30 <-> null

        System.out.println("\nSize of the list: " + list.getSize()); // Expected: 4

        System.out.println("\nSearching for elements in the list...");
        System.out.println("Search for 20: " + list.search(20)); // Expected: true
        System.out.println("Search for 40: " + list.search(40)); // Expected: false

        System.out.println("\nDeleting elements from the list...");
        list.delete(5); // Delete head
        list.printList(); // Expected: 10 <-> 20 <-> 30 <-> null

        list.delete(30); // Delete tail
        list.printList(); // Expected: 10 <-> 20 <-> null

        list.delete(20); // Delete middle element
        list.printList(); // Expected: 10 <-> null

        System.out.println("\nDeleting the last element:");
        list.delete(10); // Delete remaining element
        list.printList(); // Expected: null

        System.out.println("\nIs the list empty? " + list.isEmpty()); // Expected: true
    }
}
