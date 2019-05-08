import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom room;
    ArrayList<String> types;
    private Guest guest;

    @Before
    public void before() {
        hotel = new Hotel("CC Towers");
        room = new Bedroom(32,4,types);
        types = new ArrayList<String>();
        types.add("Single");
        types.add("Double");
        types.add("Family");
        guest = new Guest();
    }

    @Test
    public void hotelHasName(){
        assertEquals("CC Towers", hotel.getName());
    }
//    @Test
//    public void hasNumberOfRooms(){
//        assertEquals(3, hotel.hasRooms());
//    }


}
