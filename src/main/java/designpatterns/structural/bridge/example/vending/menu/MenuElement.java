package designpatterns.structural.bridge.example.vending.menu;

import designpatterns.structural.bridge.example.vending.NotEnoughMoneyException;
import designpatterns.structural.bridge.example.vending.VendingMachine;

public interface MenuElement {
    void onBeingChoosen();
    MenuElement getCaller();
    VendingMachine getMachine();
}
