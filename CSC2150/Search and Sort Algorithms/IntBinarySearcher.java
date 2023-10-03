/**
   The IntBinarySearcher class provides a public static
   method for performing a binary search on an int array.
*/

public class IntBinarySearcher
{
   /**
      The search method performs a binary search on an int
      array. The array is searched for the number passed to
      value. If the number is found, its array subscript is
      returned. Otherwise, -1 is returned indicating the
      value was not found in the array.
      @param array The array to search.
      @param value The value to search for.
   */

   public static int search(int[] array, int value)
   {
      int first;       // First array element
      int last;        // Last array element
      int middle;      // Mid point of search
      int position;    // Position of search value
      boolean found;   // Flag

      // Set the inital values.
      first = 0;
      last = array.length - 1;
      position = -1;
      found = false;

      // Search for the value.
      while (!found && first <= last)
      {
         System.out.println("Searching...");
         // Calculate mid point
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

      // Return the position of the item, or -1
      // if it was not found.
      return position;
   }

   public static void main(String[] args)
   {
      // Before doing a binary search, the array has to be sorted.
      int[] tests = { 75, 82, 87, 99, 100};
      int results;

      // Search the array for the value 100.
      results = search(tests, 100);

      // Determine whether 100 was found and
      // display an appropriate message.
      if (results == -1)
      {
         System.out.println("You did not " +
                    "earn 100 on any test.");
      }
      else
      {
         System.out.println("You earned 100 " +
                    "on test " + (results + 1));
      }
   }
}
