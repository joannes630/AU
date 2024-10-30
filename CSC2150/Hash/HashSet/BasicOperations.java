import java.util.HashMap;

public class BasicOperations {
    public static void main(String[] args) {
        HashMap<String, Integer> studentScores = new HashMap<>();

        studentScores.put("Xavier", 85);
        studentScores.put("Charlie", 78);
        studentScores.put("Diana", 88);
        studentScores.put("Bob", 92);
        studentScores.put("Augusta", 92);

        System.out.println("Bob's score: ");

        if (studentScores.containsKey("Charlie")) {
            System.out.println("Charlie's score is recorded");
        }
        else {
            System.out.println("No score found for Charlie.");
        }

        for (String key : studentScores.keySet()) {
            System.out.println(key + ": " + studentScores.get(key));
        }

        System.out.println("\nUsing entrySet(): ");
        for (var entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
