//Problem: Implement the TotalArray Class
//You are tasked with creating an TotalArray class that calculates the sum of all the elements in a two-dimensional integer array. The class should include a method to perform this calculation and return the sum.

//Class Requirements:

//totalArray(int[][] array):
//This method accepts a two-dimensional integer array (int[][]) and returns an integer which is the sum of all the elements in the array

//Instructions:
//You do not need to implement the main method.
//Focus only on implementing the totalArray method.
//The input will be a rectangular 2D array (each row has the same number of columns).

public class TotalArray {
    // Write your code here
        public int totalArray(int[][] array) {
        int total = 0;
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[0].length; j++) {
                total += array[i][j];
            }
        }
        return total;
    }

}
