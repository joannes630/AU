import java.util.Arrays;
import javax.swing.JOptionPane;

public class IntSelectionSorter
{
    public void selectionSort(int[] array)
    {
        int startScan;   // Starting position of the scan
        int index;       // To hold a subscript value
        int minIndex;    // Element with smallest value in the scan
        int minValue;    // The smallest value found in the scan

        for (startScan = 0; startScan < (array.length - 1); startScan++)
        {
            minIndex = startScan;
            minValue = array[startScan];

            for(index = startScan + 1; index < array.length; index++)
            {
                JOptionPane.showMessageDialog(null, "startScan: " + startScan + ", index: " + index);
                if (array[index] < minValue)
                {
                    minValue = array[index];
                    minIndex = index;
                    JOptionPane.showMessageDialog(null, "Set minValue " + minValue);
                }
            }

            JOptionPane.showMessageDialog(null, "Swap " + array[startScan] + " " + minValue);
            array[minIndex] = array[startScan];
            array[startScan] = minValue;
            System.out.println(Arrays.toString(array));

        }
    }

    public static void main(String[] args)
    {
        int[] values = { 5, 4, 3, 2, 1 };
        System.out.println("Original order: ");
        System.out.println(Arrays.toString(values) + "\n");

        IntSelectionSorter obj = new IntSelectionSorter();
        obj.selectionSort(values);

        System.out.println("\nSorted order: ");
        System.out.println(Arrays.toString(values));
    }
}