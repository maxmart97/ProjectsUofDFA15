
package programmingproject6;
import stddraw.StdDraw;
import java.util.Random;

/**
 *
 * Author: Maxwell Martin
 * Date: 11/16/15
 * This is the class file that has all the information for a moving rectangle and what the moving rectangle can do
 * It also has various checks that allow for the game to work
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
    private double myOldXVelocity;
    private double myOldYVelocity;
    private boolean isRed;
    private int clickCount;
    private int counter;
    
    //This creates a moving rectangle and all the parameters that a rectangle has
    public MovingRectangle() {
        myXLocation = 500 * Math.random();
        myYLocation = 500 * Math.random();
        myHeight = 100 * Math.random() + 10;
        myWidth = 100 * Math.random() + 10;
        myXVelocity = 0.2 * Math.random();
        myYVelocity = 0.2 * Math.random();
        myRed = (int) Math.floor(255 * Math.random());
        myGreen = (int) Math.floor(255 * Math.random());
        myBlue = (int) Math.floor(255 * Math.random());
        isRed = false;
        clickCount = (int) Math.floor((3 * Math.random()) + 1);
        counter = 0;
    }
    
    //This is a method that allows the rectangle to move and bounce off the walls
    public void move() {
        if(!isRed){
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
    }
    
    //This draws the rectangles to the screen when called
    public void draw() {
        StdDraw.setPenColor(myRed, myGreen, myBlue);
        StdDraw.filledRectangle(myXLocation, myYLocation, myWidth, myHeight);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.text(myXLocation, myYLocation, clickCount+"");
        counter++;
    }
    
    //This is a method that makes the frozen rectangle move again once touched by a moving rectangle
    public void moveAgain() {
        isRed = false;
        clickCount = (int) Math.floor((3 * Math.random()) + 1);
    }
    
    //This method stops the rectangle when called
    public void stop() {
        isRed = true;
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
    
    //This method decreases the click count by one
    //It also sets the variable isRed to true once the clickcount has reached zero
    public void decrementClickCount() {
        if(counter>100){
            clickCount = clickCount - 1;
            counter = 0;
            if(clickCount<=0){
                isRed = true;
            }
        }    
    }
    
    //This method changes the rectangle or any sort of object to a red color when called
    public void changeColorToRed() {
        if(clickCount==0){
            StdDraw.setPenColor(StdDraw.RED);
            myRed = 255;
            myGreen = 0;
            myBlue = 0;
        }
    }
    
    //This checks if the rectangle or any sort of object is the color red
    public boolean isRed() {
        if((myRed==255) && (myBlue==0) && (myGreen==0) && (isRed)){
            return true;
        }
        else {
            return false;
        }
    }
    
    //This gets the x value of an object
    public double getX() {
        return myXLocation;
    }
    
    //This gets the y value of an object
    public double getY() {
        return myYLocation;
    }
    
    //This gets the height of an object
    public double getHeight() {
        return myHeight;
    }
    
    //This gets the width of an object
    public double getWidth() {
        return myWidth;
    }
    
    //This checks to see if rectangles are touching each other
    public boolean isTouchingRectangle(MovingRectangle otherRectangle) {
        double leftSideX = otherRectangle.getX() - otherRectangle.getWidth();
        double rightSideX = otherRectangle.getX() + otherRectangle.getWidth();
        double bottomSideY = otherRectangle.getY() - otherRectangle.getHeight();
        double topSideY = otherRectangle.getY() + otherRectangle.getHeight();
        
        double myLeftSideX = myXLocation - myWidth;
        double myRightSideX = myXLocation + myWidth;
        double myBottomSideY = myYLocation - myHeight;
        double myTopSideY = myYLocation + myHeight;
        
        if(((myLeftSideX > leftSideX && myLeftSideX < rightSideX) || (myRightSideX > leftSideX && myRightSideX < rightSideX)) 
            && ((myBottomSideY > bottomSideY && myBottomSideY < topSideY) || (myTopSideY > bottomSideY && myTopSideY < topSideY))) {
            return true;
        }
        else {
            return false;
        }
    }
}
