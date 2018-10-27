
package programmingproject4;
import stddraw.StdDraw;

/**
 *
 * Author: Maxwell Martin
 * Date: 11/3/15
 * This is the class file that creates the actions for the turtle
 */
public class Turtle {
    //These are the instance variables
    private double xCoord;
    private double yCoord;
    private double direction;
    private boolean penDown;
    
    //This is the constructor that creates the information for basic turtle
    public Turtle(double x, double y) {
        xCoord = x;
        yCoord = y;
        direction = (Math.PI)/2; 
        StdDraw.setPenColor(StdDraw.BLACK);
    }
    
    //This is the method that allows the user to move the turtle a certain number of steps
    public void forward(int steps) {
        double oldXCoord = xCoord;
        double oldYCoord = yCoord;
        xCoord = xCoord + (steps * Math.cos(direction));
        yCoord = yCoord + (steps * Math.sin(direction));
        
        if(penDown) {
            StdDraw.line(oldXCoord, oldYCoord, xCoord, yCoord);
        }
    }
    
    //This is the method that lets the user turn the turtle any angle to the right
    public void right(double angle) {
        double correctAngle = convertNumber(angle);
        direction = direction - correctAngle;
        if(direction < 0) {
            direction = direction + 2*Math.PI;
        }
        if(direction > 2*Math.PI) {
            direction = direction - 2*Math.PI;
        }
    }
    
    //This is the method that lets the user turn the turtle any angle to the left
    public void left(double angle) {
        double correctAngle = convertNumber(angle);
        direction = direction + correctAngle;
        if(direction > 2*Math.PI) {
            direction = direction - 2*Math.PI;
        }
    }
    
    //This method converts their response to radians
    public double convertNumber(double response) {
        response = (response * Math.PI) / 180;
        return response;
    }

    //This method says the pen is UP
    public void penUp() {
        penDown = false;
    }
    
    //This method says the pen is DOWN
    public void penDown() {
        penDown = true;
    }

    //This method draws the turtle
    public void draw() {
        StdDraw.filledCircle(xCoord, yCoord, 5);
    }
    
    //This method checks to see what color the user entered and
    //sets the pen to that color if they entered a correct color
    public void setPenColor(String color) {
        if(color.equalsIgnoreCase("black")){
            StdDraw.setPenColor(StdDraw.BLACK);
        }
        else if(color.equalsIgnoreCase("red")) {
            StdDraw.setPenColor(StdDraw.RED);
        }
        else if(color.equalsIgnoreCase("green")) {
            StdDraw.setPenColor(StdDraw.GREEN);
        }
        else if(color.equalsIgnoreCase("yellow")) {
            StdDraw.setPenColor(StdDraw.YELLOW);
        }
        else if(color.equalsIgnoreCase("blue")) {
            StdDraw.setPenColor(StdDraw.BLUE);
        }
        else {
            System.out.println();
            System.out.println("You have entered an incorrect color.");
        }
    }
}
