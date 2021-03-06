package designpatterns.creational.example;

public class Dog implements Cloneable {

    private static int COUNTER = 0;

    private String name;
    private int age;
    private int id;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = COUNTER++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    @Override
    public Dog clone() throws CloneNotSupportedException {
        return (Dog) super.clone();
    }

    public Dog copy() {
        return new Dog(name, age);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
