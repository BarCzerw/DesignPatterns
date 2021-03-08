package designpatterns.structural.bridge.example.vending.menu;

import designpatterns.structural.bridge.example.interfaces.DrinkPurchase;
import designpatterns.structural.bridge.example.vending.NotEnoughMoneyException;
import designpatterns.structural.bridge.example.vending.VendingMachine;

public class DrinkChoice implements MenuElement {

    private VendingMachine vendingMachine;
    private DrinkPurchase drinkPurchase;
    private MenuElement caller;

    public DrinkChoice(MenuElement caller, DrinkPurchase drinkPurchase) {
        this.caller = caller;
        this.vendingMachine = getMachine();
        this.drinkPurchase = drinkPurchase;
    }

    @Override
    public void onBeingChoosen() {
        try {
            vendingMachine.purchase(drinkPurchase);
        } catch (NotEnoughMoneyException e) {

        }
        caller.onBeingChoosen();
    }

    @Override
    public MenuElement getCaller() {
        return caller;
    }

    @Override
    public VendingMachine getMachine() {
        return getCaller().getMachine();
    }

    @Override
    public String toString() {
        return drinkPurchase.toString();
    }
}
