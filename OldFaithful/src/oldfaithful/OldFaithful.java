
package oldfaithful;
import java.util.Scanner;
import java.io.FileInputStream;
import stddraw.StdDraw;

/**
 *
 * Author: Maxwell Martin
 * Date: 11/6/15
 */
public class OldFaithful {

    public static void main(String[] args) throws Exception {
        Scanner theScanner = new Scanner(new FileInputStream("faithful.txt"));
        int numberOfEruptions = theScanner.nextInt();
        Eruption[] theEruptions = new Eruption[numberOfEruptions];
        for(int i=0; i<numberOfEruptions; i++) {
            double eruptionLength = theScanner.nextDouble();
            double timeToEruption = theScanner.nextDouble();
            theEruptions[i] = new Eruption(eruptionLength, timeToEruption);
        }
        
        double minEruptionLength = theEruptions[0].getEruptionLength();
        double maxEruptionLength = theEruptions[0].getEruptionLength();
        double minTimeToEruption = theEruptions[0].getTimeToEruption();
        double maxTimeToEruption = theEruptions[0].getTimeToEruption();
        
        double sumOfEruptionLengths = 0;
        double sumOfTimeUntilNextEruption = 0;
        
        for(int q=0; q<numberOfEruptions; q++) {
            
            sumOfEruptionLengths = sumOfEruptionLengths + theEruptions[q].getEruptionLength();
            sumOfTimeUntilNextEruption = sumOfTimeUntilNextEruption + theEruptions[q].getTimeToEruption();

            if(theEruptions[q].getEruptionLength() < minEruptionLength) {
                minEruptionLength = theEruptions[q].getEruptionLength();
            }
            if(theEruptions[q].getEruptionLength() > maxEruptionLength) {
                maxEruptionLength = theEruptions[q].getEruptionLength();
            }
            if(theEruptions[q].getTimeToEruption() < minTimeToEruption) {
                minTimeToEruption = theEruptions[q].getTimeToEruption();
            }
            if(theEruptions[q].getTimeToEruption() > maxTimeToEruption) {
                maxTimeToEruption = theEruptions[q].getTimeToEruption();
            }
        }
        
        double averageEruptionLength = sumOfEruptionLengths / numberOfEruptions;
        double averageWaitTime = sumOfTimeUntilNextEruption / numberOfEruptions;
        
        System.out.println("The min eruption length is: " + minEruptionLength);
        System.out.println("The max eruption length is: " + maxEruptionLength);
        System.out.println("The min time to eruption is: " + minTimeToEruption);
        System.out.println("The max time to eruption is: " + maxTimeToEruption);
        
        
        System.out.printf("The average eruption length is: %.2f\n" , averageEruptionLength);
        System.out.printf("The average wait time is: %.2f\n" , averageWaitTime);
        
        StdDraw.setCanvasSize(600, 600);
        StdDraw.setXscale(0, maxEruptionLength);
        StdDraw.setYscale(0, maxTimeToEruption);
        StdDraw.setPenRadius(0.01);
        for(int i=0; i<numberOfEruptions-1; i++) {
            theEruptions[i].plot();
        }
        
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(averageEruptionLength, averageWaitTime);
        
        
        
        
        
        
    }
    
}
