import java.util.*;

// Graph class using adjacency matrix
class Graph {
    private int[][] adjacencyMatrix; // Adjacency matrix
    private int vertices; // Number of vertices

    // Constructor
    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyMatrix = new int[vertices][vertices];
    }

    // Add edge to the graph
    public void addEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = 1;
        adjacencyMatrix[destination][source] = 1; // For undirected graph
    }

    // Print the adjacency matrix
    public void printGraph() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Perform Breadth-First Search (BFS)
    public void bfs(int startVertex) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        System.out.print("BFS Traversal: ");
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for (int i = 0; i < vertices; i++) {
                if (adjacencyMatrix[vertex][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
        System.out.println();
    }

    // Perform Depth-First Search (DFS) using a stack
    public void dfs(int startVertex) {
        boolean[] visited = new boolean[vertices];
        Stack<Integer> stack = new Stack<>();

        stack.push(startVertex);

        System.out.print("DFS Traversal: ");
        while (!stack.isEmpty()) {
            int vertex = stack.pop();

            if (!visited[vertex]) {
                visited[vertex] = true;
                System.out.print(vertex + " ");

                // Push all adjacent unvisited vertices onto the stack
                // for (int i = vertices - 1; i >= 0; i--) { // Reverse order to match recursive behavior
                for (int i=0; i<vertices; i++) {
                    if (adjacencyMatrix[vertex][i] == 1 && !visited[i]) {
                        stack.push(i);
                    }
                }
            }
        }
        System.out.println();
    }
}

// Main class
public class GraphExample {
    public static void main(String[] args) {
        Graph graph = new Graph(6); // Create a graph with 5 vertices

/*
0--1
0--2
1--3
1--4
1--5
2--4
3--5
4--5
*/
        // Add edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(1, 5);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);

        // Print the adjacency matrix
        graph.printGraph();

        // Perform BFS and DFS
        graph.bfs(3); // Start BFS from vertex 0
        graph.dfs(3); // Start DFS from vertex 0
    }
}
