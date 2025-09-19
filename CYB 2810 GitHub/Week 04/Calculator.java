public class Calculator {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        String op = "DIV";  // change to ADD, SUB, MUL, DIV, etc.

        int result = switch (op) {
            case "ADD" -> a + b;
            case "SUB" -> a - b;
            case "MUL" -> a * b;
            case "DIV" -> {
                if (b == 0)
                    yield 0;    // Return 0 if divisor is 0
                else
                    yield a / b;
            }
            default -> 0;
        };

        System.out.println("Result = " + result);
    }
}
