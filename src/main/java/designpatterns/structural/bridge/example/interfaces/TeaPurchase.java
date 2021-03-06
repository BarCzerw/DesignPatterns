package designpatterns.structural.bridge.example.interfaces;

import designpatterns.structural.bridge.example.drinks.Drink;
import designpatterns.structural.bridge.example.drinks.Tea;
import designpatterns.structural.bridge.example.enums.Additions;

import java.util.List;

public class TeaPurchase implements DrinkPurchase {

    @Override
    public Drink purchase(List<Additions> additionsList) {
        return new Tea(additionsList);
    }

    @Override
    public double getPrice() {
        return 2.0;
    }

    @Override
    public String toString() {
        return "Tea - " + getPrice() + " zł";
    }
}
