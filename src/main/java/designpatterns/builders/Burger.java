package designpatterns.builders;

import java.util.ArrayList;
import java.util.List;

public class Burger {

    private String name;
    private double price;
    private List<String> ingredients;

    public Burger(String name, double price, List<String> ingredients) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void print() {
        System.out.println(getName() + " - " + getPrice());
        System.out.println("Ingredients:");
        for (String ingredient : ingredients) {
            System.out.println("-" + ingredient);
        }
        System.out.println("--------------------");
    }

    public static class Builder {

        private String name;
        private double price;
        private List<String> ingredients = new ArrayList<>();

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder withIngredient(String ingredient) {
            this.ingredients.add(ingredient);
            return this;
        }

        public Burger build() {
            return new Burger(name, price, ingredients);
        }

    }


}
