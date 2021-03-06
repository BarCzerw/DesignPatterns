package designpatterns.creational.example;

public class DogMain {

    public static void main(String[] args) throws CloneNotSupportedException {

        Dog originalDog = new Dog("Reksio", 3);
        Dog clonedDog = originalDog.clone(); //clone does not use constructor
        Dog copiedDog = originalDog.copy(); //user-defined copy method does

        System.out.println(originalDog);
        System.out.println(clonedDog);
        System.out.println(copiedDog);
    }

}
