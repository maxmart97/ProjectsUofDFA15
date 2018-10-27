
package imageexample;

/**
 *
 * Author: Maxwell Martin
 * Date: 11/10/15
 */
public class ImageExample {

    public static void main(String[] args) throws Exception {
        Image theImage = new Image("Homer.ppm");
        theImage.draw();
        
        Image grey = theImage.greyScale();
        grey.draw();
        
        Image f = theImage.flip();
        f.draw();
    }
    
}
