
package lab11;
import stddraw.StdDraw;

/**
 *
 * Author: Maxwell Martin
 * Date: 10/23/15
 * This creates a car racing game where a rectangle accelerates and decelerates from certain keys pressed 
 */
public class Lab11 {

    public static void main(String[] args) {
        StdDraw.setCanvasSize(600, 300);
        StdDraw.setXscale(0, 600);
        StdDraw.setYscale(0, 600);
        
        //double velocity = 0;
        
        //Build a Car Object here
        Car theCar = new Car(50, 150, 20, 10, 0);
        
        int red = 200;
        int green = 50;
        int blue = 50;
        
        theCar.setColor(red, green, blue);
        
        while(true) {
            StdDraw.clear();
            theCar.move();
            theCar.draw();
            if(StdDraw.isKeyPressed('B')) {
                //Tell the car to brake
                theCar.brake(0.005);
            }
            if(StdDraw.isKeyPressed('G')) {
                //Tell the car to accelerate
                theCar.accelerate(0.005);
            }
            
            StdDraw.show(1);
        }
        
        
    }
    
}
