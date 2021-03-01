package designpatterns.builders.example;

public class BurgerShop {

    public static void main(String[] args) {

        Burger burger1 = new Burger.Builder()
                .withName("BBQ Burger")
                .withPrice(24.99)
                .withIngredient("Beef 200g")
                .withIngredient("Red onion")
                .withIngredient("Tomato")
                .withIngredient("BBQ Sauce")
                .withIngredient("Letuce")
                .withIngredient("Cheese")
                .build();

        burger1.print();
    }

}
