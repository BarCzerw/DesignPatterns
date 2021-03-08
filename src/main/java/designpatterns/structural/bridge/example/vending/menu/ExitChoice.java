package designpatterns.structural.bridge.example.vending.menu;

import designpatterns.structural.bridge.example.vending.VendingMachine;

public class ExitChoice implements MenuElement {

    private MenuElement caller;

    public ExitChoice(MenuElement caller) {
        this.caller = caller;
    }

    @Override
    public void onBeingChoosen() {
        getCaller().getCaller().onBeingChoosen();
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
        return "Exit";
    }
}
