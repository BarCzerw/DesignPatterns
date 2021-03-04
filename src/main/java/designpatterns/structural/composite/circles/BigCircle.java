package designpatterns.structural.composite.circles;

public class BigCircle implements Circle{
    @Override
    public void draw() {
        System.out.println("Drawing BIIIIG circle");
    }
}
