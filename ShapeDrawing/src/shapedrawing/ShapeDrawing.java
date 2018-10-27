
package shapedrawing;
import stddraw.StdDraw;
import java.util.Scanner;

/**
 *
 * Author: Maxwell Martin
 * Lab #6
 * 10/2/15
 */
public class ShapeDrawing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        StdDraw.setCanvasSize(300, 300);
        StdDraw.setXscale(0.0, 300.0);
        StdDraw.setYscale(0.0, 300.0);
        System.out.print("Enter the shape you would like to draw: (circle, square, triangle): ");
        String shape = keyboard.nextLine();
        
        System.out.print("Enter the color (red, green, blue, yellow): ");
        String color = keyboard.nextLine();
        
        double x = 150;
        double y = 150;
        double r = 100;
        
        if(!(shape.equals("circle")) && !(shape.equals("square")) && !(shape.equals("triangle")))
        {
            System.out.println("Invalid shape. Try again later.");
        }
        else if((!color.equals("red")) && (!color.equals("green")) && (!color.equals("blue")) && (!color.equals("yellow")))
        {
            StdDraw.setPenColor(StdDraw.BLACK);
            System.out.println("Invalid Color. Drawing in black...");
            if(shape.equals("circle"))
            {
                StdDraw.circle(x, y, r);
            }
            else if(shape.equals("square"))
            {
                StdDraw.square(x, y, r);
            }
            else
            {
                StdDraw.line(30, 30, 150, 200);
                StdDraw.line(30, 30, 270, 30);
                StdDraw.line(150, 200, 270, 30);
            }
        }
        
        if(shape.equals("circle") && color.equals("red"))
        {
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.circle(x, y, r);
        }
        
        if(shape.equals("circle") && color.equals("green"))
        {
            StdDraw.setPenColor(StdDraw.GREEN);
            StdDraw.circle(x, y, r);
        }
        
        if(shape.equals("circle") && color.equals("blue"))
        {
            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.circle(x, y, r);
        }
        
        if(shape.equals("circle") && color.equals("yellow"))
        {
            StdDraw.setPenColor(StdDraw.YELLOW);
            StdDraw.circle(x, y, r);
        }
        
        if(shape.equals("square") && color.equals("red"))
        {
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.square(x, y, r);
        }
        
        if(shape.equals("square") && color.equals("green"))
        {
            StdDraw.setPenColor(StdDraw.GREEN);
            StdDraw.square(x, y, r);
        }
        
        if(shape.equals("square") && color.equals("blue"))
        {
            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.square(x, y, r);
        }
        
        if(shape.equals("square") && color.equals("yellow"))
        {
            StdDraw.setPenColor(StdDraw.YELLOW);
            StdDraw.square(x, y, r);
        }
        
        if(shape.equals("triangle") && color.equals("red"))
        {
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.line(30, 30, 150, 200);
            StdDraw.line(30, 30, 270, 30);
            StdDraw.line(150, 200, 270, 30);
        }
        
        if(shape.equals("triangle") && color.equals("green"))
        {
            StdDraw.setPenColor(StdDraw.GREEN);
            StdDraw.line(30, 30, 150, 200);
            StdDraw.line(30, 30, 270, 30);
            StdDraw.line(150, 200, 270, 30);
        }
        
        if(shape.equals("triangle") && color.equals("blue"))
        {
            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.line(30, 30, 150, 200);
            StdDraw.line(30, 30, 270, 30);
            StdDraw.line(150, 200, 270, 30);
        }
        
        if(shape.equals("triangle") && color.equals("yellow"))
        {
            StdDraw.setPenColor(StdDraw.YELLOW);
            StdDraw.line(30, 30, 150, 200);
            StdDraw.line(30, 30, 270, 30);
            StdDraw.line(150, 200, 270, 30);
        }
        
        
        
        
        
        
        
        
    }
    
}
