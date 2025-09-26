package NestedForLoop;

public class NestedLoopDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) { // Outer loop → rows
            for (int j = 1; j <= 3; j++) { // Inner loop → columns
                System.out.print(i + "," + j + " ");
            }
            System.out.println(); // Move to next row
        }
    }
}