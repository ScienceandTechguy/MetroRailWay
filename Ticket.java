package Metro_Station;
import java.util.*;

public class Ticket {
    private int ticketNumber;
    private double price;
    private Passenger passenger;
    
    public Ticket(int ticketNumber, double price, Passenger passenger) {
        this.ticketNumber = ticketNumber;
        this.price = price;
        this.passenger = passenger;
    }
    
    public int getTicketNumber() {
        return ticketNumber;
    }
    
    public double getPrice() {
        return price;
    }
    
    public Passenger getPassenger() {
        return passenger;
    }
}
