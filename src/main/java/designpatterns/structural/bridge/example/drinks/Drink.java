package designpatterns.structural.bridge.example.drinks;

import designpatterns.structural.bridge.example.enums.Additions;

import java.util.List;

public interface Drink {

    int getVolume();
    double getPrice();
    List<Additions> getAdditions();
    boolean isAlcoholic();

}
