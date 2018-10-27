
package shapes;
import java.util.Scanner;
import stddraw.StdDraw;

/**
 *
 * @author Maxwell
 */
public class Shapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int theCanvasWidth = 500;
            int theCanvasHeight = 500;
            
            StdDraw.setCanvasSize(theCanvasWidth, theCanvasHeight);
            StdDraw.setXscale(0, theCanvasWidth);
            StdDraw.setYscale(0, theCanvasHeight);
            
            String theInput = "";
            while(!theInput.equalsIgnoreCase("quit"))
            {
                Scanner theScanner = new Scanner(System.in);
                System.out.println("Enter a color: ");
                String theColor = theScanner.nextLine();
                if(theColor.equalsIgnoreCase("red"))
                {
                    StdDraw.setPenColor(StdDraw.RED);
                }
                else if(theColor.equalsIgnoreCase("green"))
                {
                StdDraw.setPenColor(StdDraw.GREEN);
                }
                else
                {
                    System.out.println("You did not choose a good color");
                }
                System.out.println("Enter a shape: ");
                String theShape = theScanner.nextLine();
                if(theShape.equalsIgnoreCase("square"))
                {
                    //Draw a Square
                    double x = theCanvasWidth * Math.random();
                    double y = theCanvasHeight * Math.random();
                    double squareSize = 30 * Math.random();
                    StdDraw.square(x, y, squareSize);
                }
                else if(theShape.equalsIgnoreCase("triangle"))
                {
                //Draw a triangle
                }
                else
                {
                    System.out.println("You did not choose a good shape");
                }
                System.out.println("Do you want more shapes?");
                theInput = theScanner.nextLine();
            }
            System.out.println("Thank you for your time.");
    }
    
}
