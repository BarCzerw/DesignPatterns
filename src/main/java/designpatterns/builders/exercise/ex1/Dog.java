package designpatterns.builders.exercise.ex1;

import java.util.List;

public class Dog {

    private String name;
    private String type;
    private Integer age;
    private List<String> toys;

    private Dog(String name, String type, Integer age, List<String> toys) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.toys = toys;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Integer getAge() {
        return age;
    }

    public List<String> getToys() {
        return toys;
    }

    public void print() {
        System.out.println(type + " - " + name + " - " + age + " years");
        System.out.println("Toys:");
        for (String toy : toys) {
            System.out.println("-"+toy);
        }
        System.out.println("----------------------------------");
    }

    public static class Builder{
        private String name;
        private String type;
        private Integer age;
        private List<String> toys;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withType(String type) {
            this.type = type;
            return this;
        }

        public Builder withAge(Integer age) {
            this.age = age;
            return this;
        }

        public Builder withToys(List<String> toys) {
            this.toys = toys;
            return this;
        }

        public Dog build() {
            return new Dog(name, type, age, toys);
        }

    }
}
