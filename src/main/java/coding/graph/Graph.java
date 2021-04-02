package coding.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Graph {

	private int V; // number of vertices
	private LinkedList<Integer> adj[]; // array of adjacency list

	public Graph(int v) {
		this.V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}

	public void addEdge(int v, int w) {
		adj[v].add(w);
	}

	// s -> starting node
	public void BFS(int s) {

		// to track visited nodes
		boolean visited[] = new boolean[V];

		// queue to manuver nodes
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		List<Integer> path = new ArrayList<Integer>();

		// mark the starting node as visited
		visited[s] = true;
		System.out.println("Starting at -->" + s);
		// add that in the queue
		queue.add(s);
		path.add(s);

		while (queue.size() != 0) {

			// pop out thenode from queue
			int vertex = queue.pop();
			System.out.println("Dequeing -->" + vertex);
			LinkedList<Integer> neigbours = adj[vertex];

			while (neigbours.size() != 0) {
				int neighb = neigbours.pop();

				if (!visited[neighb]) {
					queue.add(neighb);
					System.out.println("Queueing--->" + neighb);
					visited[neighb] = true;
					path.add(neighb);
					
				}
			}

		}
		
		System.out.println("BFS Path --> ");
		for(Integer i :path) {
			System.out.print(i+"-");
			
		}

	}

}
