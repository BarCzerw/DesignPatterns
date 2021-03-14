package designpatterns.behavioral.observers.exercise;

import java.util.List;
import java.util.Scanner;

public class SubjectMain {

    public static void main(String[] args) {

        Subject humidity = new Subject(20);

        List<Observer> observerList = List.of(
                new ConcreteValueObserver(humidity),
                new ValueLoweredObserver(humidity),
                new ByTenChangedObserver(humidity));

        while (true) {
            humidity.changeValueBy(new Scanner(System.in).nextInt());
        }

    }


}
