import java.util.Stack;

public class BalancedParentheses {
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char topElement = stack.pop();
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