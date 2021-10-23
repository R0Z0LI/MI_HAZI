import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Graph {

    private Set<Node> nodes = new HashSet<>();

    public void addNode(Node nodeA) {
        nodes.add(nodeA);
    }

    public Node getNode(int index) {
        Node result = null;
        for(Node node : nodes) {
            if (node.getIndex() == index) {
                result = node;
            }
        }
        return result;
    }

    public Set<Node> getNodes() {
        return nodes;
    }

    public void setNodes(Set<Node> nodes) {
        this.nodes = nodes;
    }

    public void reset() {
        for(Node node : nodes) {
            node.distance = Double.MAX_VALUE;
            node.shortestPath = new LinkedList<>();
        }
    }
}