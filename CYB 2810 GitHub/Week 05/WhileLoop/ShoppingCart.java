package WhileLoop;
/*
Write a Java program that simulates a shopping cart. The program should repeatedly ask the user to enter the price of
 an item. When the user enters 0, the program stops and prints the total bill.
 */

import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        double price;

        System.out.println("Enter the price of each item (enter 0 to finish):");
        price = scanner.nextDouble();

        while (price != 0) {
            total += price;
            System.out.print("Enter next item price (0 to finish): ");
            price = scanner.nextDouble();
        }

        System.out.println("Your total bill is: $" + total);
        scanner.close();
    }
}
