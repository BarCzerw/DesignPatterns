package designpatterns.structural.bridge.example.vending.menu;

import designpatterns.structural.bridge.example.drinks.Drink;
import designpatterns.structural.bridge.example.vending.MenuElement;
import designpatterns.structural.bridge.example.vending.VendingMachine;

public class DrinkChoice implements MenuElement {

    private VendingMachine vendingMachine;
    private Drink drink;

    public DrinkChoice(VendingMachine vm, Drink drink) {
        this.vendingMachine = vm;
        this.drink = drink;
    }

    @Override
    public void onBeingChoosen() {

    }
}
