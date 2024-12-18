//Problem: Implement the AvgArray Class
//You are tasked with creating an AvgArray class that calculates the average of all elements in a two-dimensional integer array. The class should include a method to perform this calculation and return the average (double).

//Class Requirements:
//avgArray(int[][] array):
//This method accepts a two-dimensional integer array (int[][]) and returns a double which is the average of all the elements in the array

//Instructions:
//You do not need to implement the main method.
//Focus only on implementing the avgArray method.
//The input will be a rectangular 2D array (each row has the same number of columns).

public class AvgArray {
    // Write your code here
    public double avgArray(int[][] array) {
        int total = 0;
        int count = 0;
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[0].length; j++) {
                total += array[i][j];
                count += 1;
            }
        }
        double avg = (double) total / count;
        return avg;
    }
}
