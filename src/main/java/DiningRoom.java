import java.util.ArrayList;

public class DiningRoom {

    private int capacity;
    private ArrayList<String> times;

    public DiningRoom(int capacity, ArrayList<String> times){
        this.capacity = capacity;
        this.times = new ArrayList<String>();
    }


    public int getCapacity() {
        return capacity;
    }

    public ArrayList<String> getTimes() {
        times.add("Breakfast");
        times.add("Lunch");
        times.add("Dinner");
        times.add("Drinks");
        return times;
    }
}
