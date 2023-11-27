import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap with keys and values of type String
        Map<String, String> countryCapitalMap = new HashMap<>();

        // Add key-value pairs to the HashMap
        countryCapitalMap.put("USA", "Washington D.C.");
        countryCapitalMap.put("Canada", "Ottawa");
        countryCapitalMap.put("France", "Paris");
        countryCapitalMap.put("Japan", "Tokyo");
        countryCapitalMap.put("India", "New Delhi");

        // Display the contents of the HashMap
        System.out.println("Contents of the HashMap:");
        for (Map.Entry<String, String> entry : countryCapitalMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // Check if a key is present in the HashMap
        String countryToCheck = "France";
        if (countryCapitalMap.containsKey(countryToCheck)) {
            System.out.println(countryToCheck + " is present. Capital: " + countryCapitalMap.get(countryToCheck));
        } else {
            System.out.println(countryToCheck + " is not present in the HashMap.");
        }

        // Remove a key from the HashMap
        String countryToRemove = "Canada";
        countryCapitalMap.remove(countryToRemove);
        System.out.println("After removing " + countryToRemove + ": " + countryCapitalMap);

        // Check if a value is present in the HashMap
        String capitalToCheck = "Tokyo";
        if (countryCapitalMap.containsValue(capitalToCheck)) {
            System.out.println(capitalToCheck + " is a capital in the HashMap.");
        } else {
            System.out.println(capitalToCheck + " is not present as a capital in the HashMap.");
        }
    }
}
