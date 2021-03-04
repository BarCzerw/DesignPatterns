package designpatterns.structural.decorator.example;

public class CarWashApp {

    public static void main(String[] args) {
        StandardWash standard = new StandardWash();
        standard.washCar();
        System.out.println("-------------------");
        EnhancedWash enhanced = new EnhancedWash(standard);
        enhanced.washCar();
        System.out.println("-------------------");
        ProWash pro = new ProWash(enhanced);
        pro.washCar();
        System.out.println("-------------------");
        BestWash best = new BestWash(pro);
        best.washCar();
        System.out.println("-------------------");
    }

}
