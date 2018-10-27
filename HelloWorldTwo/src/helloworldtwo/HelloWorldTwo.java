
package helloworldtwo;
import java.util.Scanner;
/**
 *
 * @author Maxwell
 */
public class HelloWorldTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Type in your name: ");
        String response = keyboard.nextLine();
        System.out.print("Enter an Integer: ");
        int foo = keyboard.nextInt();
        System.out.println("Hello " + response);
        System.out.println("You entered " + foo);
        int fifi = foo + 10;
        System.out.println(foo + " + 10 is " + fifi);
    }
    
}
