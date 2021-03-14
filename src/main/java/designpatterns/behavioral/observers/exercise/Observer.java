package designpatterns.behavioral.observers.exercise;

public abstract class Observer {

    protected Subject subject;

    public abstract void update();

    public Observer(Subject subject) {
        this.subject = subject;
        subject.subscribe(this);
    }
}
