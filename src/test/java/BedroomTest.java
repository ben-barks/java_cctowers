import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom room;
    Guest guests;
    ArrayList<String> types;


    @Before
    public void before(){
        types = new ArrayList<String>();
        types.add("Single");
        types.add("Double");
        types.add("Family");
        room = new Bedroom(32, 4, types, 100);
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(32, room.getRoomNumber());
    }

    @Test
    public void hasCapacity(){
        assertEquals(4, room.getCapacity());
    }

    @Test
    public void hasCollectionOfTypes(){
        assertEquals(types, room.getTypesOfRooms());
    }

    @Test
    public void canCalculateBookingCost(){
        assertEquals(600, room.bookingCost(6));
    }
}
