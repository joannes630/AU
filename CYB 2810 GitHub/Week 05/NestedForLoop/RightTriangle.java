package NestedForLoop;

/*
Write a Java program that uses nested for loops to print the following right triangle of stars.
 */
public class RightTriangle {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

