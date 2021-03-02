package designpatterns.factories.example;

import designpatterns.factories.example.enums.RestaurantType;
import designpatterns.factories.example.factory.Factory;
import designpatterns.factories.example.factory.Restaurant;
import designpatterns.factories.example.restaurants.Order;

public class RestaurantMain {

    public static void main(String[] args) {
        Restaurant kfc = Factory.getRestaurant(RestaurantType.KFC);
        Restaurant mcd = Factory.getRestaurant(RestaurantType.MC_DONALD);

        Order kfcOrder = kfc.placeOrder();
        Order mcdOrder = mcd.placeOrder();


    }
}
