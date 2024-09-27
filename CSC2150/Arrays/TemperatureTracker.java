public class TemperatureTracker {
    public static void main(String[] args) {
        // 1. Create an array to store temperatures for 7 days
        int[] temperatures = {23, 27, 21, 25, 30, 26, 22};

        // 2. Find the highest temperature
        int highest = temperatures[0];
        for (int temp : temperatures) {
            if (temp > highest) {
                highest = temp;
            }
        }
        System.out.println("The highest temperature is " + highest);

        // 3. Find the lowest temperature
        int lowest = temperatures[0];
        for (int temp : temperatures) {
            if (temp < highest) {
                lowest = temp;
            }
        }
        System.out.println("The lowest temperature is " + lowest);

        // 4. Find the average temperature
        int sum = 0;
        for (int temp : temperatures)
            sum += temp;
        double avg = (double) sum / temperatures.length;
        System.out.println("The average temperature is " + String.format("%.2f", avg));             
    }
}