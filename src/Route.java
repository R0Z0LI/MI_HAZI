public class Route {
    public int index1;
    public int index2;


    public boolean contains(int index) {
        if(index == index1 || index == index2) {
            return true;
        } else {
            return false;
        }
    }
}
