package NestedForLoop;
/*
Write a Java program that prints numbers from 1 to 9 in a 3 × 3 matrix using nested for loops.
 */
public class SequentialMatrix {
    public static void main(String[] args) {
        int num = 1;
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}

