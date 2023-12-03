// Java code to demonstrate Graph representation
// using ArrayList in Java

import java.util.*;

class AdjacencyList {

	// A utility function to add an edge in an
	// undirected graph
	static void addEdge(ArrayList<LinkedList<Integer> > adj,
						int u, int v)
	{
		adj.get(u).add(v);
		adj.get(v).add(u);
		// for a directed graph with an edge pointing from u
		// to v, adj.get(u).add(v);
	}

	// A utility function to print the adjacency list
	// representation of graph
	static void
	printGraph(ArrayList<LinkedList<Integer>> adj)
	{
		for (int i = 0; i < adj.size(); i++) {
			System.out.print("\nvertex " + i);
			for (int j = 0; j < adj.get(i).size(); j++) {
				System.out.print(" -> "	+ adj.get(i).get(j));
			}
		}
	}

	// Driver Code
	public static void main(String[] args)
	{
		// Creating a graph with 5 vertices
		int V = 5;
		ArrayList<LinkedList<Integer> > adj
			= new ArrayList<>(V);

		for (int i = 0; i < V; i++)
			adj.add(new LinkedList<Integer>());

		// Adding edges one by one
		addEdge(adj, 0, 1);
		addEdge(adj, 0, 4);
		addEdge(adj, 1, 2);
		addEdge(adj, 1, 3);
		addEdge(adj, 1, 4);
		addEdge(adj, 2, 3);
		addEdge(adj, 3, 4);

		printGraph(adj);
	}
}
