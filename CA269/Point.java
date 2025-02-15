//Here is a Point class and an Order interface. Modify the Point class so that it properly implements the Order interface.
//Two Points should be compared by first checking the x coordinate. Whichever Point has the smaller x coordinate, 
//then that Point will be regarded as being smaller. If the two x coordinates are the same, 
//then use the y coordinate as a decider.

//Note: if both x and y are equal, you should return false to signal it is NOT less than the other value

public interface Order {
    public boolean lessThan(Order other);
}

public class Point {
    private double x, y;

    public Point(double newX, double newY) {
        x = newX;
        y = newY;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}