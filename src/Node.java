import java.util.Set;

public class Node {
	public int index;
	public Coordinate coordinate;
	public Set<Edge> edges;

	public Node() {

	}

	public Node(int index, long x, long y) {
		//coordinate = new Coordinate(x,y);
	}

	public void addRoute() {

	}
	
	public long getDistanceBetween(Node n1) {
		double d1x = (double) coordinate.x;
		double d1y = (double) coordinate.y;
		double d2x = (double)n1.coordinate.x;
		double d2y = (double)n1.coordinate.y;
		return (long) Math.sqrt((Math.pow(d1x - d2x, 2) + Math.pow(d1y - d2y,2)));
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
}
