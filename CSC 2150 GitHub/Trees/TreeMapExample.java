import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap to store words and their definitions
        TreeMap<String, String> dictionary = new TreeMap<>();

        // Add sample data
        dictionary.put("apple", "A fruit that grows on trees.");
        dictionary.put("ant", "A small insect that lives in colonies.");
        dictionary.put("banana", "A long yellow fruit.");
        dictionary.put("cat", "A small domesticated carnivorous mammal.");
        dictionary.put("carrot", "An orange root vegetable.");

        // Look up a word's definition
        String word = "apple";
        if (dictionary.containsKey(word)) {
            System.out.println("Definition of \"" + word + "\": " + dictionary.get(word));
        } else {
            System.out.println("The word \"" + word + "\" is not in the dictionary.");
        }

        // Print words starting with a particular letter
        char startLetter = 'c';
        System.out.println("\nWords starting with \"" + startLetter + "\":");
        for (Map.Entry<String, String> entry : dictionary.subMap(startLetter + "", (char) (startLetter + 1) + "").entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
