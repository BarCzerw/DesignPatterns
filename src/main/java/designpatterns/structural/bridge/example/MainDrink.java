package designpatterns.structural.bridge.example;

import designpatterns.structural.bridge.example.drinks.Drink;
import designpatterns.structural.bridge.example.enums.Additions;
import designpatterns.structural.bridge.example.interfaces.BeerPurchase;
import designpatterns.structural.bridge.example.interfaces.CoffeePurchase;
import designpatterns.structural.bridge.example.interfaces.TeaPurchase;

import java.util.List;

public class MainDrink {

    public static void main(String[] args) {

        CoffeePurchase coffeePurchase = new CoffeePurchase();
        Drink purchase1 = coffeePurchase.purchase(List.of(Additions.BROWN_SUGAR, Additions.MILK));
        System.out.println("Coffee - " + purchase1.getVolume() + " - " + purchase1.getPrice() + " zł - " + purchase1.isAlcoholic() + " - " + purchase1.getAdditions());

        TeaPurchase teaPurchase = new TeaPurchase();
        Drink purchase2 = teaPurchase.purchase(List.of(Additions.SUGAR));
        System.out.println("Tea - " + purchase2.getVolume() + " - " + purchase2.getPrice() + " zł - " + purchase2.isAlcoholic() + " - " + purchase2.getAdditions());

        BeerPurchase beerPurchase = new BeerPurchase();
        Drink purchase3 = beerPurchase.purchase(List.of(Additions.JUICE));
        System.out.println("Beer - " + purchase3.getVolume() + " - " + purchase3.getPrice() + " zł - " + purchase3.isAlcoholic() + " - " + purchase3.getAdditions());

    }

}
