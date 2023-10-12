import java.util.Arrays;
import javax.swing.JOptionPane;

public class IntInsertionSorter
{
    public void insertionSort(int[] array)
    {
        int unsortedValue;  // The first unsorted value
        int scan;           // Used to scan the array

        for (int index = 1; index < array.length; index++)
        {
            unsortedValue = array[index];
            scan = index;

            while (scan > 0 && array[scan - 1] > unsortedValue)
            {
                JOptionPane.showMessageDialog(null, "index: " + index + ", scan: " + scan);
                array[scan] = array[scan - 1];
                System.out.println(Arrays.toString(array));

                scan--;
            }

            JOptionPane.showMessageDialog(null, "Move " + unsortedValue + " to index " + scan);
            array[scan] = unsortedValue;
            System.out.println(Arrays.toString(array));
        }
    }

    public static void main(String[] args)
    {
        int[] values = { 5, 4, 3, 2, 1 };

        System.out.println("Original order: ");
        System.out.println(Arrays.toString(values) + "\n");

        IntInsertionSorter obj = new IntInsertionSorter();
        obj.insertionSort(values);

        System.out.println("\nSorted order: ");
        System.out.println(Arrays.toString(values));
    }

}