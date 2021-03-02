package designpatterns.builders.example;

import designpatterns.factories.example.enums.Ingredient;

public class BurgerShop {

    public static void main(String[] args) {

        Burger burger1 = new Burger.Builder()
                .withName("BBQ Burger")
                .withPrice(24.99)
                .withIngredient(Ingredient.BEEF)
                .withIngredient(Ingredient.ONION)
                .withIngredient(Ingredient.TOMATO)
                .withIngredient(Ingredient.BBQ_SAUCE)
                .withIngredient(Ingredient.LETTUCE)
                .withIngredient(Ingredient.CHEESE)
                .build();

        burger1.print();
    }

}
