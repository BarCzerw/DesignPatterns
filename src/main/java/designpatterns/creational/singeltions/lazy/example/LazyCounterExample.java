package designpatterns.creational.singeltions.lazy.example;

public class LazyCounterExample {

    public static void main(String[] args) {

        CounterLazy cl1 = CounterLazy.getInstance();
        CounterLazy cl2 = CounterLazy.getInstance();

        for (int i = 0; i < 10; i++) {
            cl1.increment();
            cl2.increment();
        }

        System.out.println(cl1.getValue());

    }

}
