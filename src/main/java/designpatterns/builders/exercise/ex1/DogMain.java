package designpatterns.builders.exercise.ex1;

import java.util.List;

public class DogMain {

    public static void main(String[] args) {

        Dog labrador = new Dog.Builder()
                .withAge(4)
                .withName("Kajtek")
                .withType("Labrador")
                .withToys(List.of("Rubber bone","Bouncy ball"))
                .build();

        labrador.print();

    }

}
