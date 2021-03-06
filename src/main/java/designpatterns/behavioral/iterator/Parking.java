package designpatterns.behavioral.iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Parking implements Iterable<Vehicle> {

    List<Vehicle> vehicleList;

    public Parking() {
        vehicleList = new LinkedList<>();
    }

    public void park(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    @Override
    public Iterator<Vehicle> iterator() {
        return vehicleList.iterator();
    }
}
