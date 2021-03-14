package designpatterns.behavioral.observers.exercise;

import java.util.HashSet;
import java.util.Set;

public class Subject {

    Set<Observer> observers = new HashSet<>();
    private int value;

    public Subject(int value) {
        this.value = value;
    }

    public boolean subscribe(Observer observer) {
        return observers.add(observer);
    }

    public int getValue() {
        return value;
    }

    public void changeValueBy(int value) {
        if (value != 0) {
            this.value += value;
            observers.forEach(Observer::update);
        }
    }
}
