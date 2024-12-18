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

    // Constructor to create an empty list
    public DoublyLinkedList() {
        head = null;
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

        // If the list is empty, make the new node the head
        if (head == null) {
            head = newNode;
            return;
        }

        // Insert the new node before the current head
        newNode.next = head;
        head.prev = newNode;
        head = newNode;  // Update head to the new node
    }

    // Add a new node at the end of the list
    public void append(int data) {
        Node newNode = new Node(data);

        // If the list is empty, make the new node the head
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to the end of the list
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        // Set the new node as the next of the last node and update its prev
        current.next = newNode;
        newNode.prev = current;
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
         * 3. The node to delete is in the middle or end
         * 4. The node to delete is not in the list
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
            if (current.prev != null) {
                current.prev.next = current.next;
            }
        }
    }
}

public class DoublyLinkedListExample {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // Add elements to the list
        list.append(10);
        list.append(20);
        list.append(30);
        list.prepend(5);

        // Print the linked list
        System.out.println("List in forward order:");
        list.printList(); // Output: 5 <-> 10 <-> 20 <-> 30 <-> null

        // Delete an element
        list.delete(20);

        // Search for an item in the linked list
        System.out.println("Is the value 30 in the list? " + list.search(30));

        // Print the linked list after deletion
        System.out.println("List after deleting 20:");
        list.printList(); // Output: 5 <-> 10 <-> 30 <-> null
    }
}
