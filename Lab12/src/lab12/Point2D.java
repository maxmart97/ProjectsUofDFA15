
package lab12;

/**
 *  This class represents a 2 dimensional geometric point
 * @author Maxwell
 */
public class Point2D {
    
    // Instance Variables
    private double myX;
    private double myY;
    
    public Point2D() {
            this(0.0, 0.0);
    }
    
    public Point2D(double x, double y) {
            myX = x;
            myY = y;
    }
    
    // Copy Constructor
    public Point2D(Point2D otherPoint) {
            myX = otherPoint.getX();
            myY = otherPoint.getY();
    }
    
    public void addVector(Vector2D aVector) {
            myX = myX + aVector.getDiffX();
            myY = myY + aVector.getDiffY();
    }
    
    public Vector2D vectorToHere(Point2D origin) {
            return new Vector2D(origin, this);
    }
    
    public double getX() {
            return myX;
    }
    
    public double getY() {
            return myY;
    }
    
    public void print() {
            System.out.println("X: " + myX + " " + "Y: " + myY);
    }
    
    public String toString() {
            return "X: " + myX + " " + "Y: " + myY;
    }
    
    
    
    
    
}
