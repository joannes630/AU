package DoWhileLoop;
/*
Write a Java program that asks the user for their age. The program should always prompt at least once, and it should
keep asking until the user enters a valid age between 0 and 120. Use a do-while loop.
 */

import java.util.Scanner;

public class DoWhileAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;

        do {
            System.out.print("Enter your age (0–120): ");
            age = scanner.nextInt();
        } while (age < 0 || age > 120);

        System.out.println("Your age is " + age);
        scanner.close();
    }
}
