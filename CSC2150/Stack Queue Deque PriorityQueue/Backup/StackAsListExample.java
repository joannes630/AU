import java.util.List;
import java.util.Stack;

/*
    Stack key methods:
        push(element)       --> adds an element to the top of the stack
        pop()               --> removes and returns the top element
        peek()              --> returns the top element
        empty()             --> checks if the Stack is empty
        search()            --> returns the 1-based position of an element from the top, or -1 ir not found
 */

public class StackAsListExample {
    public static void main(String[] args) {
        List<String> stack = new Stack<>();

        // Push elements onto the stack
        stack.add("Apple");
        stack.add("Banana");
        stack.add("Cherry");

        // Peek at the top element
        System.out.println(stack);
        System.out.println("Top element: " + stack.get(stack.size() - 1)); // Output: Cherry

        // Pop the top element
        System.out.println("Popped element: " + stack.remove(stack.size() - 1)); // Output: Cherry
        System.out.println("Popped element: " + stack.remove(stack.size() - 1)); // Output: Banana
        System.out.println("Popped element: " + stack.remove(stack.size() - 1)); // Output: Apple

        // Search for an element
        System.out.println("Position of Banana: " + stack.contains("Banana")); // Output: false

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: true
    }
}