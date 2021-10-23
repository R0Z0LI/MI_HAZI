
public class Node {
	public int index;
	public Coordinate c;
	
	public long getDistanceBetween(Node n1) {
		double d1x = (double)c.x;
		double d1y = (double)c.y;
		double d2x = (double)n1.c.x;
		double d2y = (double)n1.c.y;
		return (long) Math.sqrt((Math.pow(d1x - d2x, 2) + Math.pow(d1y - d2y,2)));
	}
}
