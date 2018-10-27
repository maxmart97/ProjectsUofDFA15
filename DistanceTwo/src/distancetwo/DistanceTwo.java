
package distancetwo;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * Author: Maxwell Martin
 */
public class DistanceTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Calculate the distance between two geometric points
        // Variable declaration of the variable x1
        // First geometric point is (x1,y1)
        // Second geometric point is (x,y)
        Scanner theScanner = new Scanner(System.in);
        System.out.print("Enter the x coordinate: ");
        double x1 = theScanner.nextDouble();
        System.out.print("Enter the other x coordinate: ");
        double x = theScanner.nextDouble();
        System.out.print("Enter the y coordinate: ");
        double y1 = theScanner.nextDouble();
        System.out.print("Enter the other y coordinate: ");
        double y = theScanner.nextDouble();
        
        double distance = Math.sqrt((x1-x)*(x1-x) + (y1-y)*(y1-y));
        
        System.out.println("The distance between the two points is: " + distance);
        System.out.printf("The distance between the two points is: %10.2f\n" , distance);
        System.out.printf("The distance between the two points is: %.2f\n" , distance);

        DecimalFormat theFormat = new DecimalFormat("#.00");
        String result = theFormat.format(distance);
        System.out.println(result);
        
        
        
        
    }
    
}
