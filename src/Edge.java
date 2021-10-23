
public class Edge {
    public Node node1;
    public Node node2;
    public long length;

    public Edge(Node node1, Node node2) {
        this.node1 = node1;
        this.node2 = node2;
        this.length = calculateLength();
    }

    private long calculateLength() {
        double d1x = (double) node1.coordinate.x;
        double d1y = (double) node1.coordinate.y;
        double d2x = (double) node2.coordinate.x;
        double d2y = (double) node2.coordinate.y;
        return (long) Math.sqrt((Math.pow(d1x - d2x, 2) + Math.pow(d1y - d2y, 2)));
    }

    @Override public String toString(){
        return "Nodes: [ " + node1.getIndex() + " , " + node2.getIndex() +" ], length: " + this.length;
    }
}
