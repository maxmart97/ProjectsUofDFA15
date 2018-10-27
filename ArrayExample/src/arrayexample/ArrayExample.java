
package arrayexample;
import stddraw.StdDraw;

/**
 *
 * Author: Maxwell Martin
 * Date: 11/3/15
 */
public class ArrayExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StdDraw.setCanvasSize(600, 600);
        StdDraw.setXscale(0, 600);
        StdDraw.setYscale(0, 600);
        
        //Create the variable (object reference) which can
        //hold an Array of BouncingCircle objects
        int numberCircles = 60;
        BouncingCircle[] theCircles = new BouncingCircle[numberCircles];
        
        //theCircles[0] = new BouncingCircle(300, 600, -0.03);
        //theCircles[1] = new BouncingCircle(350, 600, -0.01);
        //theCircles[2] = new BouncingCircle(400, 600, -0.05);
        //theCircles[3] = new BouncingCircle(450, 600, -0.04);
        //theCircles[4] = new BouncingCircle(500, 600, -0.02);
        
        for(int i=0; i<numberCircles; i++) {
            theCircles[i] = new BouncingCircle(i*10, 600, -0.00001*i);
        }
        
        while(true) {
            StdDraw.clear();
            for(int i = 0; i<theCircles.length; i++) {
                theCircles[i].move();
                theCircles[i].draw();
            }
            StdDraw.show(1);
        }
        
        
        
    }
    
}
