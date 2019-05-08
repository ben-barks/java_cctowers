import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<DiningRoom> diningRooms;
    private ArrayList<Gym> gym;
    private ArrayList<Guest> guests;
    private ArrayList<Booking> bookings;

    public Hotel(String name){
        this.name = name;
        this.bedrooms = new ArrayList<>();
        this.diningRooms= new ArrayList<>();
        this.gym = new ArrayList<>();
        this.guests = new ArrayList<>();
        this.bookings = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Bedroom> hasBedrooms() {
        return this.bedrooms;
    }

    public ArrayList<DiningRoom> hasDiningRooms() {
        return this.diningRooms;
    }

    public ArrayList<Gym> hasGyms() {
        return this.gym;
    }

    public int guestCount() {
        return guests.size();
    }

    public void checkIn(Guest guest) { guests.add(guest); }

    public void checkOut() {
        guests.remove(0);
    }

    public void bookRoom(String bedroom, int nights, String guest){
        Booking newBooking = new Booking(bedroom, nights, guest);
        bookings.add(newBooking);
    }

    public int bookingsCount() {
        return bookings.size();
    }
}
