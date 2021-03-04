package designpatterns.structural.bridge.example.interfaces;

import designpatterns.structural.bridge.example.drinks.Drink;
import designpatterns.structural.bridge.example.enums.Additions;

import java.util.List;

public interface DrinkPurchase {
    Drink purchase(List<Additions> additionsList);
}
