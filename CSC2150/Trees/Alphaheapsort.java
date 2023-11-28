package com.example.chapter21trees;

import java.util.*;

/** 
   This program shows the use of a PriorityQueue with
   a custom Comparator object.
*/

public class Alphaheapsort
{    
    /** 
       Specialized Comparator. 
    */
   
    static class AlphaOrder implements Comparator<Integer>
    {
        public int compare(Integer x, Integer y)
        {
           return x.toString().compareTo(y.toString());
        }
    }

    public static void main(String [] args)
    {
       // Create and display an array of random integers
       Random randy = new Random();
       int [ ] arr = new int[10];
		 String str = "Here is the original list of numbers:";
       System.out.println(str);
       for (int k = 0; k < arr.length; k++)
       {
           arr[k] = randy.nextInt(10000);   
           System.out.print(arr[k] + "  ");
       }
       
       // Create a priority queue of integers
       // and use it to sort the array
       AlphaOrder c = new AlphaOrder();
       PriorityQueue<Integer> 
           pQueue = new PriorityQueue<Integer>(arr.length, c);       
       for (int x : arr)
		     pQueue.add(x);
       for (int k = 0; k < arr.length; k++)
		     arr[k] = pQueue.poll();
       
       // Print the array
       System.out.println("\nHere are the numbers sorted " + 
                          "in alphabetical order:");       
       for (int x : arr) 
		    System.out.print(x + "  ");        
    }    
}