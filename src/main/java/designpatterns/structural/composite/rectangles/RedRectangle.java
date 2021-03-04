package designpatterns.structural.composite.rectangles;

public class RedRectangle implements Rectangle {
    @Override
    public void draw() {
        System.out.println("Drawing red rectangle");
    }
}
