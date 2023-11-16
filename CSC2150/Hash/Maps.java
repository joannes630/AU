import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<String, Integer> empIds = new HashMap<>();

        // Add entries to the map
        empIds.put("Michael Scott", 12345);
        empIds.put("Jim Halpert", 45678);
        empIds.put("Kevin Malone", 8675309);
        System.out.println(empIds);

        // Print the value of the key "Michael Scott"
        System.out.println(empIds.get("Michael Scott"));

        // Query if "Kevin Malone" key exists in our map
        System.out.println(empIds.containsKey("Kevin Malone"));

        // Query if the value 8675309 exists in our map
        System.out.println(empIds.containsValue(8675309));

        // Overwrite "Michael Scott", write if it does not exist
        empIds.put("Michael Scott", 67890);
        System.out.println(empIds);

        // Overwrite "Michael Scott" if it exists in our map
        empIds.replace("Michael Scott", 777);
        System.out.println(empIds);

        // Add "Kelly Kapoor" if it is not in our map
        empIds.putIfAbsent("Kelly Kapoor", 65434);
        System.out.println(empIds);
    }
}