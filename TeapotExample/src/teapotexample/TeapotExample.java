
package teapotexample;
import java.util.Scanner;
import java.io.FileInputStream;
import stddraw.StdDraw;

/**
 *
 * @author Maxwell
 */
public class TeapotExample {

    public static void main(String[] args) throws Exception {
        Scanner theScanner = new Scanner(new FileInputStream("objectDescription.txt"));
        String word = theScanner.next();
        int numberOfVertices = theScanner.nextInt();
        word = theScanner.next();
        int numberOfFaces = theScanner.nextInt();
        System.out.println("Vertices: " + numberOfVertices);
        System.out.println("Faces: " + numberOfFaces);
        
        Point[] thePoints = new Point[numberOfVertices];
        
        double smallX = Double.MAX_VALUE;
        double bigX = Double.MIN_VALUE;
        double smallY = Double.MAX_VALUE;
        double bigY = Double.MIN_VALUE;
        
        for(int i=0; i<numberOfVertices; i++) {
            word = theScanner.next(); //Throw away the line label
            double x = theScanner.nextDouble();
            double y = theScanner.nextDouble();
            double z = theScanner.nextDouble();
            thePoints[i] = new Point(x, y, z);
            
            if(x<smallX){
                smallX = x;
            }
            
            if(x>bigX){
                bigX = x;
            }
            
            if(y<smallY){
                smallY = y;
            }
            
            if(y>bigY){
                bigY = y;
            }
        }
        
        Face[] theFaces = new Face[numberOfFaces];
        
        for(int i=0; i<numberOfFaces; i++){
            word = theScanner.next(); //Throw away the line label
            int first = theScanner.nextInt();
            int second = theScanner.nextInt();
            int third = theScanner.nextInt();
            theFaces[i] = new Face(thePoints[first-1], thePoints[second-1], thePoints[third-1]);
        }
        
        StdDraw.setCanvasSize(600, 600);
        StdDraw.setXscale(smallX, bigX);
        StdDraw.setYscale(smallY, bigY);
        StdDraw.show(0);
        
        for(int i=1; i<numberOfVertices; i++) {
            thePoints[i].draw();
            // or: StdDraw.point(thePoints[i].getX(), thePoints[i].getY());
        }
        
        for(int i=0; i<numberOfFaces; i++) {
            theFaces[i].draw();
        }
        
        StdDraw.show(0);
    }
    
}
