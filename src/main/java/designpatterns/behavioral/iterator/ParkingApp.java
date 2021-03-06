package designpatterns.behavioral.iterator;

import java.util.Iterator;

public class ParkingApp {

    public static void main(String[] args) {

        Parking parking = new Parking();
        parkSomeCars(parking);
        printAllCars(parking);

        OtherParking otherParking = new OtherParking();
        otherParking.park(new Vehicle(VehicleType.CAR));
        otherParking.park(new Vehicle(VehicleType.MOTORCYCLE));
        otherParking.park(new Vehicle(VehicleType.CAR));
        otherParking.park(new Vehicle(VehicleType.SUV));
        otherParking.park(new Vehicle(VehicleType.CAR));
        otherParking.park(new Vehicle(VehicleType.SUV));
        otherParking.park(new Vehicle(VehicleType.CAR));
        otherParking.park(new Vehicle(VehicleType.CAR));
        otherParking.park(new Vehicle(VehicleType.MOTORCYCLE));
        otherParking.park(new Vehicle(VehicleType.MOTORCYCLE));

        Iterator<Vehicle> iterator = otherParking.iterator();
        while (iterator.hasNext()) {
            System.out.println("Next vehicle in other parking: " + iterator.next().getType());
        }

    }

    private static void printAllCars(Parking parking) {
        Iterator<Vehicle> iterator = parking.iterator();
        while (iterator.hasNext()) {
            Vehicle current = iterator.next();
            System.out.println("Next vehicle: " + current.getType());
        }
    }

    private static void parkSomeCars(Parking parking) {
        parking.park(new Vehicle(VehicleType.CAR));
        parking.park(new Vehicle(VehicleType.SUV));
        parking.park(new Vehicle(VehicleType.MOTORCYCLE));
        parking.park(new Vehicle(VehicleType.MOTORCYCLE));
        parking.park(new Vehicle(VehicleType.CAR));
        parking.park(new Vehicle(VehicleType.CAR));
        parking.park(new Vehicle(VehicleType.SUV));
        parking.park(new Vehicle(VehicleType.CAR));
        parking.park(new Vehicle(VehicleType.SUV));
        parking.park(new Vehicle(VehicleType.CAR));
    }
}
