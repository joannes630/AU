import java.util.Random;

public class SequentialSearchBigO
{
   public static int search(int[] array, int value)
   {
      int index;        // Loop control variable
      int position;     // Position the value is found at
      boolean found;    // Flag indicating search results

      index = 0;

      position = -1;
      found = false;

      // Search the array.
      while (!found && index < array.length)
      {
         if (array[index] == value)
         {
            found = true;
            position = index;
         }
         index++;
      }

      return position;
   }

   public static void main(String[] args)
   {
      final int SIZE = 10_000;
      Random rand = new Random();
      int[] array = new int[SIZE];
      for(int i=0; i<SIZE; i++)
         array[i] = rand.nextInt(SIZE) + 1;

      int results;
      int searchNumber = rand.nextInt(SIZE) + 1;
      results = search(array, searchNumber);
      System.out.println("Searching for " + searchNumber);

      if (results == -1)
      {
         System.out.println("Sequential search did not find " + searchNumber);
         System.out.println("Searched " + SIZE + " times");
      }
      else
      {
         System.out.println("Seauential search found " + searchNumber);
         System.out.println("Searched " + results + " times");
      }
   }
}