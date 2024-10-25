import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        // Updating the value for a key
        map.put("Alice", 28);  // Update Alice's age

        // Retrieving values
        System.out.println("Alice's age: " + map.get("Alice"));

        // Removing a key-value pair
        map.remove("Charlie");

        // Checking if a key exists
        if (map.containsKey("Bob")) {
            System.out.println("Bob is in the map");
        }

        // Iterating over the HashMap
        for (String key: map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}