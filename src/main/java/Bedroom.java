import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<String> typesOfRooms;
    private ArrayList<Guest> guests;

    public Bedroom(int roomNumber, int capacity, ArrayList<String>typesOfRooms){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.typesOfRooms = new ArrayList<>();
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
}
