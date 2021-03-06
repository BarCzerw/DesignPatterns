package designpatterns.creational.example.restaurants;

import designpatterns.creational.builders.example.Burger;
import designpatterns.creational.example.enums.BurgerType;
import designpatterns.creational.example.enums.Ingredient;
import designpatterns.creational.example.enums.Weight;
import designpatterns.creational.example.factory.Restaurant;

public class Kfc extends Restaurant {

    @Override
    public Burger order(BurgerType type) {
        switch (type) {
            case CHEESEBURGER -> {
                return new Burger.Builder()
                        .withName("Cheeseburger")
                        .withWeight(Weight.G_150)
                        .withPrice(14.99)
                        .withIngredient(Ingredient.CHICKEN)
                        .withIngredient(Ingredient.TOMATO)
                        .withIngredient(Ingredient.MAYONNAISE)
                        .withIngredient(Ingredient.LETTUCE)
                        .withIngredient(Ingredient.ONION)
                        .build();
            }
            case HAMBURGER -> {
                return new Burger.Builder()
                        .withName("Chickenburger")
                        .withWeight(Weight.G_150)
                        .withPrice(12.99)
                        .withIngredient(Ingredient.CHICKEN)
                        .withIngredient(Ingredient.MAYONNAISE)
                        .withIngredient(Ingredient.LETTUCE)
                        .withIngredient(Ingredient.TOMATO)
                        .withIngredient(Ingredient.PICKLE)
                        .build();
            }
            case BBQ_BURGER -> {
                return new Burger.Builder()
                        .withName("Grander")
                        .withWeight(Weight.G_200)
                        .withPrice(23.99)
                        .withIngredient(Ingredient.CHEESE)
                        .withIngredient(Ingredient.CHICKEN)
                        .withIngredient(Ingredient.MAYONNAISE)
                        .withIngredient(Ingredient.LETTUCE)
                        .withIngredient(Ingredient.TOMATO)
                        .withIngredient(Ingredient.ONION)
                        .withIngredient(Ingredient.BBQ_SAUCE)
                        .withIngredient(Ingredient.BACON)
                        .build();
            }
            default -> {
                System.out.println("Burger not in menu!");
                throw new RuntimeException();
            }
        }
    }
}
