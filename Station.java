package Metro_Station;
import java.util.*;


public class Station {
    private String name;
    private List<Train> trains;
    
    public Station(String name) {
        this.name = name;
        this.trains = new ArrayList<>();
    }
    
    public String getName() {
        return name;
    }
    
    public void addTrain(Train train) {
        trains.add(train);
    }
    
    public void removeTrain(Train train) {
        trains.remove(train);
    }
    
    public List<Train> getTrains() {
        return trains;
    }
    
    public void announceArrival(Train train) {
        System.out.println("Train " + train.getTrainNumber() + " has arrived at " + name + " station.");
    }
}
