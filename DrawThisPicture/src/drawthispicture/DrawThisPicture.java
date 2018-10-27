
package drawthispicture;
import stddraw.StdDraw;


/**
 *
 * Author: Maxwell Martin
 * This code creates a 1000 squares with different colors
 * Date: 10/9/15
 */
public class DrawThisPicture {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int canvasWidth = 500;
            int canvasHeight = 500;
            StdDraw.setCanvasSize(canvasWidth, canvasHeight);
            StdDraw.setXscale(0, 500);
            StdDraw.setYscale(0, 500);
            
            for(int count = 0; count < 1000; count++)
            {
                double xCoordinate = 500 * Math.random();
                double yCoordinate = 500 * Math.random();
                if(xCoordinate < 250)
                {
                    StdDraw.setPenColor(StdDraw.RED);
                    StdDraw.filledSquare(xCoordinate, yCoordinate, 5);
                }
                else
                {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.filledSquare(xCoordinate, yCoordinate, 5);
                }
                if(xCoordinate > yCoordinate && xCoordinate < 250)
                {
                    StdDraw.setPenColor(StdDraw.YELLOW);
                    StdDraw.filledSquare(xCoordinate, yCoordinate, 5);
                }
                if(yCoordinate > xCoordinate && xCoordinate > 250)
                {
                    StdDraw.setPenColor(StdDraw.GREEN);
                    StdDraw.filledSquare(xCoordinate, yCoordinate, 5);
                }
                
                
                
                
            }
        
        
        
        
        
    }
}
