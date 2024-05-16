import java.util.*;

class Graph2<T> {
	Map<T, List<T>> adjList;
	int vertices;

	Graph2() {
		adjList = new HashMap<>();
		vertices = 0;
	}

	void addVertex(T vertex) {
		if (!adjList.containsKey(vertex)) {
			adjList.put(vertex, new ArrayList<>());
			vertices++;
		}
	}

	void addEdge(T src, T des) {
		if (!adjList.containsKey(src))
			addVertex(src);
		if (!adjList.containsKey(des))
			addVertex(des);

		adjList.get(src).add(des);
	}

	void printAdjList() {
		for (Map.Entry<T, List<T>> entry : adjList.entrySet()) {
			T vertex = entry.getKey();
			List<T> neighbours = entry.getValue();
			System.out.print("Vertex " + vertex + ": ");
			for (T neighbour : neighbours)
				System.out.println(neighbour + " ");
		}
		System.out.println();
	}

	int getIndex(T vertex) {
		int index = 0;
		for (T v : adjList.keySet()) {
			if (v.equals(vertex))
				return index;
			index++;
		}
		return -1;
	}

	void DFS(T startVertex, boolean[] visited) {
		visited[getIndex(startVertex)] = true;
		System.out.print(startVertex + " ");

		List<T> neighbours = adjList.get(startVertex);
		for (T neighbour : neighbours) {
			if (!visited[getIndex(neighbour)]) {
				DFS(neighbour, visited);
			}
		}
	}
}

public class Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Graph2<Integer> g = new Graph2<>();

		System.out.println("Enter the number of edges: ");
		int edges = sc.nextInt();

		System.out.println("Enter the edges(source destination): ");
		for (int i = 0; i < edges; i++) {
			System.out.println("Source: ");
			int source = sc.nextInt();
			System.out.println("Destination: ");
			int destination = sc.nextInt();
			g.addEdge(source, destination);
		}

		boolean[] visited = new boolean[g.vertices];
		System.out.println("\nAdjancecy List:");
		g.printAdjList();
		System.out.println("\nEnter the starting vertex for Depth First Traversal: ");
		int stIndex = sc.nextInt();
		g.DFS(stIndex, visited);
		sc.close();
	}

}
