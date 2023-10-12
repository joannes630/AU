import java.util.Random;

public class BinarySearchBigO
{

   public static void bubbleSort(int[] array)
   {
      int lastPos;     // Position of last element to compare
      int index;       // Index of an element to compare
      int temp;        // Used to swap to elements
      
      for (lastPos = array.length - 1; lastPos >= 0; lastPos--)
      {
         for (index = 0; index <= lastPos - 1; index++)
         {
            // Compare an element with its neighbor.
            if (array[index] > array[index + 1])
            {
               // Swap the two elements.
               temp = array[index];
               array[index] = array[index + 1];
               array[index + 1] = temp;
            }
         }
      }
   }

   public static int search(int[] array, int value)
   {
      int first;       // First array element
      int last;        // Last array element
      int middle;      // Mid point of search
      int position;    // Position of search value
      boolean found;   // Flag
      int count = 0;

      first = 0;
      last = array.length - 1;
      position = -1;
      found = false;

      while (!found && first <= last)
      {
         count++;
         middle = (first + last) / 2;
         
         // If value is found at midpoint...
         if (array[middle] == value)
         {
            found = true;
            position = middle;
         }
         // else if value is in lower half...
         else if (array[middle] > value)
            last = middle - 1;
         // else if value is in upper half....
         else
            first = middle + 1;
      }
      System.out.println("Searched " + count + " times");

      return position;
   }

   public static void main(String[] args)
   {
      final int SIZE = 10_000;
      Random rand = new Random();
      int[] array = new int[SIZE];
      for(int i=0; i<SIZE; i++)
         array[i] = rand.nextInt(SIZE) + 1;

      // Sort the array.
      bubbleSort(array);

      // Do binary search
      int results;
      int searchNumber = rand.nextInt(SIZE) + 1;
      results = search(array, searchNumber);
      System.out.println("Searching for " + searchNumber);

      if (results == -1)
      {
         System.out.println("Binary search did not find " + searchNumber);
      }
      else
      {
         System.out.println("Binary search found " + searchNumber);
      }
   }

}