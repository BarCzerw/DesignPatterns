package designpatterns.structural.decorator.example;

public class EnhancedWash implements CarWash {

    private StandardWash standardWash;

    public EnhancedWash(StandardWash standardWash) {
        this.standardWash = standardWash;
    }

    @Override
    public void washCar() {
        System.out.println("Enhanced car wash");
        standardWash.washCar();
    }
}
