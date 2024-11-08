import java.util.ArrayDeque;
import java.util.Deque;

public class DequeAsQueue {
    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();

        queue.offer(1); // Enqueue
        queue.offer(2);
        queue.offer(3);

        System.out.println(queue.poll()); // Dequeue (Output: 1)
    }
}