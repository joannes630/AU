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



