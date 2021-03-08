package designpatterns.structural.bridge.example.vending;

import designpatterns.structural.bridge.example.drinks.Drink;
import designpatterns.structural.bridge.example.interfaces.BeerPurchase;
import designpatterns.structural.bridge.example.interfaces.CoffeePurchase;
import designpatterns.structural.bridge.example.interfaces.DrinkPurchase;
import designpatterns.structural.bridge.example.interfaces.TeaPurchase;
import designpatterns.structural.bridge.example.vending.menu.*;

import java.util.List;

public class VendingMachine {

    private double coinsInMachine;
    private MainMenu mainMenu;
    private VendingState state;

    public VendingMachine() {
        this.coinsInMachine = 0;
        this.state = VendingState.MENU;
        this.mainMenu = createMainMenu();
    }

    public double getBalance() {
        return coinsInMachine;
    }

    public VendingState getState() {
        return state;
    }

    public void setState(VendingState state) {
        this.state = state;
    }

    public void insertCoin(double value) {
        if (state == VendingState.COIN_INSERTING) {
            coinsInMachine += value;
            System.out.println("Inserted " + value + " gr - current balance - " + coinsInMachine);
        }
    }

    public void releaseCoins() {
        System.out.println("Released " + coinsInMachine);
        coinsInMachine = 0;
        state = VendingState.MENU;
    }

    public Drink purchase(DrinkPurchase drinkPurchase) throws NotEnoughMoneyException {
        if (state == VendingState.PURCHASING_DRINK && coinsInMachine >= drinkPurchase.getPrice()) {
            coinsInMachine -= drinkPurchase.getPrice();
            return drinkPurchase.purchase(List.of());
        } else {
            throw new NotEnoughMoneyException(this, drinkPurchase.purchase(List.of()));
        }
    }

    private MainMenu createMainMenu() {

        MainMenu mm = new MainMenu(this);
        CoinInsertMenu cim = new CoinInsertMenu(mm);
        PurchaseMenu pm = new PurchaseMenu(mm);

        mm.setSubElements(List.of(pm, cim));
        cim.setSubElements(List.of(
                new CoinChoice(cim, .05),
                new CoinChoice(cim, 0.10),
                new CoinChoice(cim, 0.20),
                new CoinChoice(cim, 0.5),
                new ExitChoice(cim)));
        pm.setSubElements(List.of(
                new DrinkChoice(pm, new TeaPurchase()),
                new DrinkChoice(pm, new CoffeePurchase()),
                new DrinkChoice(pm, new BeerPurchase()),
                new ExitChoice(pm)));

        return mm;
    }

    public void run() {
        mainMenu.onBeingChoosen();
    }
}
