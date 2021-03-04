package designpatterns.structural.decorator.example;

public class StandardWash implements CarWash {

    @Override
    public void washCar() {
        System.out.println("Standard car wash");
    }
}
