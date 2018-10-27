
package rectangleintersect;
import stddraw.StdDraw;
import java.util.Scanner;

/**
 *
 * Author: Maxwell Martin
 * Date: 10/4/15
 * This code asks the user for centers, widths, and heights of two rectangles, prints the rectangles, and then colors them a certain color
 * if they intersect and a different color if they don't.
 */
public class RectangleIntersect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            StdDraw.setCanvasSize(500, 500);
            StdDraw.setXscale(0, 500.0);
            StdDraw.setYscale(0, 500.0);
            
            System.out.print("What is the x coordinate of the center of rectangle1? (Must be between 0 and 500) ");
            double xCoordinateRect1 = keyboard.nextDouble();
            
            System.out.print("What is the y coordinate of the center of rectangle1? (Must be between 0 and 500) ");
            double yCoordinateRect1 = keyboard.nextDouble();
            
            System.out.print("What is the width of rectangle1? ");
            double widthRect1 = keyboard.nextDouble();
            
            System.out.print("What is the height of rectangle1? ");
            double heightRect1 = keyboard.nextDouble();
            
            System.out.print("What is the x coordinate of the center of rectangle2? (Must be between 0 and 500) ");
            double xCoordinateRect2 = keyboard.nextDouble();
            
            System.out.print("What is the y coordinate of the center of rectangle2? (Must be between 0 and 500) ");
            double yCoordinateRect2 = keyboard.nextDouble();
            
            System.out.print("What is the width of rectangle2? ");
            double widthRect2 = keyboard.nextDouble();
            
            System.out.print("What is the height of rectangle2? ");
            double heightRect2 = keyboard.nextDouble();
            
            //This is the x-coordinate of the left side of rectangle 1
            double xCoordinateLeftSideRect1 = (xCoordinateRect1 - widthRect1);
            //This is the x coordinate of the right side of rectangle 2
            double xCoordinateRightSideRect2 = (xCoordinateRect2 + widthRect2);
            
            //This is the x-coordinate of the right side of rectangle 1
            double xCoordinateRightSideRect1 = (xCoordinateRect1 + widthRect1);
            //This is the x-coordinate of the left side of rectangle 2
            double xCoordinateLeftSideRect2 = (xCoordinateRect2 - widthRect2);
            
            //This is the y-coordinate of the bottom side of rectangle 1
            double yCoordinateBottomSideRect1 = (yCoordinateRect1 - heightRect1);
            //This is the y-coordinate of the top side of rectangle 2
            double yCoordinateTopSideRect2 = (yCoordinateRect2 + heightRect2);
            
            //This is the y-coordinate of the top side of rectangle 1
            double yCoordinateTopSideRect1 = (yCoordinateRect1 + heightRect1);
            //This is the y-coordinate of the bottom side of rectangle 2
            double yCoordinateBottomSideRect2 = (yCoordinateRect2 - heightRect2);
            
            
            if((xCoordinateLeftSideRect1 > xCoordinateRightSideRect2) || (xCoordinateRightSideRect1 < xCoordinateLeftSideRect2) || (yCoordinateBottomSideRect1 > yCoordinateTopSideRect2) || (yCoordinateTopSideRect1 < yCoordinateBottomSideRect2))
            {
                StdDraw.setPenColor(StdDraw.GREEN);
                StdDraw.filledRectangle(xCoordinateRect1, yCoordinateRect1, widthRect1, heightRect1);
                StdDraw.filledRectangle(xCoordinateRect2, yCoordinateRect2, widthRect2, heightRect2);
            }
            else
            {
                StdDraw.setPenColor(StdDraw.RED);
                StdDraw.filledRectangle(xCoordinateRect1, yCoordinateRect1, widthRect1, heightRect1);
                StdDraw.filledRectangle(xCoordinateRect2, yCoordinateRect2, widthRect2, heightRect2);
            }
            
            System.out.println("Your rectangles should be drawn.");
            
            //StdDraw.rectangle(xCoordinateRect1, yCoordinateRect1, widthRect1, heightRect1);
            //StdDraw.rectangle(xCoordinateRect2, yCoordinateRect2, widthRect2, heightRect2);
            
            
            
            
    }
    
}
