package designpatterns.structural.bridge.example.vending.menu;

import designpatterns.structural.bridge.example.vending.NotEnoughMoneyException;
import designpatterns.structural.bridge.example.vending.VendingMachine;
import designpatterns.structural.bridge.example.vending.VendingState;

import java.util.List;

public class CoinInsertMenu extends Menu {

    private VendingMachine vm;
    private MenuElement caller;

    public CoinInsertMenu(MenuElement caller) {
        this.caller = caller;
        this.vm = getMachine();
    }

    @Override
    public void onBeingChoosen() {
        vm.setState(VendingState.COIN_INSERTING);
        System.out.println("Insert coin:");
        printSubElements();
        getInput().onBeingChoosen();
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
        return "Coin inserting";
    }
}
