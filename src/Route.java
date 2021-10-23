public class Route {
    public int index1;
    public int index2;

    public Route(int index1, int index2) {
    	this.index1 = index1;
    	this.index2 = index2;
    }
    
    public boolean contains(int index) {
        if(index == index1 || index == index2) {
            return true;
        } else {
            return false;
        }
    }
}
