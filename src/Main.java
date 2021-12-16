import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    static Graph graph = new Graph();
    static ArrayList<Route> routes = new ArrayList<Route>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOfRoutes = scanner.nextInt();
        int numberOfNodes = scanner.nextInt();
        int numberOfEdges = scanner.nextInt();

        readRouteEndPoints(numberOfRoutes);
        createNodes(numberOfNodes);
        createEdges(numberOfEdges);
        scanner.close();

        for(Route route : routes) {
            Node node1 = graph.getNode(route.index1);
            Node node2 = graph.getNode(route.index2);
            Dijkstra.calculateShortestPath(node1, node2);
            graph.reset();
        }


        for(Node node : graph.getNodes()) {
        	System.out.println(node.toString());
        }
    }

    private static void createEdges(int numberOfEdges) {
        for (int i = 0; i < numberOfEdges; i++) {
            int s = scanner.nextInt();
            Node node1 = getNodeByIndex(s);
            int f = scanner.nextInt();
            Node node2 = getNodeByIndex(f);

            Edge edge = new Edge(node1, node2);
            node1.addEdge(edge);
            node2.addEdge(edge);

        }
    }

    private static void createNodes(int numberOfNodes) {
        for (int i = 0; i < numberOfNodes; i++) {
            int index = i;
            long x = scanner.nextLong();
            long y = scanner.nextLong();
            Node node = new Node(index, x, y);
            graph.getNodes().add(node);
        }
    }

    private static void readRouteEndPoints(int numberOfRoutes) {
        for (int i = 0; i < numberOfRoutes; i++) {
            int r = scanner.nextInt();
            int f = scanner.nextInt();
            Route route = new Route(r, f);

            routes.add(route);
        }
    }

    private static Node getNodeByIndex(int index) {
        Node result = null;
        for (Node node : graph.getNodes()) {
            if (node.getIndex() == index) {
                result =  node;
            }
        }
        return result;
    }

}
