import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    private Flight flight;
    private Passenger passenger1;
    private Passenger passenger2;
    private Plane plane;

    @Before
    public void setUp() {
//
//        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(new Plane(PlaneType.BOEING747), "FR756", "GLA", "ROM", "10:10");
        flight.addPlane(PlaneType.BOEING747);
        passenger1 = new Passenger("Jim", 3);
        passenger2 = new Passenger("John", 3);


    }


    @Test
    public void canGetPlane() {
        assertEquals(PlaneType.BOEING747, flight.getPlane().getType());
    }

    @Test
    public void canGetFlightNumber() {
        assertEquals("FR756", flight.getFlightNumber());
    }

    @Test
    public void canGetDestination(){
        assertEquals( "GLA", flight.getDestination());
    }

    @Test
    public void canGetDepartureAirport(){
        assertEquals( "ROM", flight.getDepartureAirport());
    }

    @Test
    public void canGetDepartureTime(){
        assertEquals( "10:10", flight.getDepartureTime());
    }

    @Test
    public void canGetPassengerNumbers(){

        assertEquals( 0 , flight.getPassengerNumbers());
    }

    @Test
    public void canAddPassenger(){
           flight.addPassenger(passenger1);
           flight.addPassenger(passenger2);
        assertEquals( 2  , flight.getPassengerNumbers());
    }


    @Test
    public void canAddPlaneToFlight(){
        assertEquals(PlaneType.BOEING747, flight.getPlane().getType());
    }

    @Test
    public void canCalculateBagWeight(){
        assertEquals(50, flight.calculateBagWeight());
    }


    @Test
    public void canCalculateRemainingSeats(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        assertEquals(298, flight.getRemainingSeats());
    }

}
