package designpatterns.structural.composite.circles;

import java.util.List;

public class CompositeCircle implements Circle {

    List<Circle> circleList;

    public CompositeCircle(List<Circle> circleList) {
        this.circleList = circleList;
    }

    @Override
    public void draw() {
        circleList.forEach(Circle::draw);
    }
}
