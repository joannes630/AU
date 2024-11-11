import java.util.Deque;
import java.util.ArrayDeque;

public class DequeStackExample {
    public static void main(String[] args) {
        // Step 1: Create a stack of Strings using Deque
        Deque<String> stack = new ArrayDeque<>();

        // Step 2: Push elements onto the stack
        System.out.println("Pushing elements onto the stack...");
        stack.push("apple");
        stack.push("banana");
        stack.push("cherry");
        System.out.println("Stack after push: " + stack);

        // Step 3: Peek the top element
        System.out.println("Peeking the top element: " + stack.peek());

        // Step 4: Pop elements from the stack
        System.out.println("Popping elements from the stack...");
        while (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.pop());
            System.out.println("Stack after pop: " + stack);
        }
    }
}
