package WhileLoop;
/*
Write a Java program that asks the user to enter a password. The correct password is "secure123". The user has 3
attempts to enter the password. If the correct password is entered, print "Access granted." If all 3 attempts are
used incorrectly, print "Too many failed attempts. Access denied."
 */

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "secure123";
        String input;
        int attempts = 0;

        while (attempts < 3) {
            System.out.print("Enter password: ");
            input = scanner.nextLine();

            if (input.equals(correctPassword)) {
                System.out.println("Access granted.");
                scanner.close();
                return;
            }
            else {
                System.out.println("Incorrect password.");
                attempts++;
            }
        }
        System.out.println("Too many failed attempts. Access denied.");
        scanner.close();
    }
}
