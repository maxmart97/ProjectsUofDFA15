
package snowmanlab;
import stddraw.StdDraw;
/**
 *
 * Author: Maxwell Martin
 * This code uses the class StdDraw to allow the user to draw a snowman
 */
public class SnowmanLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //This code sets the canvas size and the scale for the coordinate plane
        StdDraw.setCanvasSize(500, 500);
        StdDraw.setXscale(0.0, 500.0);
        StdDraw.setYscale(0.0, 500.0);
        
        //This code sets the variables for the bottom circle
        double x1 = 250.0;
        double y1 = 100.0;
        double radius1 = 100.0;
        
        //This code sets the variables for the middle circle that is 20% smaller than the bottom circle
        double x2 = 250.0;
        double y2 = 280.0;
        double radius2a = (radius1 * 0.20);
        double radius2b = (radius1-radius2a);
        
        //This code sets the variables for the top circle that is 20% smaller than the middle circle
        double x3 = 250.0;
        double y3 = 425.0;
        double radius3a = (radius2b * 0.20);
        double radius3b = (radius2b-radius3a);
        
        //This code sets the color for the bottom circle and the prints out the circle
        StdDraw.setPenColor(255, 0, 0);
        StdDraw.filledCircle(x1, y1, radius1);
        
        //This code sets the color for the middle circle and then prints out the circle
        StdDraw.setPenColor(0, 255, 0);
        StdDraw.filledCircle(x2, y2, radius2b);
        
        //This code sets the color for the top circle and then prints out the circle
        StdDraw.setPenColor(0, 0, 255);
        StdDraw.filledCircle(x3, y3, radius3b);
        
        //This code sets the variables for the left eye, sets the color, and then prints it out
        double x4 = 225.0;
        double y4 = 450.0;
        double radius5 = 10.0;
        StdDraw.setPenColor(0, 0, 0);
        StdDraw.filledCircle(x4, y4, radius5);
        
        //This code sets the variables for the right eye, sets the color, and then prints it out
        double x5 = 275.0;
        double y5 = 450.0;
        double radius6 = 10.0;
        StdDraw.setPenColor(0, 0, 0);
        StdDraw.filledCircle(x5, y5, radius6);
        
        //This code prints out the mouth of the snowman
        StdDraw.line(225.0, 400.0, 275.0, 400.0);
        
    }
    
}
