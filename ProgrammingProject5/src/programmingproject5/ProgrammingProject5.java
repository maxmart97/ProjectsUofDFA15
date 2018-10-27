
package programmingproject5;
import stddraw.StdDraw;

/**
 *
 * Author: Maxwell Martin
 * Date: 11/10/15
 * This is the main method that prints 5 rectangles to the screen that bounce off the walls of the canvas
 * The user is to try and click all of the rectangles (1 at a time) with a goal of clicking all of them
 */
public class ProgrammingProject5 {

    public static void main(String[] args) {
        //This code sets the canvas size and the x an y scale for the canvas
        StdDraw.setCanvasSize(600, 600);
        StdDraw.setXscale(0, 600);
        StdDraw.setYscale(0, 600);
        
        //This is the number of rectangles that will appear on the screen set into a variable
        int numberOfRectangles = 5;
        
        //This creates an array for the rectangles
        MovingRectangle[] theRectangles = new MovingRectangle[numberOfRectangles];
        
        //This is a for loop that creates the 5 slots in the array
        for(int i=0; i<numberOfRectangles; i++) {
            theRectangles[i] = new MovingRectangle();
        }
        
        //This is a while loop that draws the rectangles and moves them on the screen
        while(true) {
            StdDraw.clear();
            for(int i = 0; i<theRectangles.length; i++) {
                theRectangles[i].move();
                theRectangles[i].draw();
                //This checks if the rectangles have been clicked by the mouse
                if(theRectangles[i].isMouseInRectangle() && StdDraw.mousePressed()) {
                    theRectangles[i].changeColorToRed();
                    theRectangles[i].stop();
                }
                //This checks if all of the rectangles have been clicked and then tells the player that they have won the game
                if(theRectangles[0].isRed() && theRectangles[1].isRed() && theRectangles[2].isRed() && 
                   theRectangles[3].isRed() && theRectangles[4].isRed()){
                    StdDraw.setPenColor(StdDraw.BLACK);
                    StdDraw.text(300, 300, "YOU WIN!!!!");
                }
            }
            StdDraw.show(1);
        }
        
    }
    
}
