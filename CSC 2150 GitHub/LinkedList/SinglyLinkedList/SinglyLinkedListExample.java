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

// SinglyLinkedList class
class SinglyLinkedList {
    Node head;     // Head of the linked list

    // Constructor to create an empty list
    public SinglyLinkedList() {
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
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
    // Add a new node at the beginning of the list
    public void prepend(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // The new node points to the current head
        head = newNode;      // Update the head to the new node
    }
    
    // Add a new node at the end of the list
    public void append(int data) {
		/* Scenarios:
		 * 1. The list is empty
		 * 2. The list is not empty
		 */
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

    /* 
     * Write a method, `countIntances`, this method accepts one argument which
     * is an integer. It will count the number of instances this number
     * appears in the linked list an return the count.
     * */
    
    /* 
     * Write a method, `countDuplicates`, that will
     * count the number of nodes that contain a string value duplicated in 
     * the list. For example, if the strings A, C, D, E, C, C, E appeared in 
     * the list, then 3 would be returned, if the strings C, A, E, F, A 
     * appeared in the list nodes, then 1 would be returned, if strings, 
     * C, A, E, F appeared in the list nodes, then 0 would be returned, etc. 
     * Consider using another data structure to help count.
     * */
    
}

public class SinglyLinkedListExample {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        System.out.println("Is the linked list empty? " + list.isEmpty());
        System.out.println("The size is " + list.getSize());

        // Add elements to the list
        list.prepend(10);
        list.prepend(20);
        list.prepend(30);
        list.append(40);
        list.append(50);
        list.append(60);

        // Print the linked list
        list.printList(); // Output: 30->20->10->40->50->60->null
        System.out.println("Is the linked list empty? " + list.isEmpty());
        System.out.println("The size is " + list.getSize());
        
        // Search for a node
        System.out.println("Is 30 in the linked list? " + list.search(30));

        // Delete an element at the head
        list.delete(30);
        list.printList(); // Output: 20->10->40->50->60->null

        // Delete an element in the middle
        list.delete(40);
        list.printList(); // Output: 20->10->50->60->null

        // Delete an element at the tail
        list.delete(60);
        list.printList(); // Output: 20->10->50->null
    }
}
