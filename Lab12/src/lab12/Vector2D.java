
package lab12;

/**
 *  This class represents a direction in 2 dimensions.
 * @author Maxwell
 */
public class Vector2D {
    private double myDiffX;
    private double myDiffY;
    
    public Vector2D() {
            this(0.0, 0.0);
    }
    
    public Vector2D(double diffx, double diffy) {
            myDiffX = diffx;
            myDiffY = diffy;
    }
    
    public Vector2D(Vector2D otherVector) {
            //myDiffX = otherVector.getDiffX();
            //myDiffY = otherVector.getDiffY();
            this(otherVector.getDiffX(), otherVector.getDiffY());
    }
    
    public Vector2D(double firstX, double firstY, double secondX, double secondY) {
            this(secondX - firstX, secondY - firstY);
    }
    
    public Vector2D(Point2D startPoint, Point2D endPoint) {
            this(endPoint.getX() - startPoint.getX(), endPoint.getY() - startPoint.getY());
    }
    
    public double getDiffX() {
            return myDiffX;
    }
    
    public double getDiffY() {
            return myDiffY;
    }
    
    public double getLength() {
            return Math.sqrt(myDiffX*myDiffX + myDiffY * myDiffY);
    }
    
    public void scale(double s) {
            myDiffX = s * myDiffX;
            myDiffY = s * myDiffY;
    }
    
    public void addVector(Vector2D otherVector) {
            myDiffX = otherVector.getDiffX() + myDiffX;
            myDiffY = otherVector.getDiffY() + myDiffY;
    }
    
    public Vector2D getUnitVector() {
            return new Vector2D(myDiffX / getLength(), myDiffY / getLength());
    }
    
    public String toString() {
            return "Diff X: " + myDiffX + " Diff Y: " + myDiffY;
    }
    
    

}   
