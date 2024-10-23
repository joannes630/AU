//Problem: Implement the TemperatureTracker Class
//You are tasked with creating a TemperatureTracker class that provides methods to analyze an array of temperatures. The class should include the following methods that take an integer array of temperatures and return specific values based on the data.

//Class Requirements:

//highestTemperature(int[] temperatures):
//This method accepts an array of integers (temperatures) and returns the highest temperature in the array.

//lowestTemperature(int[] temperatures):
//This method accepts an array of integers (temperatures) and returns the lowest temperature in the array.

//averageTemperature(int[] temperatures):
//This method accepts an array of integers (temperatures) and returns the average temperature as a double. Ensure that the division is handled correctly to maintain precision (use floating-point division).

//Constraints:
//You do not need to implement the main method.
//Focus on implementing the methods as described.
//The array passed to these methods will always contain valid integer values representing temperatures.

public class TemperatureTracker {
    public int highestTemperature(int[] temp) {
        int highest = temp[0];
        for (int i=0; i<temp.length; i++) {
            if (temp[i] > highest)
                highest = temp[i];
        }
        return highest;
    }

    public int lowestTemperature(int[] temp) {
        int lowest = temp[0];
        for (int i=0; i<temp.length; i++) {
            if (temp[i] < lowest)
                lowest = temp[i];
        }
        return lowest;
    }

    public double averageTemperature(int[] temp) {
        int total = 0;
        for (int i=0; i<temp.length; i++) {
            total += temp[i];
        }
        double avg = (double) total / temp.length;
        return avg;
    }
}

