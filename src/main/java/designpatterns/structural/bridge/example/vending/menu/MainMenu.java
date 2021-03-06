package designpatterns.structural.bridge.example.vending.menu;

import designpatterns.structural.bridge.example.vending.VendingMachine;

public class MainMenu extends Menu {

    private VendingMachine vm;

    public MainMenu(VendingMachine vm) {
        this.vm = vm;
    }

    @Override
    public void onBeingChoosen() {
        System.out.println("Current balance - " + vm.getBalance());
        printSubElements();
        getInput().onBeingChoosen();
    }

    @Override
    public MenuElement getCaller() {
        return this;
    }

    @Override
    public VendingMachine getMachine() {
        return vm;
    }

    @Override
    public String toString() {
        return "Main menu:";
    }
}
