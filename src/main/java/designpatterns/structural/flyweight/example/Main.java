package designpatterns.structural.flyweight.example;

public class Main {

    public static void main(String[] args) {
        Car car = CarFactory.stwórzSamochód("Audi", "Czerwony", "Nowy");
        System.out.println(car);
        Car car2 = CarFactory.stwórzSamochód("Opel", "Czarny", "Nowy");
        System.out.println(car2);
        Car car3 = CarFactory.stwórzSamochód("Nissan", "Zielony", "Jakis");
        System.out.println(car3);
    }

}
