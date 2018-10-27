
package antdriver;
import stddraw.StdDraw;

/**
 *
 * Author: Maxwell Martin
 * Lab #13
 * Date: 11/3/15
 * This is the main file where the Ants will be told to move
 */
public class AntDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StdDraw.setCanvasSize(600, 600);
        StdDraw.setXscale(0, 600);
        StdDraw.setYscale(0, 600);
        
        int numberOfAnts = 100;
        Ant[] theAnts = new Ant[numberOfAnts];
        
        for(int i=0; i<numberOfAnts; i++) {
            theAnts[i] = new Ant(600 * Math.random(), 600 * Math.random());
        }
        
        while(true) {
            StdDraw.clear();
            for(int i=0; i<numberOfAnts; i++){
                theAnts[i].display();
                theAnts[i].move();
            }
            StdDraw.show(1);
        }
        
    }
}
