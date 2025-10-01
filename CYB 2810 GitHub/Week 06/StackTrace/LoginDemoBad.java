package StackTrace;

import java.util.Scanner;

public class LoginDemoBad {
    private static void login(String username, String password) {
        try {
            // Simulate login (throw exception for invalid password)
            if (!"secret123".equals(password)) {
                throw new IllegalArgumentException("Invalid password for user: " + username);
            }

            System.out.println("Login successful!");
        } catch (Exception e) {
            // BAD: leaking stack trace to the user
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        login(username, password);
    }
}
