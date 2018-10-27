
package lab12;
import stddraw.StdDraw;

/**
 *
 * @author Maxwell
 */
public class Planet {
    private Point2D myLocation;
    private Vector2D myMotion;
    
    public Planet(Point2D location, Vector2D motion) {
        
            myLocation = location;
            myMotion = motion;
    }
    
    public void draw() {
        
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.filledCircle(myLocation.getX(), myLocation.getY(), 0.01);
    }
    
    public void drawTrace() {
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.point(myLocation.getX(), myLocation.getY());
    }
    
    public void orbit(Point2D origin) {
        
            double g = 0.001;
            double dt = 0.1;
            
            Vector2D sunToPlanet = myLocation.vectorToHere(origin);
            Vector2D gravityVector = sunToPlanet.getUnitVector();
            gravityVector.scale((-1.0 * g) / (sunToPlanet.getLength() * sunToPlanet.getLength()));
            gravityVector.scale(dt);
            myMotion.addVector(gravityVector);
            Vector2D motionCopy = new Vector2D(myMotion);
            motionCopy.scale(dt);
            myLocation.addVector(motionCopy);
    }
}
