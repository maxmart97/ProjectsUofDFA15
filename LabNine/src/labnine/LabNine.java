
package labnine;
import stddraw.StdDraw;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * Author: Maxwell Martin
 * Date: 10/13/15
 * This code creates a turtle that draws pictures.
 */
public class LabNine {
    public static void main(String[] args) {
            int canvasWidth = 500;
            int canvasHeight = 500;
            StdDraw.setCanvasSize(canvasWidth, canvasHeight);
            StdDraw.setXscale(0, canvasWidth);
            StdDraw.setYscale(0, canvasHeight);
            
            //List of variables we need for the Turtle
            //Turtle Direction
            int direction = 0; //Start moving "north"
            //Turtle Move Distance
            int moveDistance = 20;
            //Turtle Pen Up or Down
            boolean pen = true;
            //Turtle Draw Color
            int red = 0;
            int green = 0;
            int blue = 0;
            //Turtle X Location
            int x = canvasWidth/2;
            //Turtle Y Location
            int y = canvasHeight/2;
            
            
            String theCommand = "";
            Scanner theScanner = new Scanner(System.in);
            while(!theCommand.equals("quit"))
            {
                StdDraw.filledCircle(x, y, 5);
                System.out.print("Enter Turtle Command: ");
                theCommand = theScanner.nextLine().toLowerCase();
                System.out.println("You entered: " + theCommand);

                if(theCommand.equals("forward"))
                {
                    //Move turtle forward
                    int x2 = x;
                    int y2 = y;
                    
                    if(direction == 0)
                    {
                        y = y + moveDistance;
                    }
                    else if(direction == 1)
                    {
                        x = x - moveDistance;
                    }
                    else if(direction == 2)
                    {
                        y = y - moveDistance;
                    }
                    else
                    {
                        x = x + moveDistance;
                    }
                    
                    if(pen == true)
                    {
                        StdDraw.line(x, y, x2, y2);
                    }
                }
                else if(theCommand.equals("right"))
                {
                    //Turn right
                    direction = (direction - 1) % 4;
                }
                else if(theCommand.equals("left"))
                {
                    //Turn left
                    direction = (direction + 1) % 4;
                    //if(direction > 3)
                    //{
                    //    direction = 0;
                    //}
                }
                else if(theCommand.equals("start"))
                {
                    //Draw a line
                    pen = true;
                }
                else if(theCommand.equals("stop"))
                {
                    //Stop drawing a line
                    pen = false;
                }
                else if(theCommand.equals("reset"))
                {
                    //Set draw color to Black
                    red = 0;
                    green = 0;
                    blue = 0;
                    StdDraw.setPenColor(red, green, blue);
                }
                else if(theCommand.equals("randomcolor"))
                {
                    //Set draw color to random
                    Random r = new Random();
                    red = r.nextInt(255);
                    green = r.nextInt(255);
                    blue = r.nextInt(255);
                    StdDraw.setPenColor(red, green, blue);
                }
                else
                {
                    System.out.println("Invalid Command: " + theCommand);
                }
                
            }
            
            System.out.println("You have quit the program.");
            
            
    }
    
}
