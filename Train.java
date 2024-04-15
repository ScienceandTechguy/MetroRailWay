package Metro_Station;
import java.util.*;

public class Train {
    private int trainNumber;
    private String currentStation;
    
    public Train(int trainNumber) {
        this.trainNumber = trainNumber;
    }
    
    public int getTrainNumber() {
        return trainNumber;
    }
    
    public String getCurrentStation() {
        return currentStation;
    }
    
    public void setCurrentStation(String station) {
        this.currentStation = station;
    }
    
    public void move(String nextStation) {
        System.out.println("Train " + trainNumber + " is moving from " + currentStation + " to " + nextStation);
        this.currentStation = nextStation;
    }
}
