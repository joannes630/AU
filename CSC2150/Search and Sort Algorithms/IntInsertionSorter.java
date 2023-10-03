/**
   The IntInsertionSorter class provides a public static
   method for performing an insertion sort on an int array.
*/

public class IntInsertionSorter
{

   /**
      The insertionSort method performs an insertion sort on
      an int array. The array is sorted in ascending order.
      @param array The array to sort.
   */

   public static void insertionSort(int[] array)
   {
      int unsortedValue;  // The first unsorted value
      int scan;           // Used to scan the array
      
      // The outer loop steps the index variable through 
      // each subscript in the array, starting at 1. The portion of
      // the array containing element 0  by itself is already sorted.
      for (int index = 1; index < array.length; index++)
      {
         // The first element outside the sorted portion is
         // array[index]. Store the value of this element
         // in unsortedValue.
         unsortedValue = array[index];
         
         // Start scan at the subscript of the first element
         // outside the sorted part.
         scan = index;
         
         // Move the first element in the still unsorted part
         // into its proper position within the sorted part.
         while (scan > 0 && array[scan-1] > unsortedValue)
         {
            array[scan] = array[scan - 1];
            scan--;
         }
         
         // Insert the unsorted value in its proper position
         // within the sorted subset.
         array[scan] = unsortedValue;
      }
   }

   public static void main(String[] args)
   {
      // Create an int array with test values.
      int[] values = { 5, 1, 3, 6, 4, 2 };
      
      // Display the array's contents.
      System.out.println("Original order: ");
      for (int element : values)
         System.out.print(element + " ");
      
      // Sort the array.
      insertionSort(values);

      // Display the array's contents.
      System.out.println("\nSorted order: ");
      for (int element : values)
         System.out.print(element + " ");
         
      System.out.println();
   }

}
