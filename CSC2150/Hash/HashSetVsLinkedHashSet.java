import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetVsLinkedHashSet {
    public static void main(String[] args) {
        // Using HashSet
        Set<String> hashSet = new HashSet<>();

        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Orange");

        System.out.println("HashSet:");
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }

        System.out.println("\n-----------------\n");

        // Using LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Banana");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Orange");

        System.out.println("LinkedHashSet:");
        for (String fruit : linkedHashSet) {
            System.out.println(fruit);
        }
    }
}
