public class BigOSequentialSearcher
{
   public static int search(int[] array, int value)
   {
      int index = 0, count = 0;
      int position = -1;
      boolean found = false;
      int n = array.length;

      while (!found && index < n)
      {
         if (array[index] == value)
         {
            found = true;
            position = index;
         }
         index++;
         count++;
      }
      System.out.println("Count value is " + count);
      return position;
   }

   /**
    * The algorithm stops as soon as it finds "value".
    * The algorithm may stop after making only one comparison ,
    * or it may stop after making n comparisons,
    * or it may stop after making m comparisons, where m is between 1 and n.
    * In cases where the algorithm may perform different amounts of work, it is 
    * convention to measure the efficiency of the algorithm by the work done
    * on an input size of n that requires the most work. This is called measuring
    * the algorithm by its "Worst-case complexity function"
    * 
    * It is a good measure of efficiency to use when we are looking for a
    * performance guarantee.
    */

   public static void main(String[] args)
   {
      int[] array = { 87, 75, 99, 82, 100 };
      int index;
      int search = 101;

      index = search(array, search);

      if (index == -1)
         System.out.println(search + " was not found in the array");
      else
         System.out.println(search + " was found in the array at index " + index);
   }
}