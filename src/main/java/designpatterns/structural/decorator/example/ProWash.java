package designpatterns.structural.decorator.example;

public class ProWash implements CarWash{

    private EnhancedWash enhancedWash;

    public ProWash(EnhancedWash enhancedWash) {
        this.enhancedWash = enhancedWash;
    }

    @Override
    public void washCar() {
        System.out.println("Pro exclusive wash");
        enhancedWash.washCar();
    }
}
