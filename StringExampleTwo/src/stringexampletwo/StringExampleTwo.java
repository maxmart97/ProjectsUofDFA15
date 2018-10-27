
package stringexampletwo;

/**
 * This class shows examples of how to use String
 * Author: Maxwell Martin
 */
public class StringExampleTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "Maxwell Hayes Martin";
        int location = name.indexOf(' ');
        String firstname = name.substring(0, location);
        System.out.println("First name is: " + firstname);
        int nextLocation = name.indexOf(' ', location + 1);
        System.out.println("Location is: " + location);
        System.out.println("Next Location is: " + nextLocation);
        String middlename = name.substring(location, nextLocation);
        System.out.println("Middle name is:" + middlename);
        //int lastlocation = name.indexOf(' ', nextLocation + 1);
        String lastname = name.substring(nextLocation + 1);
        System.out.println("Last Name is: " + lastname);
        
        
        if(name.length() > 3)
        {
            // Block of code
        
        }
        
        // Whatever is here will happen after going through the if statement
    }
}
