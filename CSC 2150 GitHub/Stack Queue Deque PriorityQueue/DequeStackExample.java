import java.util.Deque;
import java.util.ArrayDeque;

/*
    Deque key methods:
        addFirst(element)   --> adds an element to the head/top
        addLast(element)    --> adds an element to the tail/bottom
        removeFirst()         --> removes and returns the first element
        removeLast()          --> removes and returns the last element
        peekFirst()         --> Returns, but does not remove, the first element
        peekLast()          --> Returns, but does not remove, the last element
        size()              --> returns the number of elements in the deque
        isEmpty()           --> returns true if the deque is empty
 */

public class DequeStackExample {
    public static void main(String[] args) {
        // Step 1: Create a stack of Strings using Deque
        Deque<String> stack = new ArrayDeque<>();

        // Step 2: Push elements onto the stack
        System.out.println("Pushing elements onto the stack...");
        stack.addFirst("apple");
        stack.addFirst("banana");
        stack.addFirst("cherry");
        System.out.println("Stack after push: " + stack);

        // Step 3: Peek the top element
        System.out.println("Peeking the top element: " + stack.peekFirst());

        // Step 4: Pop elements from the stack
        System.out.println("Popping elements from the stack...");
        while (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.removeFirst());
            System.out.println("Stack after pop: " + stack);
        }
    }
}
