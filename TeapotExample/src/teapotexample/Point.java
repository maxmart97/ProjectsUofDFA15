
package teapotexample;
import stddraw.StdDraw;

/**
 *
 * @author Maxwell
 */
public class Point {
    
    private double myX;
    private double myY;
    private double myZ;
    
    public Point() {
        //myX = 0;
        //myY = 0;
        //myZ = 0;
        this(0, 0, 0);
    }
    
    public Point(double x, double y, double z) {
        myX = x;
        myY = y;
        myZ = z;
    }
    
    public Point(Point other) {
        this.myX = other.myX;
        this.myY = other.myY;
        this.myZ = other.myZ;
    }
    
    public double getX() {
        return myX;
    }
    
    public double getY() {
        return myY;
    }
    
    public double getZ() {
        return myZ;
    }
    
    public void setX(double x) {
        myX = x;
    }
    
    public void setY(double y) {
        myY = y;
    }
    
    public void setZ(double z) {
        myZ = z;
    }
    
    public void draw() {
        StdDraw.point(myX, myY);
    }
    
}
