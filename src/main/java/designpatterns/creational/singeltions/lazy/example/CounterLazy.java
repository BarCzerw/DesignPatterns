package designpatterns.creational.singeltions.lazy.example;

public class CounterLazy {

    private static CounterLazy INSTANCE;
    private int value;


    private CounterLazy() {
        value = 0;
    }

    public static CounterLazy getInstance() {
        if (INSTANCE == null) {
            synchronized (CounterLazy.class) {
                if (INSTANCE == null) {
                    INSTANCE = new CounterLazy();
                }
            }
        }
        return INSTANCE;
    }

    public void increment() {
        value++;
    }

    public void decrement() {
        value--;
    }

    public int getValue() {
        return value;
    }

}
