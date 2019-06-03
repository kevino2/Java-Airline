import java.util.ArrayList;

public class Flight {


    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public Plane getPlane() {
        return this.plane;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }

    public boolean addPassenger(Passenger passenger) {
        return this.passengers.add(passenger);
    }

    public int getPassengerNumbers() {
        return this.passengers.size();
    }


    public Plane addPlane(PlaneType plane) {
        PlaneType[] planeList = PlaneType.values();
        for (PlaneType eachPlane : planeList) {
            if (plane == eachPlane) {
                this.plane = new Plane(plane);
                return this.plane;
            }
        }
        return null;
    }

    public int calculateBagWeight(){
        return (plane.getType().baggageAllocation() / plane.getType().getCapacity());
    }

    public int getRemainingSeats () {
        return (this.plane.getType().getCapacity() - this.getPassengerNumbers());
    }

    }

 