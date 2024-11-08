import java.util.ArrayDeque;
import java.util.Deque;

/*
    Deque key methods:
        addFirst(element)   --> adds an element to the head/top
        addLast(element)    --> adds an element to the tail/bottom
        pollFirst()         --> removes and returns the first element
        pollLast()          --> removes and returns the last element
        peekFirst()         --> Returns, but does not remove, the first element
        peekLast()          --> Returns, but does not remove, the last element
        size()              --> returns the number of elements in the deque
        isEmpty()           --> returns true if the deque is empty
 */

public class DequeAsQueue {
    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();

        queue.addLast(1);
        queue.addLast(2);
        queue.addLast(3);

        System.out.println(queue.pollFirst()); //Output: 1
        System.out.println(queue.pollFirst()); //Output: 2
        System.out.println(queue.pollFirst()); //Output: 3
    }
}