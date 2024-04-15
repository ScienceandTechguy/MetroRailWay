package Metro_Station;
import java.util.*;

public class RoutePlanner {
    private List<Station> stations;
    
    public RoutePlanner(List<Station> stations) {
        this.stations = stations;
    }
    
    public List<String> planRoute(String source, String destination) {
        List<String> route = new ArrayList<>();
        
        // Simulated direct route without considering real-world routing algorithms
        for (Station station : stations) {
            if (station.getName().equals(source)) {
                route.add(station.getName());
            } else if (station.getName().equals(destination)) {
                route.add(station.getName());
                break;
            }
        }
        
        return route;
    }
}
