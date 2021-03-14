package designpatterns.behavioral.observers.exercise;

public class ValueLoweredObserver extends Observer {

    private int currentValue;

    public ValueLoweredObserver(Subject subject) {
        super(subject);
        this.currentValue = subject.getValue();
    }

    @Override
    public void update() {
        if (subject.getValue() < currentValue) {
            System.out.println("Value lowered from " + currentValue + " to " + subject.getValue());
        }
        currentValue = subject.getValue();
    }
}
