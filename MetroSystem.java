package Metro_Station;
import java.util.*;

class MetroSystem {
    private List<Station> stations;
    private List<Train> trains;
    
    public MetroSystem() {
        this.stations = new ArrayList<>();
        this.trains = new ArrayList<>();
    }
    
    public void addStation(Station station) {
        stations.add(station);
    }
    
    public void addTrain(Train train) {
        trains.add(train);
    }
    
    public List<Station> getStations() {
        return stations;
    }
    
    public List<Train> getTrains() {
        return trains;
    }
}
