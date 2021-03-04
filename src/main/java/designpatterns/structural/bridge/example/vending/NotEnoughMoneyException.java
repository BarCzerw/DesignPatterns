package designpatterns.structural.bridge.example.vending;

import designpatterns.structural.bridge.example.drinks.Drink;

public class NotEnoughMoneyException extends Exception{
    public NotEnoughMoneyException(VendingMachine vm, Drink purchase) {
        System.out.println("Not enough money to buy " + purchase);
        System.out.println("Money in machine - " + vm.getBalance());
    }
}
