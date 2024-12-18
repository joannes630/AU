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

public class BalancedParentheses {
    public static boolean isBalanced(String str) {
        Deque<Character> stack = new ArrayDeque<>();
        /* Algorithm:
           Go in a loop of chars 
               If c is ( or { or [, add to the stack
               Else
                    if empty, it's not balanced 
                    Pop the stack, if c is ) and popped item is not ( (apply to other too), return false

            If stack is not empty, its not balanced
        */


        for (char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.addFirst(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char topElement = stack.removeFirst();
                if ((c == ')' && topElement != '(') ||
                    (c == '}' && topElement != '{') ||
                    (c == ']' && topElement != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str1 = "()[]{}";
        String str2 = "(]";

        System.out.println(isBalanced(str1)); // Output: true
        System.out.println(isBalanced(str2)); // Output: false
    }
}