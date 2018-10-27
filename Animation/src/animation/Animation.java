
package animation;
import java.util.Random;
import stddraw.StdDraw;


/**
 *
 * @author Maxwell
 */
public class Animation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int theCanvasWidth = 500;
        int theCanvasHeight = 500;
        StdDraw.setCanvasSize(theCanvasWidth, theCanvasHeight);
        StdDraw.setXscale(0.0, theCanvasWidth);
        StdDraw.setYscale(0.0, theCanvasHeight);
        
        double x = 250.0;
        double y = 250.0;
        double angle = 0.0;
        double xVelocity = 5 * Math.cos(angle);
        double yVelocity = 5 * Math.sin(angle);

        
        while(true)
        {
            //StdDraw.clear();
            Random theRandom = new Random();
            int theRed = theRandom.nextInt(255);
            int theBlue = theRandom.nextInt(255);
            int theGreen = theRandom.nextInt(255);
            StdDraw.setPenColor(theRed, theGreen, theBlue);
            
            StdDraw.filledCircle(x, y, 4);
            //x = x + 1;
            //x += 1;
            //x++;
            angle = angle + 0.03;
            xVelocity = 5 * Math.cos(angle) * Math.cos(3.01 * angle);
            yVelocity = 3.01 * Math.sin(angle) * Math.sin(2.0 * angle);
            x = x + xVelocity;
            y = y + yVelocity;
            if((x > theCanvasWidth) || (x < 0))
            {
               xVelocity = -1 * xVelocity;
            }
            if((y > theCanvasHeight) || (y < 0))
            {
                yVelocity =  -1 * yVelocity;
            }
            //if(x < 0)
            //{
              //  xVelocity = -1 * xVelocity;
            //}
            StdDraw.show(1);
        }
        
    }
    
}
