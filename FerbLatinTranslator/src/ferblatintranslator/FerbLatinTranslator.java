
package ferblatintranslator;
import java.util.Scanner;

/**
 *
 * Author: Maxwell Martin
 * This code takes in a first and last name and switches the order of the letters
 * Example: Maxwell Martin turns into - Axwellmerb Artinmerb
 */
public class FerbLatinTranslator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // The code below allows user to enter first name and changes first letter in first name to uppercase and the rest of the letters to lowercase
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName1 = keyboard.nextLine();
        String firstName2 = firstName1.toUpperCase();
        String random1 = firstName2.substring(0,1);
        String random2 = firstName2.substring(1);
        String finalFirstName = random2.toLowerCase();
        
        //The code below allows the user to enter last name and changes the last name the same as the first name above ^^
        System.out.print("Enter your last name: ");
        String lastName1 = keyboard.nextLine();
        String lastName2 = lastName1.toUpperCase();
        String random3 = lastName2.substring(0,1);
        String random4 = lastName2.substring(1);
        String finalLastName = random4.toLowerCase();
        
        
        String name = (firstName2);
        String name2 = (lastName2);
        
        //This code prints out the real first and last name of the user
        System.out.println();
        System.out.println("first = " + "\"" + random1 + finalFirstName + "\";");
        System.out.println("last = " + "\"" + random3 + finalLastName + "\";");
        System.out.println();
        
        //This code rearranges the letters of the first name of the user to correct Ferb Latin and then prints out first name
        if (name.length() >= 3)
        {
            //The code below takes the first letter of the first name and makes it lowercase
            String firstLetter = name.substring(0,1);
            String letter1 = firstLetter.toLowerCase();
            
            //The code below takes the second letter of the first name and makes it uppercase
            String secondLetter = name.substring(1,2);
            String letter2 = secondLetter.toUpperCase();
            
            //The code below takes the rest of the letters in the name and makes them lowercase
            String restofLetters1 = name.substring(2);
            String restofLetters2 = restofLetters1.toLowerCase();
            
            //The code below creates a string called erb which is "erb" and the prints out the first name
            String erb = "erb";
            System.out.print("Your name in Ferb Latin is");
            System.out.print(" " + letter2 + restofLetters2 + letter1 + erb);  
        }
        
        //This code makes the first name "ed or ED" to "Ed" (Only used if first name length entered is less than or equal to 2
        if(name.length() <= 2)
        {
            String extra0 = name.substring(0,1);
            String extra1 = extra0.toUpperCase();
            String extra2 = name.substring(1);
            String extra3 = extra2.toLowerCase();
            System.out.print("Your name in Ferb latin is " + extra1 + extra3);
        }
        
        
        //The code below rearranges the last name into correct Ferb Latin and then prints it out
        if (name2.length() >= 3)
        {
            // The code below takes the first letter of the last name and makes it lowercase
            String lastnameFirstLetter = name2.substring(0,1);
            String lastnameLetter1 = lastnameFirstLetter.toLowerCase();
            
            // The code below takes the second letter of the last name and makes it uppercase
            String lastnameSecondLetter = name2.substring(1,2);
            String lastnameLetter2 = lastnameSecondLetter.toUpperCase();
            
            //The code below takes the rest of the letters in the last name (not including first and second letter) and makes them lowercase
            String restofLetters3 = name2.substring(2);
            String restofLetters4 = restofLetters3.toLowerCase();
            
            //The code below creates a string called erb that is "erb" and then prints the last name in Ferb Latin
            String erb2 = "erb";
            System.out.print(" " + lastnameLetter2 + restofLetters4 + lastnameLetter1 + erb2);
            System.out.println();
            System.out.println();
        }
        
        
        //The code below makes any last name less than or equal to 2 in corect form "sy or SY" to "Sy"
        if (name2.length() <= 2)
        {
            String extra4 = name2.substring(0,1);
            String extra5 = extra4.toUpperCase();
            String extra6 = name2.substring(1);
            String extra7 = extra6.toLowerCase();
            System.out.print(" " + extra5 + extra7);
            System.out.println();
            System.out.println();
        }
        
               
    }
    
}
