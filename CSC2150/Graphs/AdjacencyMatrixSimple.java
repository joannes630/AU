public class AdjacencyMatrixSimple {
    // A utility function to print the adjacency list
    // representation of graph
    static void
    printGraph(int[][] adjMat)
    {
        System.out.println(adjMat.length);
        for (int i = 0; i < adjMat.length; i++) {
            System.out.print("\nvertex " + i);
            for (int j = 0; j < adjMat[i].length; j++) {
                if (adjMat[i][j] != 0)
                    System.out.print(" -> "	+ j);
            }
        }
    }
    
    public static void main(String[] args)
    {
        // for a undirected graph with an edge pointing
        // from u to v,we just assign adjMat[u][v] as 1
        // and assign adjMat[v][u] as 1
        int[][] adjMat = {{0,1,0,0,1},
                          {1,0,1,1,1},
                          {0,1,0,1,0},
                          {0,1,1,0,1},
                          {1,1,0,1,0}};
        printGraph(adjMat);

    }
}

