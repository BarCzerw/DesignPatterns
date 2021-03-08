package designpatterns.structural.bridge.example.vending.menu;

import designpatterns.structural.bridge.example.vending.VendingMachine;
import designpatterns.structural.bridge.example.vending.VendingState;

public class PurchaseMenu extends Menu {

    private VendingMachine vm;
    private MenuElement caller;

    public PurchaseMenu(MenuElement caller) {
        this.caller = caller;
        this.vm = getMachine();
    }

    @Override
    public void onBeingChoosen() {
        vm.setState(VendingState.PURCHASING_DRINK);
        System.out.println("Choose drink to purchase:");
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
        return "Drink purchase";
    }
}
