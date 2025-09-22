package WhileLoop;

import java.util.Scanner;

public class SentinelExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;

        System.out.println("Enter numbers to add. Enter -1 to stop.");

        // Sentinel-controlled loop
        number = scanner.nextInt();   // first input
        while (number != -1) {        // sentinel check
            sum += number;
            number = scanner.nextInt();
        }

        System.out.println("Final sum = " + sum);
        scanner.close();
    }
}
