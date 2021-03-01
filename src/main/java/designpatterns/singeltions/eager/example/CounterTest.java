package designpatterns.singeltions.eager.example;

public class CounterTest {

    public static void main(String[] args) {

        //Using class
//        CounterClass counter1 = new CounterClass(); //Cannot create because constructor is private
        CounterClass counterClass2 = CounterClass.getInstance(); //Counter is not created, just assigned
        CounterClass counterClass3 = CounterClass.getInstance(); //both counter2 and counter3 are the same instance

        System.out.println("counterClass2==counterClass3 ? " + (counterClass2 == counterClass3));

        for (int i = 0; i < 10; i++) {
            counterClass2.increment();
            counterClass3.increment();
        }

        System.out.println("Value after 10 increments on counterClass2 and counterClass3 = " + counterClass2.getValue());

        //Using enum
        CounterEnum counterEnum1 = CounterEnum.INSTANCE;
        CounterEnum counterEnum2 = CounterEnum.INSTANCE;

        System.out.println("counterEnum1==counterEnum2 ? " + (counterEnum1 == counterEnum2));

        for (int i = 0; i < 10; i++) {
            counterEnum1.increment();
            counterEnum2.increment();
        }

        System.out.println("Value after 10 increments on counterEnum1 and counterEnum2 = " + counterEnum2.getValue());

    }

}
