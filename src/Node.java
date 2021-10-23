import java.util.HashSet;
import java.util.Set;

public class Node {
	public int index;
	public Coordinate coordinate;
	public Set<Edge> edges;

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

	public void setIndex(int index) {
		this.index = index;
	}

	public void addEdge(Edge edge) {
		edges.add(edge);
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
