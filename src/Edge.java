
public class Edge {
    public Node node1;
    public Node node2;
    public double length;

    public Edge(Node node1, Node node2) {
        this.node1 = node1;
        this.node2 = node2;
        this.length = calculateLength();
    }
    
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
    

    public Node getOther(Node node) {
        Node other = null;
        if (node.equals(node1)) {
            other = node2;
        } else {
            other = node1;
        }
        return other;
    }

    private double calculateLength() {
        double d1x = (double) node1.coordinate.x;
        double d1y = (double) node1.coordinate.y;
        double d2x = (double) node2.coordinate.x;
        double d2y = (double) node2.coordinate.y;
        return round( Math.sqrt((Math.pow(d1x - d2x, 2) + Math.pow(d1y - d2y, 2))),2);
    }

    @Override public String toString(){
        return "Nodes: [ " + node1.getIndex() + " , " + node2.getIndex() +" ], length: " + this.length;
    }
}
