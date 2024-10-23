import java.util.ArrayList;
/*
    TASK: Write a method to return an ArrayList where all positive numbers (including zero)
    come before negative numbers. For example, if the input array is [3, -1, 0, -5, 6, -2],
    after calling the method, the returned ArrayList should be [3, 0, 6, -1, -5, -2].
    The order of positive, zero, and negative numbers should be maintained as in the
    original list.
 */

public class PositiveNegativeArrangement {
    public static void main(String[] args) {
        // Sample ArrayList of numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(-1);
        numbers.add(0);
        numbers.add(-5);
        numbers.add(6);
        numbers.add(-2);

        // Call the method to rearrange positive numbers (including zero) before negative numbers
        ArrayList<Integer> arrangedList = arrangePositivesBeforeNegatives(numbers);

        // Print the rearranged list
        System.out.println("Rearranged List: " + arrangedList);
    }

    public static ArrayList<Integer> arrangePositivesBeforeNegatives(ArrayList<Integer> numbers) {
        // Create a new ArrayList to store the result
        ArrayList<Integer> result = new ArrayList<>();

        // First, add all positive numbers (including zero)
        for (Integer number : numbers) {
            if (number >= 0) {  // Positive numbers and zero
                result.add(number);
            }
        }

        // Then, add all negative numbers
        for (Integer number : numbers) {
            if (number < 0) {  // Negative numbers
                result.add(number);
            }
        }

        return result;
    }
}
