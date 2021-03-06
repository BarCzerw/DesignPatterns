package designpatterns.structural.bridge.example.vending.menu;

import designpatterns.structural.bridge.example.vending.VendingMachine;

public class PurchaseMenu extends Menu {

    private VendingMachine vm;

    public PurchaseMenu(VendingMachine vm) {
        this.vm = vm;
    }

    @Override
    public void onBeingChoosen() {
        System.out.println("Choose drink to purchase:");
        printSubElements();
        getInput();
    }
}
