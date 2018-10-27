
package labseven;
import java.util.Random;
import java.util.Scanner;
import stddraw.StdDraw;



/**
 *
 * @author Maxwell
 */
public class LabSeven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int canvasWidth = 500;
            int canvasHeight = 500;
            StdDraw.setCanvasSize(canvasWidth, canvasHeight);
            StdDraw.setXscale(0, 500);
            StdDraw.setYscale(0, 500);
            
            double x = 250;
            double y = 250;
            double angle = 0;
            double velocityX = 5;
            double velocityY = 5;
            
            
            while(true)
            {
                Random theRandom = new Random();
                int theRed = theRandom.nextInt(255);
                int theBlue = theRandom.nextInt(255);
                int theGreen = theRandom.nextInt(255);
                StdDraw.setPenColor(theRed, theGreen, theBlue);
                StdDraw.filledCircle(x, y, 10);
                
                angle = angle + 0.03;
                velocityX = 30 * Math.cos(angle) * Math.cos(30 * angle);
                velocityY = 20 * Math.sin(angle) * Math.sin(2 * angle);
                x = x + velocityX;
                y = y + velocityY;
                
                if((x > canvasWidth) || (x < 0))
                {
                    velocityX = -1 * velocityX;
                }
                if((y > canvasHeight) || (y < 0))
                {
                    velocityY = -1 * velocityY;
                }
                
                StdDraw.show();
                
            }
    }
    
}
