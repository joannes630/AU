// Adjacency Matrix representation in Java

import java.util.*;

public class AdjacencyMatrixFriends {
    private boolean adjMatrix[][];
    private Integer numVertices;

    // Initialize the matrix
    public AdjacencyMatrixFriends(Integer numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new boolean[numVertices][numVertices];
    }

    // Add edges
    public void addEdge(Integer i, Integer j) {
        adjMatrix[i][j] = true;
        adjMatrix[j][i] = true;
    }

    // Remove edges
    public void removeEdge(Integer i, Integer j) {
        adjMatrix[i][j] = false;
        adjMatrix[j][i] = false;
    }

    public String getFriendName(Map<String, Integer> map, Integer index) {
        for (Map.Entry<String, Integer> entry : map.entrySet())
            if (index == entry.getValue())
                return entry.getKey();
        return null;
    }

    // Print the adjacency matrix
    public void printFriends(Map<String, Integer> map) {
        for (int i = 0; i < numVertices; i++) {
            System.out.printf("%s ", getFriendName(map, i));
            for (int j = 0; j < numVertices; j++) {
                if (adjMatrix[i][j])
                    System.out.printf("-> %s ", getFriendName(map, j));
            }
            System.out.println();
        }
    }

    // Print the matrix
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < numVertices; i++) {
            s.append(i + ": ");
            for (boolean j : adjMatrix[i]) {
                s.append((j ? 1 : 0) + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }

    public static void main(String args[]) {
        // Define the person to number mapping
        Map<String, Integer> codec = new HashMap<String, Integer>() {{
            put("Anne", 0);
            put("Bob", 1);
            put("Elisa", 2);
            put("Diana", 3);
            put("Carl", 4);
        }};
        System.out.println("Person to number mapping: " + codec);

        AdjacencyMatrixFriends g = new AdjacencyMatrixFriends(codec.size());

        // Define the friends network
        g.addEdge(codec.get("Anne"), codec.get("Bob"));
        g.addEdge(codec.get("Anne"), codec.get("Elisa"));
        g.addEdge(codec.get("Anne"), codec.get("Diana"));
        g.addEdge(codec.get("Bob"), codec.get("Diana"));
        g.addEdge(codec.get("Bob"), codec.get("Carl"));
        g.addEdge(codec.get("Elisa"), codec.get("Carl"));
        g.addEdge(codec.get("Diana"), codec.get("Carl"));

        // Print the adjacency matrix
        System.out.println("\nADJACENCY MATRIX");
        System.out.println(g);

        // Print the friends network
        System.out.println("FRIENDS NETWORK");
        g.printFriends(codec);
        System.out.println();

        // Query if two persons are friends
        System.out.println("Query if two persons are friends.");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("First person (Enter to quit): ");
        String person1 = keyboard.nextLine();
        while (!person1.equals("")) {
            System.out.print("Second person: ");
            String person2 = keyboard.nextLine();

            if (g.adjMatrix[codec.get(person1)][codec.get(person2)])
                System.out.printf("%s and %s are friends\n", person1, person2);
            else
                System.out.printf("%s and %s are not friends\n", person1, person2);
            System.out.print("First person (Enter to quit): ");
            person1 = keyboard.nextLine();
        }
        System.out.println("Goodbye");
    }
}