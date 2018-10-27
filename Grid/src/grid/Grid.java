
package grid;
import stddraw.StdDraw;



/**
 *
 * @author Maxwell
 */
public class Grid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StdDraw.setCanvasSize(600, 600);
        StdDraw.setXscale(0, 600);
        StdDraw.setYscale(0, 600);
        
       //for(int x = 30; x < 600; x = x + 60)
        //{
        //    StdDraw.setPenColor((x-30)/3, (x-30)/3, (x-30)/3);
        //    StdDraw.filledSquare(x, 300, 30);
        //}
        
        for(int ycount = 0; ycount < 10; ycount++)
        {
            for(int count = 0; count < 10; count ++)
            {
                StdDraw.setPenColor(255 - ycount * 25, count*25, 0);
                StdDraw.filledSquare(30 + 60*count, 30 + 60*ycount, 30);
            }
        }
        
        
        
        
    }
    
}
