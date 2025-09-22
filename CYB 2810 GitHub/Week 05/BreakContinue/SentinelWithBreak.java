package BreakContinue;

import java.util.Scanner;
public class SentinelWithBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;

        System.out.println("Enter positive numbers to add. Enter -1 to stop.");

        while (true) { // infinite loop, broken by sentinel
            number = scanner.nextInt();

            if (number == -1) {
                break; // sentinel value ends the loop
            }

            if (number < 0) {
                System.out.println("Only positive numbers allowed (or -1 to quit).");
                continue; // skip invalid input
            }

            sum += number;
        }

        System.out.println("Final sum = " + sum);
        scanner.close();
    }
}
