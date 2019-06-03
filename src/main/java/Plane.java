public class Plane {
    private PlaneType type;


    public Plane (PlaneType type) {
        this.type = type;
    }

    public PlaneType getType () {
        return type;
    }

    public int getEnumCapacity() {
        return this.type.getCapacity();
    }

    public int getEnumWeight() {
        return this.type.getTotalWeight();
    }
}
