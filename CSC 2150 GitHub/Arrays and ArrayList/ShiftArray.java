import java.util.Arrays;
/*
    TASK: Write a method that shifts the elements of an array by "n" positions to the right.
    For example, if the input array is [1, 2, 3, 4, 5] and n = 2, after shifting the array to the
    right by n positions, the modified array will be [4, 5, 1, 2, 3].
 */
public class ShiftArray {
    private static void shirtArray(int[] array, int n) {
        // Make a deep copy of the array
        int[] copy = new int[array.length];
        for (int i=0; i<array.length; i++) {
            copy[i] = array[i];
        }

        for (int i=0; i<array.length; i++) {
            array[(i+n) % array.length] = copy[i];
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 9, 22, 2, 4};
        System.out.println("Original Array: " + Arrays.toString(array));
        shirtArray(array, 2);
        System.out.println("Modified Array: " + Arrays.toString(array));
    }
}
