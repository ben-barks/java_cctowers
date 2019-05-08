import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;
    ArrayList<String> times;

    @Before
    public void before(){
        times = new ArrayList<String>();
        times.add("Breakfast");
        times.add("Lunch");
        times.add("Dinner");
        times.add("Drinks");
        diningRoom = new DiningRoom(10, times);
    }

    @Test
    public void hasCapacity(){
        assertEquals(10, diningRoom.getCapacity());
    }

    @Test
    public void hasTimes(){
        assertEquals(times, diningRoom.getTimes());
    }
}
