package designpatterns.structural.bridge.example.drinks;

import designpatterns.structural.bridge.example.enums.Additions;

import java.util.List;

public class Beer implements Drink {

    private final List<Additions> additionsList;

    public Beer(List<Additions> additionsList) {
        this.additionsList = additionsList;
    }

    @Override
    public int getVolume() {
        return 300;
    }

    @Override
    public double getPrice() {
        return 6.0 + additionsPrice();
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
        return true;
    }


}
