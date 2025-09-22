package DoWhileLoop;
/*
Write a Java program that asks the user to enter a password. The correct password is "secure123". The program should
allow up to 3 attempts. If the correct password is entered, display "Access granted." Otherwise, after 3 failed
attempts, display "Too many failed attempts. Access denied." Use a do-while loop.
 */

import java.util.Scanner;

public class DoWhilePassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "secure123";
        String input;
        int attempts = 0;

        do {
            System.out.print("Enter password: ");
            input = scanner.nextLine();
            attempts++;

            if (input.equals(correctPassword)) {
                System.out.println("Access granted.");
                scanner.close();
                return;
            } else {
                System.out.println("Incorrect password.");
            }
        } while (attempts < 3);

        System.out.println("Too many failed attempts. Access denied.");
        scanner.close();
    }
}
