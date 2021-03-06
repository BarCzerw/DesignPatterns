package designpatterns.structural.bridge.example.drinks;

import designpatterns.structural.bridge.example.enums.Additions;

import java.util.List;

public class Coffee implements Drink {

    private final List<Additions> additionsList;

    public Coffee(List<Additions> additionsList) {
        this.additionsList = additionsList;
    }

    @Override
    public int getVolume() {
        return 200;
    }

    @Override
    public double getPrice() {
        return 9.60 + additionsPrice();
    }

    @Override
    public List<Additions> getAdditions() {
        return additionsList;
    }

    private double additionsPrice() {
        return additionsList.stream().mapToDouble(Additions::getPrice).sum();
    }

    @Override
    public boolean isAlcoholic() {
        return false;
    }
}
