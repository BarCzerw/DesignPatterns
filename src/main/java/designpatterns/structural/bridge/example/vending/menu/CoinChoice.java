package designpatterns.structural.bridge.example.vending.menu;

import designpatterns.structural.bridge.example.vending.NotEnoughMoneyException;
import designpatterns.structural.bridge.example.vending.VendingMachine;

public class CoinChoice implements MenuElement {

    private VendingMachine vm;
    private double coinValue;
    private MenuElement caller;

    public CoinChoice(MenuElement caller, double coinValue) {
        this.caller = caller;
        this.vm = getMachine();
        this.coinValue = coinValue;
    }

    @Override
    public void onBeingChoosen() {
        vm.insertCoin(coinValue);
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
        return coinValue + " gr";
    }
}
