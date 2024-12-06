import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int m = n - 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 90, 34, 25, 12, 22, 11};
        System.out.println("Unsorted array: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Sorted array:   " + Arrays.toString(arr));
    }
}