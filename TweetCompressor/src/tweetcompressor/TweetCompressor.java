
package tweetcompressor;
import java.util.Scanner;


/**
 *
 * Author: Maxwell Martin
 * This code takes an extremely long tweet and puts it at the correct character limit (140)
 * Date: 10/19/12
 */
public class TweetCompressor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            //This code asks user to enter their long tweet and stores it in variable "tweet"
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter the tweet you want to shorten: ");
            String tweet = keyboard.nextLine();
            
            //This code is the loop that takes out random characters from the orignal tweet until it is the correct length
            while(tweet.length() > 140)
            {
                int randomNumber = (int) Math.floor(tweet.length() * Math.random());
                if (tweet.charAt(randomNumber) != ' ')
                {
                String newTweet = tweet.substring(0, randomNumber);
                String newTweet2 = tweet.substring(randomNumber+1, tweet.length());
                tweet = newTweet + newTweet2;
                }
                      
            }
            
            //This code prints out the shortened tweet
            System.out.println("Shortened Tweet:");
            System.out.println(tweet);
    }
    
}
