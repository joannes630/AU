package WhileLoop;
/*
Write a Java program that asks the user for their age. The program should keep asking until
the user enters a valid age between 0 and 120. Once valid input is received,
display the age.
 */

import java.util.Scanner;

public class InputValidationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;

        System.out.print("Enter your age (0–120): ");
        age = scanner.nextInt();

        while (age < 0 || age > 120) {
            System.out.println("Invalid input. Please enter a valid age between 1 and 120.");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }

        System.out.println("Your age is " + age);
        scanner.close();
    }
}
