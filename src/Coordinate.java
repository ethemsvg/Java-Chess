public class Coordinate {

    int x;
    int y;

    public Coordinate(){

    }
    public Coordinate(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}
