package designpatterns.singeltions.eager.example;

public class CounterClass {

    private static final CounterClass INSTANCE = new CounterClass();
    private int value;

    private CounterClass() {
        value = 0;
    }

    public static CounterClass getInstance() {
        return INSTANCE;
    }

    public int getValue() {
        return value;
    }

    public void increment() {
        value++;
    }

    public void decrement() {
        value--;
    }

}
