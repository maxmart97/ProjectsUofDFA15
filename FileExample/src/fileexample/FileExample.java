
package fileexample;
import java.util.Scanner;
import java.io.FileInputStream;
import stddraw.StdDraw;

/**
 *
 * Author: Maxwell Martin
 * Date: 11/6/15
 */
public class FileExample {

    public static void main(String[] args) throws Exception {
        Scanner theScanner = new Scanner(new FileInputStream("dots.txt"));
        int numberPoints = theScanner.nextInt();
        System.out.println(numberPoints);
        Point2D[] thePoints = new Point2D[numberPoints];
        for(int i=0; i<numberPoints; i++) {
            double x = theScanner.nextDouble();
            double y = theScanner.nextDouble();
            thePoints[i] = new Point2D(x, y);
        }
        
        double xmin = thePoints[0].getX();
        double xmax = thePoints[0].getX();
        double ymin = thePoints[0].getY();
        double ymax = thePoints[0].getY();
        for(int q=1; q<numberPoints; q++) {
            if(thePoints[q].getX() < xmin) {
                xmin = thePoints[q].getX();
            }
            if(thePoints[q].getX() > xmax) {
                xmax = thePoints[q].getX();
            }
            if(thePoints[q].getY() < ymin) {
                ymin = thePoints[q].getY();
            }
            if(thePoints[q].getY() > ymax) {
                ymax = thePoints[q].getY();
            }
        }
        
        StdDraw.setCanvasSize(600, 600);
        StdDraw.setXscale(xmin, xmax);
        StdDraw.setYscale(ymin, ymax);
        for(int i=0; i<numberPoints-1; i++) {
            thePoints[i].draw();
            StdDraw.line(thePoints[i].getX(), thePoints[i].getY(), thePoints[i+1].getX(), thePoints[i+1].getY());
        }
    }
    
}
