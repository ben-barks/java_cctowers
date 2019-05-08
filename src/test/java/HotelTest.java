import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom room;
    ArrayList<Bedroom> bedrooms;
    ArrayList<Gym> gym;
    ArrayList<DiningRoom> diningRoom;
    private Guest guest;
    ArrayList<String> types;

    @Before
    public void before() {
        types = new ArrayList<String>();
        types.add("Single");
        types.add("Double");
        types.add("Family");
        room = new Bedroom(32,4,types, 100);
        bedrooms = new ArrayList<Bedroom>();
        diningRoom = new ArrayList<DiningRoom>();
        gym = new ArrayList<Gym>();
        hotel = new Hotel("CC Towers");
        guest = new Guest();
    }

    @Test
    public void hotelHasName(){
        assertEquals("CC Towers", hotel.getName());
    }

    @Test
    public void hasRoomTypes(){
        assertEquals(bedrooms, hotel.hasBedrooms());
    }

    @Test
    public void hasDiningRoomTypes(){
        assertEquals(diningRoom, hotel.hasDiningRooms());
    }

    @Test
    public void hasGymTypes(){
        assertEquals(gym, hotel.hasGyms());
    }

    @Test
    public void canCheckIn(){
        hotel.checkIn(guest);
        assertEquals(1, hotel.guestCount());
    }

    @Test
    public void canCheckOutGuest(){
        hotel.checkIn(guest);
        hotel.checkIn(guest);
        hotel.checkOut();
        assertEquals(1, hotel.guestCount());
    }

    @Test
    public void canBookRoom(){
        hotel.bookRoom("Double", 7, "Mr Poopybutthole");
        assertEquals(1, hotel.bookingsCount());
    }

}
