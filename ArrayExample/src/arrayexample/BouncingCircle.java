
package arrayexample;
import stddraw.StdDraw;

/**
 *
 * Author: Maxwell Martin
 * Date: 11/3/14
 */
public class BouncingCircle {
        private double myX;
        private double myY;
        private double myYVelocity;
        private double myYAcceleration;
        
        public BouncingCircle(double x, double y, double acc) {
            myX = x;
            myY = y;
            myYVelocity = 0.0;
            myYAcceleration = acc;
        }
        
        public void draw() {
            StdDraw.circle(myX, myY, 5);
        }
        
        public void move() {
            myY = myY + myYVelocity;
            myYVelocity = myYVelocity + myYAcceleration;
            if(myY < 0) {
                myYVelocity =  -0.95 * myYVelocity;
            }
        }
}
