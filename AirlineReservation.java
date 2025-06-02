
import java.util.*;

class Reservation {
    private int reservationId;
    private Passenger passenger;
    private Ticket ticket;
    
    public Reservation(int reservationId, Passenger passenger, Ticket ticket) {
        this.reservationId = reservationId;
        this.passenger = passenger;
        this.ticket = ticket;
    }
}

class Passenger {
    private int passengerId;
    private String name;
    
    public Passenger(int passengerId, String name) {
        this.passengerId = passengerId;
        this.name = name;
    }
}

class Ticket {
    private int ticketId;
    private String flightNumber;
    private String seatNumber;
    
    public Ticket(int ticketId, String flightNumber, String seatNumber) {
        this.ticketId = ticketId;
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
    }
}

class Employee {
    private int employeeId;
    private String name;
    private String role;
    
    public Employee(int employeeId, String name, String role) {
        this.employeeId = employeeId;
        this.name = name;
        this.role = role;
    }
}
