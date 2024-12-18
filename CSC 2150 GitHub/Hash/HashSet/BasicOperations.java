package Hash.HashSet;
import java.util.HashSet;

/*
    HashSet methods:
        add(key)            --> inserts a key
        remove(key)         --> removes a key
        contains(key)       --> checks if the HashSet contains the key
        size()              --> returns the size of the HashSet
        isEmpty()           --> checks if the HashSet is empty
        clear()             --> clears the HashSet
 */

public class BasicOperations {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(3);
        set.add(5);
        set.add(2);
        set.add(8);
        set.add(3);
        set.add(2);
        System.out.println(set);

        // You cannot use an index in a Hash data structure
        // You have to use an enhanced for loop, or an iterator
        for (Integer number: set) {
            System.out.println(number);
        }

        set.remove(5);
        System.out.println(set);

        if (set.contains(3))
            System.out.println("The hash set contains 3");
        else
            System.out.println("The hash set does NOT contain 3");
    }
}