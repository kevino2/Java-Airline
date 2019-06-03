import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger1;

    @Before
    public void setUp() {
        passenger1 = new Passenger("Jim", 3);
    }

    @Test
    public void canGetName() { assertEquals("Jim", passenger1.getName()); }

    @Test
    public void canGetNoOfBags() { assertEquals(3, passenger1.getNoOfBags()); }
}




