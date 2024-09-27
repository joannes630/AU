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

