
package roadtrip;
import java.util.Scanner;

/**
 * This program provides the user with information on how much gas they will need for the trip and how many times they must fill up their car.
 * Author: Maxwell Martin
 * 9/29/15
 */
public class RoadTrip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            //Asks the user to enter information based on questions asked
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Enter the name of the city you're leaving from: ");
            String cityA = keyboard.nextLine();
            System.out.print("Enter the name of the city your're going to: ");
            String cityB = keyboard.nextLine();
            System.out.print("Enter the distance (in miles) between the two cities: ");
            double distance = keyboard.nextDouble();
            System.out.print("How many miles per gallon does your car get? ");
            int mpg = keyboard.nextInt();
            System.out.print("How many gallons does your car's gas tank hold? ");
            int gallonsOfGas = keyboard.nextInt();
            
            //Takes city that they are leaving from and makes it capitalized
            String cityA1 = cityA.toUpperCase();
            String cityA2 = cityA1.substring(0,1);
            String cityA3 = cityA1.substring(1);
            String cityA4 = cityA3.toLowerCase();
            
            //Takes city that they are going to and makes it capitalized
            String cityB1 = cityB.toUpperCase();
            String cityB2 = cityB1.substring(0,1);
            String cityB3 = cityB1.substring(1);
            String cityB4 = cityB3.toLowerCase();
            
            //Computes the number of gallons of gas needed to complete the trip, as well as how many times the person would need to stop to fill up
            double numberOfGallonsNeeded = (distance/mpg);
            double numberOfStopsNeeded = ((numberOfGallonsNeeded-gallonsOfGas)/gallonsOfGas);
            
            //Prints out the how much gas they need for the trip and how many times they will need to stop
            System.out.println();
            System.out.print("Your trip from " + cityA2 + cityA4 + " to " + cityB2 + cityB4);
            System.out.printf(" will require %.2f" , numberOfGallonsNeeded);
            System.out.print(" gallons of gas. ");
            System.out.print("That means you need to stop for gas ");
            System.out.printf("%.0f" , Math.ceil(numberOfStopsNeeded));
            System.out.print(" times.");
            System.out.println();
            System.out.println("Enjoy your trip.");
            System.out.println();
            
            
            
    }
    
}
