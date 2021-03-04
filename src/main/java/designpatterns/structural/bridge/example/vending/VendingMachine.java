package designpatterns.structural.bridge.example.vending;

import designpatterns.structural.bridge.example.drinks.Drink;
import designpatterns.structural.bridge.example.vending.menu.MainMenu;
import designpatterns.structural.bridge.example.vending.menu.PurchaseMenu;

public class VendingMachine {

    private double coinsInMachine;
    //private MainMenu mainMenu;

    public VendingMachine() {
        this.coinsInMachine = 0;
        //mainMenu = new MainMenu(this,new PurchaseMenu(this,),new InsertCoinMenu(),new ReleaseChoice());
    }

    public double getBalance() {
        return coinsInMachine;
    }

    private void insertCoin(double value) {
        coinsInMachine += value;
        System.out.println("Inserted " + value + " gr - current balance - " + coinsInMachine);
    }

    public void releaseCoins() {
        System.out.println("Released " + coinsInMachine);
        coinsInMachine = 0;
    }

    public Drink purchase() {
        return null;
    }

}
