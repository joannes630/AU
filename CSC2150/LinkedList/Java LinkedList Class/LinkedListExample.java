import java.util.LinkedList;

/*
    LinkedList popular methods:
        add(element)        --> inserts an element at the end
        addFirst(element)   --> inserts an element at the beginning
        addLast(element)    --> inserts an element at the end
        remove()            --> retrieves and removes the first element
        removeFirst()       --> retrieves and removes the first element
        removeLast()        --> retrieves and removes the last element
        get(index)          --> retrieves the element at the specified index
        getFirst()          --> retrieve the first element
        getLast()           --> retrieve the last element
 */

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.addFirst("Grapes");
        list.addLast("Orange");

        // Accessing elements
        System.out.println("First element: " + list.getFirst()); // Output: Grapes
        System.out.println("Last element: " + list.getLast());   // Output: Orange

        // Removing elements
        list.removeFirst(); // Removes "Grapes"
        list.removeLast();  // Removes "Orange"

        // Printing the final list
        System.out.println("LinkedList: " + list); // Output: [Apple, Banana]
    }
}