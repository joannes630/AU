import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Creating a LinkedHashMap with insertion-order
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        // Adding key-value pairs
        linkedHashMap.put(1, "Cherry");
        linkedHashMap.put(2, "Banana");
        linkedHashMap.put(3, "Apple");

        // Iterating over the LinkedHashMap
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}