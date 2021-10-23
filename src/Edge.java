import java.util.ArrayList;

public class Edge {
		public Node node1;
		public Node node2;
		public long length;
		
		public Edge(Node node1, Node node2) {
			//length = calculateLength()
		}


		
		void calculateLength(ArrayList<Node> nodes) {
			for(Node n1 : nodes) {
				for(Node n2 : nodes) {
					//calculate from node1, node2 coordinates
				}
			}
		}
}
