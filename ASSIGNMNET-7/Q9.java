import java.util.*;

class Graph1<T> {
	LinkedList<T>[] adjList;
	int vertices;

	Graph1(int vertices) {
		this.vertices = vertices;
		adjList = new LinkedList[vertices];
		for (int i = 0; i < vertices; i++) {
			adjList[i] = new LinkedList<>();
		}
	}

	void addEdge(int src, T dest) {
		if (src >= 0 && src < vertices) {
			adjList[src].add(dest);
		} else {
			throw new IndexOutOfBoundsException("Vertex " + src + " does not exists.");
		}
	}

	void printAdjList() {
		for (int i = 0; i < vertices; i++) {
			System.out.println("Vertex " + i + "-> ");
			for (T vertex : adjList[i]) {
				System.out.println(vertex + " ");
			}
			System.out.println();
		}
	}

	void DFS(int vertex, boolean[] visited) {
		visited[vertex] = true;
		System.out.print(vertex + " ");
		for (T v : adjList[vertex]) {
			int n = (int) v;
			if (!visited[n])
				DFS(n, visited);
		}
	}
}

public class Q9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of vertices : ");
		int vertices = sc.nextInt();

		Graph1<Integer> g = new Graph1<>(vertices);
		System.out.println("Enter the number of edges: ");
		int edges = sc.nextInt();

		System.out.println("Enter the edges: ");
		for (int i = 0; i < edges; i++) {
			System.out.println("Source: ");
			int source = sc.nextInt();
			System.out.println("Destination: ");
			int destination = sc.nextInt();
			g.addEdge(source, destination);
		}

		boolean[] visited = new boolean[vertices];
		System.out.println("\nAdjancecy List:");
		g.printAdjList();
		System.out.println("\nFollowing is Depth First Traversal: ");
		for (int i = 0; i < vertices; i++) {
			if (!visited[i])
				g.DFS(i, visited);
		}
		sc.close();
	}

}