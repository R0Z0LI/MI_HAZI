import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


public class Main {
    static ArrayList<Node> nodes = new ArrayList<Node>();
    static ArrayList<Route> routes = new ArrayList<Route>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfRoutes = scan.nextInt();
        int numberOfNodes = scan.nextInt();
        int numberOfEdges = scan.nextInt();

        for (int i = 0; i < numberOfRoutes; i++) {
            Route route = new Route();
            int r = scan.nextInt();
            int f = scan.nextInt();

            route.index1 = r;
            route.index2 = f;

            routes.add(route);
        }

        for (int i = 0; i < numberOfNodes; i++) {
            int index = i;
            long x = scan.nextLong();
            long y = scan.nextLong();
            Node node = new Node(index, x, y);
            nodes.add(node);
        }

        for (int i = 0; i < numberOfEdges; i++) {
            int s = scan.nextInt();
            Node node1 = getNodeByIndex(s);
            int f = scan.nextInt();
            Node node2 = getNodeByIndex(f);

            Edge edge = new Edge(node1, node2);
            node1.addEdge(edge);

        }
        scan.close();
    }

    private static Node getNodeByIndex(int index) {
        Node result = null;
        for (Node node : nodes) {
            if (node.getIndex() == index) {
                result =  node;
            }
        }
        return result;
    }

}
