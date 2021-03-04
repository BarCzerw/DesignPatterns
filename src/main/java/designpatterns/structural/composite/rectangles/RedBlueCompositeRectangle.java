package designpatterns.structural.composite.rectangles;

import java.util.List;

public class RedBlueCompositeRectangle implements Rectangle {

    private List<Rectangle> rectangleList;

    public RedBlueCompositeRectangle(List<Rectangle> rectangleList) {
        this.rectangleList = rectangleList;
    }

    @Override
    public void draw() {
        rectangleList.forEach(Rectangle::draw);
    }
}
