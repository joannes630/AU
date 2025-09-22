package NestedForLoop;
/*
Write a Java program that uses nested for loops to print a 5 × 5 square of stars.
 */
public class SquarePattern {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

