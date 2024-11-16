import java.util.ArrayDeque;
import java.util.Deque;

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

public class DequeAsStack {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.addFirst(1);
        stack.addFirst(2);
        stack.addFirst(3);

        System.out.println(stack.removeFirst()); // Output: 3
        System.out.println(stack.removeFirst()); // Output: 2
        System.out.println(stack.removeFirst()); // Output: 1
    }
}