
package labten;
import stddraw.StdDraw;
import java.util.Random;

/**
 *
 * Author: Maxwell Martin
 * Date: 10/20/15
 */
public class LabTen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StdDraw.setCanvasSize(500,500);
        StdDraw.setXscale(0, 500);
        StdDraw.setYscale(0, 500);
        
        //Create a MovingCircl object here
        MovingCircle theCircle1 = new MovingCircle();
        
        MovingCircle theCircle2 = new MovingCircle(10, 100, -3, 3, 25);
        
        MovingCircle theCircle3 = new MovingCircle(300, 300, 2, -2, 40);
        
        MovingCircle theCircle4 = new MovingCircle(100, 2, 1, 5, 100);
        
        MovingCircle theCircle5 = new MovingCircle(50, 10, -2, 3, 10);
        
       Random r = new Random();
       int theRed = r.nextInt(255);
       int theGreen = r.nextInt(255);
       int theBlue = r.nextInt(255);
        
       // theCircle1.setColor(theRed, theGreen, theBlue);
       // theCircle2.setColor(theRed, theGreen, theBlue);
       // theCircle3.setColor(theRed, theGreen, theBlue);
       // theCircle4.setColor(theRed, theGreen, theBlue);
       // theCircle5.setColor(theRed, theGreen, theBlue);

       
        while(true)
        {
            StdDraw.clear();
            if(StdDraw.isKeyPressed('C')) {
                theRed = r.nextInt(255);
                theGreen = r.nextInt(255);
                theBlue = r.nextInt(255);
                theCircle1.setColor(theRed, theGreen, theBlue);
                theCircle2.setColor(theRed, theGreen, theBlue);
                theCircle3.setColor(theRed, theGreen, theBlue);
                theCircle4.setColor(theRed, theGreen, theBlue);
                theCircle5.setColor(theRed, theGreen, theBlue);
            }
            StdDraw.text(50, 400, "" + theRed);
            StdDraw.text(150, 400, "" + theGreen);
            StdDraw.text(250, 400, "" + theBlue);
            theCircle1.move();
            theCircle1.draw();
            theCircle2.move();
            theCircle2.draw();
            theCircle3.move();
            theCircle3.draw();
            theCircle4.move();
            theCircle4.draw();
            theCircle5.move();
            theCircle5.draw();
            StdDraw.show(8);
        }
    }
    
}
