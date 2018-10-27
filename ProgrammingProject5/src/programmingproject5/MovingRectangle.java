
package programmingproject5;
import stddraw.StdDraw;

/**
 *
 * Author: Maxwell Martin
 * Date: 11/10/15
 * This is the class file that has all the information for a moving rectangle and what the moving rectangle can do
 * It also has couple of methods that are used as checks (isRed, isMouseInRectangle) and a method for changing color to red
 */
public class MovingRectangle {
    //These are the instance variables for the class
    private double myXLocation;
    private double myYLocation;
    private double myHeight;
    private double myWidth;
    private double myXVelocity;
    private double myYVelocity;
    private int myRed;
    private int myGreen;
    private int myBlue;
    
    //This creates a moving rectangle and all the parameters that a rectangle has
    public MovingRectangle() {
        myXLocation = 500 * Math.random();
        myYLocation = 500 * Math.random();
        myHeight = 100 * Math.random() + 10;
        myWidth = 100 * Math.random() + 10;
        myXVelocity = 0.6 * Math.random();
        myYVelocity = 0.6 * Math.random();
        myRed = (int) Math.floor(255 * Math.random());
        myGreen = (int) Math.floor(255 * Math.random());
        myBlue = (int) Math.floor(255 * Math.random());
    }
    
    //This is a method that allows the rectangle to move and bounce off the walls
    public void move() {
        myXLocation = myXLocation + myXVelocity;
        myYLocation = myYLocation + myYVelocity;
        if((myXLocation < 0) || (myXLocation > 600)) {
            myXVelocity = -1 * myXVelocity;
            myRed = (int) Math.floor(255 * Math.random());
            myGreen = (int) Math.floor(255 * Math.random());
            myBlue = (int) Math.floor(255 * Math.random());
            StdDraw.setPenColor(myRed, myGreen, myBlue);
        }
        
        if((myYLocation < 0) || (myYLocation > 600)) {
            myYVelocity = -1 * myYVelocity;
            myRed = (int) Math.floor(255 * Math.random());
            myGreen = (int) Math.floor(255 * Math.random());
            myBlue = (int) Math.floor(255 * Math.random());
            StdDraw.setPenColor(myRed, myGreen, myBlue);
        }
    }
    
    //This draws the rectangles to the screen when called
    public void draw() {
        StdDraw.setPenColor(myRed, myGreen, myBlue);
        StdDraw.filledRectangle(myXLocation, myYLocation, myWidth, myHeight);
    }
    
    //This method stops the rectangle when called
    public void stop() {
        myXVelocity = 0;
        myYVelocity = 0;
    }
    
    //This method checks if the mouse pointer is inside a rectangle on the screen
    public boolean isMouseInRectangle() {
        if((StdDraw.mouseX() > myXLocation-myWidth) && (StdDraw.mouseX() < myXLocation+myWidth) && 
           (StdDraw.mouseY() > myYLocation-myHeight) && (StdDraw.mouseY() < myYLocation+myHeight)) {
            return true;
        }
        else {
            return false;
        }
    }
    
    //This method changes the rectangle or any sort of object to a red color when called
    public void changeColorToRed() {
        StdDraw.setPenColor(StdDraw.RED);
        myRed = 255;
        myGreen = 0;
        myBlue = 0;
    }
    
    //This checks if the rectangle or any sort of object is the color red
    public boolean isRed() {
        if((myRed==255) && (myBlue==0) && (myGreen==0)){
            return true;
        }
        else {
            return false;
        }
    }
}
