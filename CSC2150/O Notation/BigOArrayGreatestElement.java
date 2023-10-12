public class BigOArrayGreatestElement
{
   public static int search(int[] array)
   {
      int greatest = array[0];
      int i = 1;
      int n = array.length;

      while (i < n) {
         if (array[i] > greatest)
             greatest = array[i];
         i++;
      }

      return greatest;
   }

   /**
    * Lines 5,6,7,15 can be counted can be counted as one basic operation.
    * The amount of time it takes to iterate once in the loop does not 
    * depend on n. Because the algorithm executes the loop n times, it
    * executes n+1 basic operations. For large sizes of n, the number of 
    * basic operations performed is approximately n. We say that the algorithm
    * requires time proportional to n to process an input size of n.
    * 
    * We say the Big O notation of the method sum is O(n).
    */

   public static void main(String[] args)
   {
      int[] array = { 87, 75, 99, 82, 100 };
      System.out.println("The sum of the values in the array is " + sum(array));
   }
}