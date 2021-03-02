package designpatterns.factories.example.restaurants;

import designpatterns.builders.example.Burger;
import designpatterns.factories.example.enums.BurgerType;
import designpatterns.factories.example.enums.Ingredient;
import designpatterns.factories.example.enums.Weight;
import designpatterns.factories.example.factory.Restaurant;

public class McDonald extends Restaurant {

    @Override
    public Burger order(BurgerType type) {
        switch (type) {
            case CHEESEBURGER -> {
                return new Burger.Builder()
                        .withName("McCheese")
                        .withWeight(Weight.G_150)
                        .withPrice(14.99)
                        .withIngredient(Ingredient.CHEESE)
                        .withIngredient(Ingredient.BEEF)
                        .withIngredient(Ingredient.MAYONNAISE)
                        .withIngredient(Ingredient.LETTUCE)
                        .withIngredient(Ingredient.TOMATO)
                        .build();
            }
            case HAMBURGER -> {
                return new Burger.Builder()
                        .withName("McBurger")
                        .withWeight(Weight.G_300)
                        .withPrice(16.99)
                        .withIngredient(Ingredient.CHEESE)
                        .withIngredient(Ingredient.BEEF)
                        .withIngredient(Ingredient.MAYONNAISE)
                        .withIngredient(Ingredient.LETTUCE)
                        .withIngredient(Ingredient.TOMATO)
                        .build();
            }
            case BBQ_BURGER -> {
                return new Burger.Builder()
                        .withName("McBBQ")
                        .withWeight(Weight.G_150)
                        .withPrice(17.99)
                        .withIngredient(Ingredient.CHEESE)
                        .withIngredient(Ingredient.BEEF)
                        .withIngredient(Ingredient.MAYONNAISE)
                        .withIngredient(Ingredient.LETTUCE)
                        .withIngredient(Ingredient.TOMATO)
                        .withIngredient(Ingredient.ONION)
                        .withIngredient(Ingredient.BBQ_SAUCE)
                        .build();
            }
            default -> {
                System.out.println("Burger not in menu!");
                throw new RuntimeException();
            }
        }
    }
}
