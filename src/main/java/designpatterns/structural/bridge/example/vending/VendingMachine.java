package designpatterns.structural.bridge.example.vending;

import designpatterns.structural.bridge.example.drinks.Drink;
import designpatterns.structural.bridge.example.vending.menu.MainMenu;

public class VendingMachine {

    private double coinsInMachine;
    private MainMenu mainMenu;
    private VendingState state;

    public VendingMachine() {
        this.coinsInMachine = 0;
        this.state = VendingState.MENU;
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
    }

    public Drink purchase() {
        return null;
    }

}
