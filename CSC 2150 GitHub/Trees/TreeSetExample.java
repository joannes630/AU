import java.util.TreeSet;

/*
    TreeSet key methods:
        add(element)        --> Adds the specified element to the set if it is not already present.
        remove(element)     --> Removes the specified element from the set if it is present.
        contains(element)   --> Returns true if this set contains the specified element.
        first()             --> Returns the first (lowest) element currently in this set.
        last()              --> Returns the last (highest) element currently in this set.
        size()              --> Returns the number of elements in the set.
 */

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet to store Integer values
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add(50);
        treeSet.add(30);
        treeSet.add(20);
        treeSet.add(40);
        treeSet.add(70);
        treeSet.add(60);
        treeSet.add(80);

        // Printing elements of TreeSet (in ascending order)
        System.out.println("Elements in TreeSet (in ascending order):");
        for (Integer value : treeSet) {
            System.out.print(value + " ");
        }

        // Some operations with TreeSet
        System.out.println("\nSmallest element: " + treeSet.first());
        System.out.println("Largest element: " + treeSet.last());

        // Check if an element exists
        if (treeSet.contains(40)) {
            System.out.println("TreeSet contains 40");
        }

        // Remove an element
        treeSet.remove(30);
        System.out.println("After removing 30: " + treeSet);
    }
}
