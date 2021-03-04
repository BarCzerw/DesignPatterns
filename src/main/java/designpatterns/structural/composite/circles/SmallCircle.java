package designpatterns.structural.composite.circles;

public class SmallCircle implements Circle{
    @Override
    public void draw() {
        System.out.println("Drawing small circle");
    }
}
