package designpatterns.factories.example.factory;

import designpatterns.builders.example.Burger;
import designpatterns.factories.example.enums.BurgerType;
import designpatterns.factories.example.restaurants.Order;

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
