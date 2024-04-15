package Metro_Station;
import java.util.*;

 public class MetroStationProject {
    public static void main(String[] args) {
        // Create metro system
        MetroSystem metroSystem = new MetroSystem();
        
        // Create stations
        Station stationA = new Station("Station A");
        Station stationB = new Station("Station B");
        Station stationC = new Station("Station C");
        Station stationD = new Station("Station D");
        
        // Add stations to metro system
        metroSystem.addStation(stationA);
        metroSystem.addStation(stationB);
        metroSystem.addStation(stationC);
        metroSystem.addStation(stationD);
        
        // Create trains
        Train train1 = new Train(1);
        Train train2 = new Train(2);
        Train train3 = new Train(3);
        
        // Add trains to stations
        stationA.addTrain(train1);
        stationB.addTrain(train2);
        stationC.addTrain(train3);
        
        // Move trains
        train1.move("Station B");
        train2.move("Station C");
        train3.move("Station D");
        
        // Simulate real-time information
        RealTimeInformation realTimeInfo = new RealTimeInformation();
        realTimeInfo.announceDelay(train1, 5); // Delay train 1 by 5 minutes
        realTimeInfo.announcePlatform(train2, "Platform 2"); // Announce platform for train 2
        
        // Plan route
        RoutePlanner routePlanner = new RoutePlanner(metroSystem.getStations());
        List<String> route = routePlanner.planRoute("Station A", "Station D");
        System.out.println("Route: " + route);
        
        // Simulate passenger feedback
        Passenger passenger = new Passenger("John", 30);
        FeedbackSystem feedbackSystem = new FeedbackSystem();
        feedbackSystem.collectFeedback(passenger, "The service was excellent!");
    }
}
