
package lab15;

/**
 *
 *  Author: Maxwell Martin
 *  Date: 11/13/15
 *  //This code prints a copy of an image, that image in grey-scale, and then prints with edge detection
 */
public class Lab15 {

    public static void main(String[] args) throws Exception {
        
        Image theImage = new Image("EiffelTower.ppm");
        //theImage.draw();

        Image grey = theImage.greyScale();
        //grey.draw();
        
        Image detectedImage = theImage.edge();
        detectedImage.draw();
    }
    
}
