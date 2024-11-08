import java.util.ArrayDeque;
import java.util.Deque;

public class DequeAsStack {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(1); // Push
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop()); // Pop (Output: 3)
    }
}