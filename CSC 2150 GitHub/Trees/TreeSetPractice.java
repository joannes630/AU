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

public class TreeSetPractice {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(5);
        treeSet.add(15);
        treeSet.add(25);
        treeSet.add(30);
        treeSet.add(1);

        System.out.println(treeSet);
        System.out.println("Smallest is " + treeSet.first());
        System.out.println("Largest is " + treeSet.last());
        System.out.println("The tree contains 15? " + treeSet.contains(15));
        treeSet.remove(5);
        System.out.println(treeSet);
        treeSet.add(20);
        System.out.println(treeSet);
        for (Integer x: treeSet) {
            if (x > 10) {
                System.out.print(x + " ");
            }
        }

    }    
    
}