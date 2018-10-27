
package ifexampletwo;
import stddraw.StdDraw;

/**
 *
 * @author Maxwell
 */
public class IfExampleTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StdDraw.setCanvasSize(500, 500);
        StdDraw.setXscale(-250.0, 250.0);
        StdDraw.setYscale(-250.0, 250.0);
        
        int count = 0;
        while(count < 1000000)
        {
            double x = 500.0 * Math.random() - 250.0;
            double y = 500.0 * Math.random() - 250.0;
            double dist = Math.sqrt(x*x + y*y);
        
        
            if(dist < 100)
            {
                StdDraw.setPenColor(StdDraw.RED);
            }
            else if(dist < 200)
            {
                StdDraw.setPenColor(StdDraw.BLUE);
            }
            else
            {
                StdDraw.setPenColor(StdDraw.YELLOW);
            }

            StdDraw.circle(x, y, 10);
            
            count += 1;
        
        }
        
    }
    
}
