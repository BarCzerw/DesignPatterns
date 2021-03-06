package designpatterns.creational.builders.example;

import designpatterns.creational.example.enums.Ingredient;
import designpatterns.creational.example.enums.Weight;

import java.util.ArrayList;
import java.util.List;

public class Burger {

    private String name;
    private double price;
    private Weight weight;
    private List<Ingredient> ingredients;

    public Burger(String name, double price, Weight weight, List<Ingredient> ingredients) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Weight getWeight() {
        return weight;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void print() {
        System.out.println(getName() + " - " + getPrice());
        System.out.println("Ingredients:");
        for (Ingredient ingredient : ingredients) {
            System.out.println("-" + ingredient);
        }
        System.out.println("--------------------");
    }

    @Override
    public String toString() {
        return getName() + " - " + getPrice();
    }

    public static class Builder {

        private String name;
        private double price;
        private Weight weight;
        private List<Ingredient> ingredients = new ArrayList<>();

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder withWeight(Weight weight) {
            this.weight = weight;
            return this;
        }

        public Builder withIngredient(Ingredient ingredient) {
            this.ingredients.add(ingredient);
            return this;
        }

        public Burger build() {
            return new Burger(name, price, weight, ingredients);
        }

    }


}
