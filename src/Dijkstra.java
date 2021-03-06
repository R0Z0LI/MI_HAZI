import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Dijkstra {

    public static double calculateShortestPath(Node startNode, Node endNode) {
        startNode.distance = 0.d;

        Set<Node> settledNodes = new HashSet<>();
        Set<Node> unsettledNodes = new HashSet<>();

        unsettledNodes.add(startNode);

        while (unsettledNodes.size() != 0) {
            Node currentNode = getLowestDistanceNode(unsettledNodes);
        	System.out.println(currentNode.toString());
        	for(Node node : currentNode.getAdjacentNodes()) {
        		System.out.println(node.distance);
        	}
        	
            unsettledNodes.remove(currentNode);
            for (Node adjacentNode : currentNode.getAdjacentNodes()) {
                double weight = adjacentNode.distance;
                if (!settledNodes.contains(adjacentNode)) {
                    calculateMinimumDistance(adjacentNode, weight, currentNode);
                    unsettledNodes.add(adjacentNode);
                }
            }
            settledNodes.add(currentNode);
        }

        return endNode.distance;

    }

    private static Node getLowestDistanceNode(Set<Node> unsettledNodes) {
    	System.out.println(unsettledNodes.size());
        Node lowestDistanceNode = null;
        double lowestDistance = Double.MAX_VALUE;
        for (Node node: unsettledNodes) {
            double nodeDistance = node.distance;
            if (nodeDistance < lowestDistance) {
                lowestDistance = nodeDistance;
                lowestDistanceNode = node;
            }
        }
        return lowestDistanceNode;
    }

    private static void calculateMinimumDistance(Node evaluationNode, double edgeWeight, Node sourceNode) {
        Double sourceDistance = sourceNode.distance;
        if (sourceDistance + edgeWeight < evaluationNode.distance) {
            evaluationNode.distance = sourceDistance + edgeWeight;
            LinkedList<Node> shortestPath = new LinkedList<>(sourceNode.shortestPath);
            shortestPath.add(sourceNode);
            evaluationNode.shortestPath = shortestPath;
        }
    }


}
