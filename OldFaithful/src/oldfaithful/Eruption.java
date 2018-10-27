
package oldfaithful;
import stddraw.StdDraw;

/**
 *
 * Author: Maxwell Martin
 * Date: 11/6/15
 */
public class Eruption {
    
    private double lengthOfEruption;
    private double timeUntilNextEruption;
    
    public Eruption(double member1, double member2) {
        lengthOfEruption = member1;
        timeUntilNextEruption = member2;
    }
    
    public double getEruptionLength() {
        return lengthOfEruption;
    }
    
    public double getTimeToEruption() {
        return timeUntilNextEruption;
    }
    
    public void plot() {
        StdDraw.point(lengthOfEruption, timeUntilNextEruption);
    }
    
}
