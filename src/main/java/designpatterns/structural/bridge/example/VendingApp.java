package designpatterns.structural.bridge.example;

import designpatterns.structural.bridge.example.vending.VendingMachine;

public class VendingApp {

    public static void main(String[] args) {

        VendingMachine vm = new VendingMachine();
        vm.run();

    }
}
