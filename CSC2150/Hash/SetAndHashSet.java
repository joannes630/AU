import java.util.*;

public class SetAndHashSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        Scanner keyboard = new Scanner(System.in);

        names.add("Walter");
        names.add("Jesse");
        names.add("Skyler");
        names.add("Mike");
        names.add("Saul");
        System.out.println(names);


        // Try to add a duplicate
        names.add("Walter");
        System.out.println(names);

        // Remove an item
        names.remove("Skyler");
        System.out.println(names);

        // Use enhanced for loop to iterate through the items
        for (String name: names)
            System.out.println(name);

        // Use an Iterator
        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()) {
            System.out.println(namesIterator.next());
        }

        // Create an ArrayList with duplicates
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(2);
        numberList.add(1);
        System.out.println(numberList);

        // Dump the ArrayList to a Set
        // This will remove the duplicates
        Set <Integer> numberSet = new HashSet<>();
        numberSet.addAll(numberSet);
        System.out.println(numberSet);
    }
}