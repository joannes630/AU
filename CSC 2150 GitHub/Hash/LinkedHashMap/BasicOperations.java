package Hash.LinkedHashMap;
import java.util.LinkedHashMap;

public class BasicOperations {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> studentScores = new LinkedHashMap<>();

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

        System.out.println("LinkedHashMap dump: ");
        for (String key : studentScores.keySet()) {
            System.out.println(key + ": " + studentScores.get(key));
        }

        studentScores.remove("Bob");
        System.out.println("LinkedHashMap after delete");
        for (String key : studentScores.keySet()) {
            System.out.println(key + ": " + studentScores.get(key));
        }

        System.out.println("Is LinkedHashMap empty? " + studentScores.isEmpty());
    }
}
