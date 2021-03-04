package designpatterns.structural.facade.example;

import designpatterns.structural.facade.example.implementations.Availability;
import designpatterns.structural.facade.example.implementations.Delivery;
import designpatterns.structural.facade.example.implementations.Payment;
import designpatterns.structural.facade.example.implementations.Storage;

import java.util.HashMap;
import java.util.Map;

public class ShopMain {

    public static void main(String[] args) {

        OrderFacade order = new OrderFacade(
                new Availability(),
                new Payment(),
                new Delivery(),
                new Storage(new HashMap<>(Map.of(Product.BOX,100,Product.CONTAINER,5,Product.BIN,300))));

        order.placeOrder(Product.BOX,19);
        order.placeOrder(Product.BOX,70);
        order.placeOrder(Product.BOX,31);
        order.placeOrder(Product.CONTAINER,3);
        order.placeOrder(Product.CONTAINER,5);
        order.placeOrder(Product.BIN,300);
        order.placeOrder(Product.BIN,1);

    }

}
