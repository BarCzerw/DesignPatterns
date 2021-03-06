package designpatterns.creational.singeltions.eager.example;

public enum CounterEnum {

    INSTANCE;

    private int value=0;

    public void increment() {
        value++;
    }

    public int getValue() {
        return value;
    }

}
