package designpatterns.structural.bridge.example.vending.menu;

import designpatterns.structural.bridge.example.vending.MenuElement;
import designpatterns.structural.bridge.example.vending.VendingMachine;

public class CoinChoice implements MenuElement {

    private VendingMachine vm;
    private double coinValue;

    public CoinChoice(double coinValue) {
        this.coinValue = coinValue;
    }

    @Override
    public void onBeingChoosen() {
        vm.insertCoin(coinValue);
    }
}
