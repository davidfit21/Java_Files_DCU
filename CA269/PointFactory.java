// class implements an interface:

class Point implements GridQuadrant, CompareQuadrant {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;

    } 

    public double getX() {
        return this.x;
    } 

    public double getY() {
        return this.y;
    } 

    public Quadrant getQuadrant() {

        if (x > 0 && y > 0) {
            return Quadrant.Q1;
        }

        else if (0 > x && y > 0)
            return Quadrant.Q2;
        else if (x < 0 && 0 > y)
            return Quadrant.Q3;
        else if (x > 0 && 0 > y)
            return Quadrant.Q4;

        else {
            return null;
        }

    }

    public boolean isInSameQuadrant(Point point) {
        if (this.getQuadrant() == point.getQuadrant()) {
            return true;
        }
        else {
            return false;
        }

    }
}

////////////////////////////////////////////

enum Quadrant {
    Q1, // x +ve, y +ve
    Q2, // x -ve, y +ve
    Q3, // x -ve, y -ve
    Q4; // x +ve, y -ve
}

////////////////////////////////////////////////////////////////////////////



interface GridQuadrant {
    Quadrant getQuadrant(); // return which quadrant the point is in
        // if point is at (0,0) return null
}


interface CompareQuadrant {
    boolean isInSameQuadrant(Point point);

}



interface PointMaker {
    Point makePoint(double x, double y);
    int countPointsCreated();
}

// TODO: create class PointFactory which implements the interface PointMaker

public class PointFactory implements PointMaker{

    int instances_created = 0;

    // implements pointmaker: needs its 2 functions:

    public Point makePoint(double x, double y) {
        instances_created++;
        return new Point(x,y);
    }

    public int countPointsCreated() {
        return instances_created;
    }


}