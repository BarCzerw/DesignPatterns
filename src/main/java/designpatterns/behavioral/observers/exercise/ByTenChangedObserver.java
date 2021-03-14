package designpatterns.behavioral.observers.exercise;

public class ByTenChangedObserver extends Observer {

    private int currentValue;

    public ByTenChangedObserver(Subject subject) {
        super(subject);
        this.currentValue = subject.getValue();
    }

    @Override
    public void update() {
        if (Math.abs(currentValue - subject.getValue()) >= 10) {
            System.out.println("Significant change from " + currentValue + " to " + subject.getValue());
            currentValue = subject.getValue();
        }
    }
}
