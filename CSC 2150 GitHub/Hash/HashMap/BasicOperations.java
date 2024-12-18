package Hash.HashMap;
import java.util.HashMap;

/*
    String method:
        split(delimiter)

    HashMap methods:
        put(key, value)         --> inserts a key/value pair
        get(key)                --> retrieve the value using the key
        remove(key)             --> removes an item in the HashMap using the key
        containsKey(key)        --> checks if a key is present in the HashMap
        containsValue(value)    --> checks if a value is present in the HashMap
        keySet()                --> returns a list of keys
        size()                  --> returns the size of the HashMap
        isEmpty()               --> checks if the HashMap is empty
        clear()                 --> clears the HashMap
 */

public class BasicOperations {
    public static void main(String[] args) {
        HashMap<String, Integer> studentScores = new HashMap<>();

        studentScores.put("Xavier", 85);
        studentScores.put("Charlie", 78);
        studentScores.put("Diana", 88);
        studentScores.put("Bob", 92);
        studentScores.put("Augusta", 92);

        // Get Charlie's score
        if (studentScores.containsKey("Charlie")) {
            int score = studentScores.get("Charlie");
            System.out.println("Charlie's score is " + score);
        }
        else {
            System.out.println("No score found for Charlie.");
        }

        System.out.println("HashMap dump: ");
        for (String key : studentScores.keySet()) {
            System.out.println(key + ": " + studentScores.get(key));
        }

        studentScores.remove("Bob");
        System.out.println("HashMap after delete");
        for (String key : studentScores.keySet()) {
            System.out.println(key + ": " + studentScores.get(key));
        }

        System.out.println("Is HashMap empty? " + studentScores.isEmpty());
    }
}
