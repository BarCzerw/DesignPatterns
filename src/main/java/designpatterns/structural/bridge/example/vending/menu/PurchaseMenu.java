package designpatterns.structural.bridge.example.vending.menu;

import designpatterns.structural.bridge.example.vending.MenuElement;
import designpatterns.structural.bridge.example.vending.VendingMachine;

import java.util.List;

public class PurchaseMenu extends Menu{

    private VendingMachine vm;

    public PurchaseMenu(VendingMachine vm, List<MenuElement> menuElements) {
        this.vm = vm;
        this.subElements = menuElements;
    }

    @Override
    public void onBeingChoosen() {
        System.out.println("Choose drink to purchase:");
        printSubElements();
        getInput();
    }
}
