/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellostddraw;
import stddraw.StdDraw;


/**
 *
 * @author Maxwell
 */
public class HelloStdDraw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Create a Canvas which is 500 pixels by 500 pixels
        StdDraw.setCanvasSize(500, 500);
        StdDraw.setXscale(0.0, 500.0);
        StdDraw.setYscale(0.0, 500.0);
        
        //StdDraw.line(0.0, 0.0, 500.0, 500.0);
        //StdDraw.line(0.0, 500.0, 500.0, 0.0);
        
        // Set Drawing Color to (r, g, b) value. Each value is 0 to 255.
        
        double x = 300.0 * Math.random();
        double y = 300.0 * Math.random();
        double radius = 100.0 * Math.random();
        
        if (x < 100.0)
        {
            //The if block of code    
            StdDraw.setPenColor(255, 0, 0);  
        }
        else if (x < 200.0)
        {
            StdDraw.setPenColor(0, 255, 0);
        }
        else
        {
            StdDraw.setPenColor(0, 0, 255);
        }
        
        StdDraw.filledCircle(x, y, radius);
        
        String name = "Bob";
        if(name.equals("Jeff"))
        {
            //Do some stuff
        }
        
        //Draw a Triangle
        //StdDraw.setPenColor(200, 23, 10);
        //StdDraw.line(250, 500, 0, 0);
        //StdDraw.line(0, 0, 500, 0);
        //StdDraw.line(500, 0, 250, 500);
        
        
        
        
    }
    
}
