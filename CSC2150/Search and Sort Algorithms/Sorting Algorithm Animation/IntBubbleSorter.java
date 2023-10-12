import java.util.Arrays;
import javax.swing.JOptionPane;

public class IntBubbleSorter
{
    public void bubbleSort(int[] array)
    {
        int lastPos;     // Position of last element to compare
        int index;       // Index of an element to compare
        int temp;        // Used to swap to elements

        for (lastPos = array.length - 1; lastPos >= 0; lastPos--)
        {
            for (index = 0; index <= lastPos - 1; index++)
            {
                JOptionPane.showMessageDialog(null, "lastPos: " + lastPos + ", index: " + index);
                if (array[index] > array[index + 1])
                {
                    JOptionPane.showMessageDialog(null, "Swap " + array[index] + " " + array[index + 1]);
                    temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                    System.out.println(Arrays.toString(array));
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int[] values = { 5, 4, 3, 2, 1 };
        System.out.println("Original Order: ");
        System.out.println(Arrays.toString(values) + "\n");

        IntBubbleSorter obj = new IntBubbleSorter();
        obj.bubbleSort(values);

        System.out.println("\nSorted order: ");
        System.out.println(Arrays.toString(values));
    }
}
