package designpatterns.behavioral.observers.exercise;

public class ConcreteValueObserver extends Observer{

    public ConcreteValueObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("New value - " + subject.getValue());
    }
}
