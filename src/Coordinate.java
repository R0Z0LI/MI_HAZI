
public class Coordinate {
	public long x;
	public long y;
	
	public Coordinate(long x, long y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "(" + x + ";" + y + ")";
	}
}
