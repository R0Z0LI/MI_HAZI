import java.util.List;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Node {
	public int index;
	public Coordinate coordinate;
	public Set<Edge> edges;
	public Double distance = Double.MAX_VALUE;
	public List<Node> shortestPath = new LinkedList<>();

	public Node() {

	}

	public Node(int index, long x, long y) {
		this.index = index;
		this.coordinate = new Coordinate(x, y);
		this.edges = new HashSet<>();
	}

	public int getIndex() {
		return index;
	}

	public void addEdge(Edge edge) {
		edges.add(edge);
	}

	public Set<Node> getAdjacentNodes() {
		Set<Node> adjacentNodes = new HashSet<>();
		for (Edge edge: edges ) {
			adjacentNodes.add(edge.getOther(this));
		}
		return adjacentNodes;
	}

	@Override
	public String toString() {
		String edges = "";
		for (Edge edge : this.edges) {
			edges += edge.toString() + "\n";
		}

		String node =
				"Index: " + this.index + "\n " +
				"Coordinates: " + this.coordinate.toString()+ "\n" +
				"Edges:" + edges;

		return node;
	}
}
