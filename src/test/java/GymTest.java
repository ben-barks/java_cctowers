import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GymTest {

    private Gym gym;
    ArrayList<String> types;

    @Before
    public void before(){
        types = new ArrayList<String>();
        types.add("Workout room");
        types.add("Spa");
        types.add("Swimming pool");
        gym = new Gym(10, types);
    }

    @Test
    public void hasCapacity(){
        assertEquals(10, gym.getCapacity());
    }

    @Test
    public void hasTypes(){
        assertEquals(types, gym.getTypes());
    }

}
