package designpatterns.structural.bridge.example.vending.menu;

import designpatterns.structural.bridge.example.vending.MenuElement;
import designpatterns.structural.bridge.example.vending.VendingMachine;

import java.util.List;

public class MainMenu extends Menu {

    private VendingMachine vm;

    public MainMenu(VendingMachine vm, List<MenuElement> menuElements) {
        this.vm = vm;
        this.subElements = menuElements;
    }

    @Override
    public void onBeingChoosen() {
        System.out.println("Current balance - " + vm.getBalance());
        printSubElements();
        getInput().onBeingChoosen();
    }

}
