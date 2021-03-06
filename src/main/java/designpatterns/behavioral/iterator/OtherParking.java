package designpatterns.behavioral.iterator;

import java.util.Iterator;

public class OtherParking implements Iterable<Vehicle>{

    private final static int MAX_CAPACITY = 6;
    private Vehicle[] vehicles = new Vehicle[MAX_CAPACITY];
    private int occupied = 0;

    public void park(Vehicle vehicle) {
        if (occupied < MAX_CAPACITY) {
            vehicles[occupied++] = vehicle;
        } else {
            System.out.println("Parking is full!");
        }
    }

    @Override
    public Iterator<Vehicle> iterator() {
        return new VehicleIterator();
    }

    private class VehicleIterator implements Iterator<Vehicle> {

        private int idx = 0;

        @Override
        public boolean hasNext() {
            return idx<MAX_CAPACITY && vehicles[idx]!=null;
        }

        @Override
        public Vehicle next() {
            return vehicles[idx++];
        }
    }
}
