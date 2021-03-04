package designpatterns.structural.composite.rectangles;

import java.util.List;

public class YellowAndRedBlueCompositeRectangle implements Rectangle{

    private List<Rectangle> rectangleList;

    public YellowAndRedBlueCompositeRectangle(List<Rectangle> rectangleList) {
        this.rectangleList = rectangleList;
    }

    @Override
    public void draw() {
        rectangleList.forEach(Rectangle::draw);
    }
}
