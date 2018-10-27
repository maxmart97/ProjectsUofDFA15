
package lab12;
import stddraw.StdDraw;
/**
 *
 * Author: Maxwell Martin
 */
public class Lab12 {


    public static void main(String[] args) {
        StdDraw.setCanvasSize(600, 600);
        
        StdDraw.setXscale(-0.5, 0.5);
        
        StdDraw.setYscale(-0.5, 0.5);
        
        Point2D location = new Point2D(0.0, 0.3);
        Vector2D motion = new Vector2D(0.03, 0);
        Planet xenon = new Planet(location, motion);
        
        Point2D sunLocation = new Point2D(0.0, 0.0);
        
        Point2D location2 = new Point2D(0.1, 0.2);
        Vector2D motion2 = new Vector2D(0.03, 0);
        Planet xenon2 = new Planet(location2, motion2);

        while(true) {
            //StdDraw.clear();
            
            //Draw the Sun
            StdDraw.setPenColor(StdDraw.YELLOW);
            StdDraw.filledCircle(0.0, 0.0, 0.05);
            
            //Draw the Planet
           // xenon.draw();
            
            //Trace the Orbit
            xenon.drawTrace();
            xenon2.drawTrace();
            
            //Move the Planet
            xenon.orbit(sunLocation);
            xenon2.orbit(sunLocation);
            
            StdDraw.show(1);
        }
    }
    
}
