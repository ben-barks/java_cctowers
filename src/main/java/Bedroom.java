import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<String> typesOfRooms;
    private ArrayList<Guest> guests;
    private int nightlyRate;

    public Bedroom(int roomNumber, int capacity, ArrayList<String>typesOfRooms, int nightlyRate){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.typesOfRooms = new ArrayList<>();
        this.nightlyRate = nightlyRate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<String> getTypesOfRooms() {
        typesOfRooms.add("Single");
        typesOfRooms.add("Double");
        typesOfRooms.add("Family");
        return typesOfRooms;
    }

    public int bookingCost(int numberOfNights){
        return this.nightlyRate * numberOfNights;
    }
}
