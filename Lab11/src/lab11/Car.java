package lab11;
import stddraw.StdDraw;

/**
 *
 * @author Maxwell
 */
public class Car {
        private double myXposition;
        private double myYposition;
        private double myCarLength;
        private double myCarWidth;
        private int myRed;
        private int myGreen;
        private int myBlue;
        private double myVelocity;
        
        public Car(double xPosition, double yPosition, double carLength, double carWidth, double velocity) {
            myXposition = xPosition;
            myYposition = yPosition;
            myCarLength = carLength;
            myCarWidth = carWidth;
            myVelocity = velocity;
        }
        
        public void setColor(int red, int green, int blue) {
            myRed = red;
            myGreen = green;
            myBlue = blue;
        }
        
        public void accelerate(double acceleration) {
            myVelocity = myVelocity + acceleration;
        }
        
        public void brake(double brake) {
            myVelocity = myVelocity - brake;
            if(myVelocity < 0) {
                myVelocity = 0;
            }
        }
        
        public void draw() {
            StdDraw.setPenColor(myRed, myGreen, myBlue);
            StdDraw.rectangle(myXposition, myYposition, myCarLength, myCarWidth);
            if(myVelocity > 3) {
                StdDraw.show();
                StdDraw.setPenColor(255, 0, 0);
                StdDraw.rectangle(200, 400, 50, 50);
                StdDraw.setPenColor(0, 0, 255);
                StdDraw.rectangle(400, 400, 50, 50);
                StdDraw.clear();
            }
        }
        
        public void move() {
            myXposition = myXposition + myVelocity;
            if(myXposition > 600) {
                myXposition = 0;
            }
        }
}
