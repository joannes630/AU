import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();         // Creating a HashSet
        set.add(103);                                   // Adding elements to the HashSet
        set.add(22);
        set.add(1);

        System.out.println(set);                        // Printing a HashSet

        // You cannot use an index in a Hash data structure
        // You have to use an enhanced for loop, or an iterator
        for (Integer number: set) {                     // Using an enhanced for loop
            System.out.println(number);
        }

        Iterator<Integer> it = set.iterator();          // Using an Iterator
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        set.remove(22);                             // Removing an object from a HashSet
        System.out.println(set);

        if (set.contains(103))                          // Searching a HashSet
            System.out.println("The hash set contains 103");
        else
            System.out.println("The hash set does NOT contain 103");
    }
}