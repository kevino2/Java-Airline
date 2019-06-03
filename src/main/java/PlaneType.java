public enum PlaneType {

    BOEING747 (300, 30000),
    CONCORDE (200, 40000),
    F16 ( 4, 20000);

    private final int capacity;
    private int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity () {
        return this.capacity;
    }

    public int getTotalWeight () {
        return this.totalWeight;
    }

    public int baggageAllocation () {
            return this.totalWeight / 2;
    }


}


