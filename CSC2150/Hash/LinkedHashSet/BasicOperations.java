package Hash.LinkedHashSet;
import java.util.LinkedHashSet;

public class BasicOperations {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

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