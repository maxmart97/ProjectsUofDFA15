
package antdriver;
import stddraw.StdDraw;

/**
 *
 * Author: Maxwell Martin
 * Lab #13
 * Date: 11/3/15
 * This class creates all of the Ants for AntDriver
 */
public class Ant {
    private double xCoord;
    private double yCoord;
    
    public Ant(double x, double y) {
        xCoord = x;
        yCoord = y;
    }
    
    public void display() {
        StdDraw.filledCircle(xCoord, yCoord, 3);
    }
    
    public void move() {
        xCoord = xCoord + 0.03 * (StdDraw.mouseX()  - xCoord);
        yCoord = yCoord + 0.03 * (StdDraw.mouseY() - yCoord);
    }
}
