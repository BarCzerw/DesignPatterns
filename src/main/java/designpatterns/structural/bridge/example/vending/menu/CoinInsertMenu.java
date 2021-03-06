package designpatterns.structural.bridge.example.vending.menu;

import designpatterns.structural.bridge.example.vending.MenuElement;
import designpatterns.structural.bridge.example.vending.VendingMachine;
import designpatterns.structural.bridge.example.vending.VendingState;

import java.util.LinkedList;
import java.util.List;

public class CoinInsertMenu extends Menu {

    private VendingMachine vm;

    public CoinInsertMenu(VendingMachine vm, List<MenuElement> menuList) {
        this.vm = vm;
        this.subElements = new LinkedList<>(
                List.of(
                        new CoinChoice(0.05),
                        new CoinChoice(0.10),
                        new CoinChoice(0.2),
                        new CoinChoice(0.5)));
        vm.setState(VendingState.COIN_INSERTING);
    }

    @Override
    public void onBeingChoosen() {
        System.out.println("Insert coin");
        printSubElements();
        getInput();
    }
}
