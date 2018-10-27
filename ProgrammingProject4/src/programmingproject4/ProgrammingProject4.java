
package programmingproject4;
import stddraw.StdDraw;
import java.util.Scanner;

/**
 *
 * Author: Maxwell Martin
 * Date: 11/3/15
 * This code allows the user to move a turtle.
 */
public class ProgrammingProject4 {

    public static void main(String[] args) {
            //This code sets the canvas size and x and y scale
            int canvasWidth = 500;
            int canvasHeight = 500;
            StdDraw.setCanvasSize(canvasWidth, canvasHeight);
            StdDraw.setXscale(0, canvasWidth);
            StdDraw.setYscale(0, canvasHeight);
            
            //This code creates way to exit the loop and allows the user to enter data from the keyboard
            String theCommand = "";
            Scanner keyboard = new Scanner(System.in);
            
            //This creates a Turtle
            Turtle newTurtle = new Turtle(250, 250);
            
            //This draws the initial turtle
            newTurtle.draw();
            
            //This is the loop that allows the user to enter commands to make the turtle move
            while(!theCommand.equalsIgnoreCase("quit")) {
                
                //This code prints out the commands to the user
                System.out.println();
                System.out.println("Enter a command to move the turtle. Here is the list of commands:");
                System.out.println("Type in:");
                System.out.println("Forward and the number of steps you want the turtle to go");
                System.out.println("Right and an angle in degrees");
                System.out.println("Left and an angle in degrees");
                System.out.println("PenUp");
                System.out.println("PenDown");
                System.out.println("PenColor and a color (black, red, green, yellow, or blue)");
                System.out.println("Quit");
                System.out.println();
                String response = keyboard.next();
                
                //These are if statements that check if the user put in the correct command
                //And if they did, it does the action that they entered
                if(response.equalsIgnoreCase("forward")) {
                    int numberOfSteps = keyboard.nextInt();
                    String temp = keyboard.nextLine();
                    newTurtle.forward(numberOfSteps);
                    newTurtle.draw();
                }
                
                else if(response.equalsIgnoreCase("right")) {
                    int angleOfTurtle = keyboard.nextInt();
                    String temp = keyboard.nextLine();
                    newTurtle.right(angleOfTurtle);
                }
                
                else if(response.equalsIgnoreCase("left")) {
                    int angleOfTurtle2 = keyboard.nextInt();
                    String temp = keyboard.nextLine();
                    newTurtle.left(angleOfTurtle2);
                }
                
                else if(response.equalsIgnoreCase("penup")) {
                    newTurtle.penUp();
                }
                
                else if(response.equalsIgnoreCase("pendown")) {
                    newTurtle.penDown(); 
                }
                
                else if(response.equalsIgnoreCase("pencolor")) {
                    String newColor = keyboard.next();
                    newTurtle.setPenColor(newColor);
                }
                else if(response.equalsIgnoreCase("quit")) {
                    System.out.println();
                    System.out.println("You have quit the program.");
                    System.out.println();
                    System.exit(0);
                }
                else {
                    System.out.println();
                    System.out.println("YOU HAVE NOT ENTERED A CORRECT COMMAND.");
                }            
        }
            
    }
    
}
