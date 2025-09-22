package NestedForLoop;
/*
Write a Java program that uses nested for loops to print a multiplication table from 1 × 1 up to 10 × 10.
 */

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int row = 1; row <= 10; row++) {
            for (int col = 1; col <= 10; col++) {
                System.out.printf("%4d", row * col); // formatted for spacing
            }
            System.out.println();
        }
    }
}

