import java.util.ArrayList;

public class Routes {
		public int start;
		public int finish;
		public long distance;
		public boolean toBeFound;
		
		public Routes(int s, int f) {
			start = s;
			finish = f;
			distance = 0;
			toBeFound = false;
		}
		
		void distanceCounter(ArrayList<Node> nodes) {
			for(Node n1 : nodes) {
				for(Node n2 : nodes) {
					if(n1.index == start && n2.index == finish) {
						distance = n1.getDistanceBetween(n2);
					}
				}
			}
		}
}
