package designpatterns.creational.example.factory;

import designpatterns.creational.builders.example.Burger;
import designpatterns.creational.example.enums.BurgerType;
import designpatterns.creational.example.restaurants.Order;

import java.util.ArrayList;
import java.util.List;

public abstract class Restaurant {

    public abstract Burger order(BurgerType burgerType);

    public Order placeOrder() {
        List<Burger> burgerOrders = new ArrayList<>();
        Order order = new Order().placeOrder(this);
        System.out.println(order);
        return order;
    }

}
