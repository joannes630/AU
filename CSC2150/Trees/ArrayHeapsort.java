package com.example.chapter21trees;

import java.util.*;

/**
   This program demonstrates the use of the
   ArrayHeap class.
*/

public class ArrayHeapsort
{
    public static void main(String [] args)
    {
       // Create and display an array of random integers
       Random randy = new Random();
       int [ ] arr = new int[10];
       System.out.println("Here is the array to be sorted:");
       for (int k = 0; k < arr.length; k++)
       {
           arr[k] = randy.nextInt(100);   
           System.out.print(arr[k] + "  ");
       }
       
       // Create a heap of integers
       // and use it to sort the array
       ArrayHeap heap = new ArrayHeap();       
       for (int x : arr) heap.add(x);
       for (int k = 0; k < arr.length; k++)
		     arr[k] = heap.removeMin();
       
       // Print the array
       System.out.println("\nHere is the sorted array:");
       for (int x : arr) 
		    System.out.print(x + "  ");        
    }   
}