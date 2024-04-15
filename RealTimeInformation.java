package Metro_Station;
import java.util.*;

public class RealTimeInformation {
    public void announceDelay(Train train, int delayMinutes) {
        System.out.println("Train " + train.getTrainNumber() + " is delayed by " + delayMinutes + " minutes.");
    }
    
    public void announcePlatform(Train train, String platform) {
        System.out.println("Train " + train.getTrainNumber() + " is departing from platform " + platform + ".");
    }
}
