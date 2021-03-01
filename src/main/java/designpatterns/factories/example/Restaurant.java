package designpatterns.factories.example;

import designpatterns.builders.Burger;

import java.util.ArrayList;
import java.util.List;

public abstract class Restaurant {

    List<Burger> burgerMenu;

    public Restaurant() {
        this.burgerMenu = new ArrayList<>();
    }

    public void addBurgerToMenu(Burger burger) {
        burgerMenu.add(burger);
    }

    public List<Burger> getBurgerMenu() {
        return burgerMenu;
    }
}
