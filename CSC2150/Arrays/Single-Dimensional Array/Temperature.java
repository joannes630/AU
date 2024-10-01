//Instructions:
//Create an array that stores the temperatures (in degrees Celsius) for 7 days.
//Hardcode the temperatures for the week are: 23, 27, 21, 25, 30, 26, 22

//Implement the following tasks:

//1. Create the array
//2. Find the highest temperature of the week (use variable name highest).
//3. Find the lowest temperature of the week (use variable name lowest).
//4. Calculate the avg temperature of the week (use variable name avg).
//5. Display the highest, lowest, and avg temperatures.

public class Temperature {
    // Write your code here
    public static void main(String[] args) {
        int[] temp = {23, 27, 21, 25, 30, 26, 22};

        int highest = temp[0];
        for (int i=0; i<temp.length; i++) {
            if (temp[i] > highest)
                highest = temp[i];
        }

        int lowest = temp[0];
        for (int i=0; i<temp.length; i++) {
            if (temp[i] < lowest)
                lowest = temp[i];
        }

        int total = 0;
        for (int i=0; i<temp.length; i++) {
            total += temp[i];
        }
        double avg = (double) total / temp.length;

        System.out.println("The highest temperature is " + highest);
        System.out.println("The lowest temperature is " + lowest);
        System.out.println("The average temperature is " + avg);
    }
}



