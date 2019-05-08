import java.util.ArrayList;

public class Gym {

    private int capacity;
    private ArrayList<String> types;

    public Gym(int capacity, ArrayList<String> types){
        this.capacity = capacity;
        this.types = new ArrayList<String>();
    }

    public ArrayList<String> getTypes() {
        types.add("Workout room");
        types.add("Spa");
        types.add("Swimming pool");
        return types;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
