
package imageexample;
import java.awt.Color;
import java.util.Scanner;
import java.io.FileInputStream;
import stddraw.StdDraw;

/**
 *
 * Author: Maxwell Martin
 * Date: 11/10/15
 */
public class Image {
    private Color[][] myPixels;
    private int myWidth;
    private int myHeight;
    
    //Constructor
    public Image(String filename) throws Exception {
        Scanner theScanner = new Scanner(new FileInputStream(filename));
        String filetype = theScanner.nextLine();
        if(!filetype.equals("P3")){
            System.out.println("Bad File Input: Header is not P3 " + filetype);
            System.exit(0);
        }
        myWidth = theScanner.nextInt();
        myHeight = theScanner.nextInt();
        System.out.println("Width is: " + myWidth);
        System.out.println("Height is: " + myHeight);
        
        int maxColor = theScanner.nextInt();
        System.out.println("Max Color Value is: " + maxColor);
        
        myPixels = new Color[myHeight][myWidth];
        
        for(int row = 0; row<myHeight; row++) {
            for(int col = 0; col<myWidth; col++) {
                myPixels[row][col] = new Color(theScanner.nextInt(), theScanner.nextInt(), theScanner.nextInt());
            }
        }
        theScanner.close();
    }
    
    //Copy Constructor
    public Image(Image otherImage) {
        this.myWidth = otherImage.myWidth;
        this.myHeight = otherImage.myHeight;
        this.myPixels = new Color[myHeight][myWidth];
        for(int row=0; row<myHeight; row++) {
            for(int col=0; col<myWidth; col++) {
                this.myPixels[row][col] = new Color(
                        otherImage.myPixels[row][col].getRed(), otherImage.myPixels[row][col].getGreen(), otherImage.myPixels[row][col].getBlue());
            }
        }
    }
    
    //Draw
    public void draw() {
        StdDraw.setCanvasSize(myWidth, myHeight);
        StdDraw.setXscale(0, myWidth);
        StdDraw.setYscale(myHeight, 0);
        StdDraw.show(0);
        for(int row=0; row<myHeight; row++) {
            for(int col=0; col<myWidth; col++) {
                StdDraw.setPenColor(myPixels[row][col].getRed(), myPixels[row][col].getGreen(), myPixels[row][col].getBlue());
                StdDraw.point(col, row);
            }
        }
        StdDraw.show(0);
    }
    
    public Image greyScale() {
        Image copy = new Image(this);
        for(int row=0; row<myHeight; row++) {
            for(int col=0; col<myWidth; col++) {
                int intensity = ((copy.myPixels[row][col].getRed() + copy.myPixels[row][col].getGreen() + copy.myPixels[row][col].getBlue())/3);
                copy.myPixels[row][col] = new Color(intensity, intensity, intensity);
            }
        }
        return copy;
    }
    
    public Image flip() {
        Image copy = new Image(this);
        for(int row=0; row<myHeight; row++) {
            for(int col=0; col<myWidth; col++) {
                copy.myPixels[row][col] = this.myPixels[row][(myWidth-1)-col];
                //For the three eyed homer
                //copy.myPixels[row][col] = copy.myPixels[row][(myWidth-1)-col];
            }
        }
        return copy;
    }
    
}
