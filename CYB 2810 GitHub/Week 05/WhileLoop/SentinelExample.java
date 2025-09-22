package WhileLoop;
/*
Write a Java program that uses a sentinel-controlled loop to add numbers entered by the user. The program should
repeatedly ask the user to enter integers and keep a running total. The loop should stop when the user enters -1,
which will serve as the sentinel value. After the loop ends, the program should display the final sum of all numbers
entered (excluding the sentinel).
 */

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
