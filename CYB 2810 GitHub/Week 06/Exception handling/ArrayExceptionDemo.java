public class ArrayExceptionDemo {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        // Invalid index (array has only 3 elements: 0,1,2)
        System.out.println("Accessing index 5: " + numbers[5]);
        System.out.println("Program continues...");
    }
}