package designpatterns.behavioral.iterator;

public class Vehicle {

    private VehicleType type;

    public Vehicle(VehicleType type) {
        this.type = type;
    }

    public VehicleType getType() {
        return type;
    }
}
