
package labten;
import stddraw.StdDraw;

/**
 *
 * @author Maxwell
 */
public class MovingCircle {
    private int myX;
    private int myY;
    private int myXVelocity;
    private int myYVelocity;
    private int myRadius;
    private int myRed;
    private int myGreen;
    private int myBlue;
    
    
    //Default Constructor
    public MovingCircle() {
        myX = 250;
        myY = 250;
        myXVelocity = 1;
        myYVelocity = 0;
        myRadius = 20;
        myRed = 0;
        myGreen = 0;
        myBlue = 0;
        
    }
    
    public MovingCircle(int x, int y, int xVelocity, int yVelocity, int radius) {
        myX = x;
        myY = y;
        myXVelocity = xVelocity;
        myYVelocity = yVelocity;
        myRadius = radius;
        myRed = 0;
        myGreen = 0;
        myBlue = 0;
    }
    
    public void setColor(int red, int green, int blue) {
        myRed = red;
        myGreen = green;
        myBlue = blue;
    }
    
    //Move method - make the circle move one step
    public void move() {
        myX = myX + myXVelocity;
        myY = myY + myYVelocity;
        if((myX < 0) || (myX > 500)) {
            myXVelocity = -1 * myXVelocity;
        }
        
        if((myY < 0) || (myY > 500)) {
            myYVelocity = -1 * myYVelocity;
        }
    }
    
    //Draw method - draw the circle at its current location
    public void draw() {
        StdDraw.setPenColor(myRed, myGreen, myBlue);
        StdDraw.filledCircle(myX, myY, myRadius);
        
    }
}
