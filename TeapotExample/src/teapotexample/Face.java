
package teapotexample;
import stddraw.StdDraw;

/**
 *
 * @author Maxwell
 */
public class Face {
    
    private Point one;
    private Point two;
    private Point three;
    
    public Face(Point a, Point b, Point c) {
        one = a;
        two = b;
        three = c;
    }
    
    public void draw() {
        StdDraw.line(one.getX(), one.getY(), two.getX(), two.getY());
        StdDraw.line(two.getX(), two.getY(), three.getX(), three.getY());
        StdDraw.line(three.getX(), three.getY(), one.getX(),one.getY());
    }
    
}
