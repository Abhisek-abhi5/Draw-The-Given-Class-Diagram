
import java.util.*;

class Hotel {
    private String name;
    private List<Room> rooms = new ArrayList<>();
    private List<Reservation> reservations = new ArrayList<>();

    public Hotel(String name) {
        this.name = name;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public Room findAvailableRoom(String type) {
        for (Room room : rooms) {
            if (room.getType().equalsIgnoreCase(type) && !room.isBooked()) {
                return room;
            }
        }
        return null;
    }

    public Reservation bookRoom(String guestName, String roomType) {
        Room room = findAvailableRoom(roomType);
        if (room != null) {
            room.setBooked(true);
            Reservation reservation = new Reservation(guestName, room);
            reservations.add(reservation);
            return reservation;
        }
        return null;
    }
}

class Room {
    private int number;
    private String type;
    private boolean booked;

    public Room(int number, String type) {
        this.number = number;
        this.type = type;
        this.booked = false;
    }

    public int getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }
}

class Reservation {
    private String guestName;
    private Room room;

    public Reservation(String guestName, Room room) {
        this.guestName = guestName;
        this.room = room;
    }

    public String getGuestName() {
        return guestName;
    }

    public Room getRoom() {
        return room;
    }
}
