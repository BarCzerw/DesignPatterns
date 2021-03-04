package designpatterns.structural.composite;

import designpatterns.structural.composite.rectangles.*;

import java.util.List;

public class CadMain {

    public static void main(String[] args) {

        RedRectangle rr = new RedRectangle();
        BlueRectangle br = new BlueRectangle();

        RedBlueCompositeRectangle rbr = new RedBlueCompositeRectangle(List.of(rr, br));

        YellowRectangle yr = new YellowRectangle();

        YellowAndRedBlueCompositeRectangle yrbr = new YellowAndRedBlueCompositeRectangle(List.of(yr, rbr));

        yrbr.draw();
    }
}
