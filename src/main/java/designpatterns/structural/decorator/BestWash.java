package designpatterns.structural.decorator;

public class BestWash implements CarWash{

    private ProWash proWash;

    public BestWash(ProWash proWash) {
        this.proWash = proWash;
    }


    @Override
    public void washCar() {
        System.out.println("Best wash in the city!");
        proWash.washCar();
    }
}
