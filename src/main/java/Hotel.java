import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private String name;
    private HashMap<String, Integer> numOfRooms;
    private ArrayList<Guest> guests;

    public Hotel(String name){
        this.name = name;
        this.numOfRooms = new HashMap<>();
    }

    public String getName() {
        return name;
    }
}
