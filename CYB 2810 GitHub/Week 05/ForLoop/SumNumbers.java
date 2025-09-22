package ForLoop;

/*
Write a Java program that asks the user for a number n and then uses a for loop to calculate and display the sum of
the numbers from 1 to n.
 */

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum of numbers from 1 to " + n + " is " + sum);
        scanner.close();
    }
}
