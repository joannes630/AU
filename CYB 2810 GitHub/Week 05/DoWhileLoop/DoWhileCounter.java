package DoWhileLoop;

/*
Write a Java program that uses a do…while loop to print the numbers 1 through 5.
 */
public class DoWhileCounter {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("Count: " + i);
            i++;
        } while (i <= 5);
    }
}
