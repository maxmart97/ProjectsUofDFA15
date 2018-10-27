
package hotelinvoice;
import java.util.Scanner;


/**
 *  This program prints out an invoice for Samwise's expenses on his Mordor trip.
 *  Author: Maxwell Martin
 *  Date: 9/22/15
 * 
 */
public class HotelInvoice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many nights did you stay at the hotel? ");
        int nights = keyboard.nextInt();
        System.out.print("What is the tax rate collected by the Shire? ");
        double taxRate1 = ((keyboard.nextDouble())/100);
        System.out.print("What is the tax rate collected by the City of Bree? ");
        double taxRate2 = ((keyboard.nextDouble())/100);
        System.out.print("What was the cost per night at the hotel? ");
        int cost = keyboard.nextInt();
        
        double totalCost1 = ((taxRate1*cost)+(taxRate2*cost)+cost);
        double totalCost2 = (totalCost1*nights);
        
        System.out.println();
        System.out.println();
        System.out.println("The Prancing Pony Inn, City of Bree, Shire");
        System.out.println();
        System.out.println("Invoice for Samwise Gamgee");
        System.out.println("Cost per night: $" + cost);
        System.out.print("Shire Taxes per night: @Rate of " + (taxRate1*100) + "% is $");
        System.out.printf("%.2f\n" , (taxRate1*cost));
        System.out.print("City of Bree Taxes per night: @Rate of " + (taxRate2*100) + "% is $");
        System.out.printf("%.2f\n" , (taxRate2*cost));
        System.out.printf("Total Cost per night: $%.2f\n" , totalCost1);
        System.out.println("Number of nights Stayed: " + nights);
        System.out.printf("Total Cost: $%.2f\n" , totalCost2);
        
        
        
        
        
        
        
    }
    
}
