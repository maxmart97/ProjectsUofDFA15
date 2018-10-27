
package uberfarecalculator;

/**
 *
 * Author: Maxwell Martin
 * This program calculates the cost of of a ride from Uber
 */
public class UberFareCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double baseCost = 1.00;
        double costPerMinute = 0.16;
        double costPerMile = 1.10;
        double miles = 50.00;
        double minutes = 20.00;
        
        double totalCost = (baseCost + (costPerMile*miles) + (costPerMinute*minutes));
        
        System.out.printf("The total cost of the Uber ride is: $%5.2f" , totalCost);
        System.out.println();
        
        System.out.printf("The total cost during surge pricing is: $%5.2f" , (totalCost*5));
        System.out.println();
        
        
        
        
        
        
        
        
        
    }
    
}
