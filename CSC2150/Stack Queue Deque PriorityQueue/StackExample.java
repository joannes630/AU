import java.util.Stack;

/*
    Stack key methods:
        push(element)       --> adds an element to the top of the stack
        pop()               --> removes and returns the top element
        peek()              --> returns the top element
        empty()             --> checks if the Stack is empty
        search()            --> returns the 1-based position of an element from the top, or -1 ir not found
 */

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Push elements onto the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        // Peek at the top element
        System.out.println("Top element: " + stack.peek()); // Output: Cherry

        // Pop the top element
        System.out.println("Popped element: " + stack.pop()); // Output: Cherry

        // Search for an element
        System.out.println("Position of Banana: " + stack.search("Banana")); // Output: 1

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.empty()); // Output: false
    }
}