//You are tasked with creating an AvgRows class that calculates the average of each row in a two-dimensional integer array. The class should include a method to perform this calculation and return the results as an array of averages.

//Class Requirements:

//avgRows(int[][] array):
//This method accepts a two-dimensional integer array (int[][]) and returns a one-dimensional double[] array containing the average of each row.
//Each element in the resulting array should correspond to the average of the integers in that specific row of the input array.

//Instructions:
//You do not need to implement the main method.
//Focus only on implementing the avgRows method.
//The input will be a rectangular 2D array (each row has the same number of columns).
//The averages must be calculated using floating-point division.

public class AvgRows {
    // Write your code here
    public double[] avgRows(int[][] array) {
        double[] avg = new double[array.length];

        for(int i=0; i<array.length; i++) {
            int sum = 0;
            for(int j=0; j<array[0].length; j++) {
                sum += array[i][j];
            }
            avg[i] = (double) sum / array[0].length;
        }
        return avg;
    }
}
