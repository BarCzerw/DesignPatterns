package designpatterns.factories.example;

import designpatterns.factories.example.factory.Restaurant;
import designpatterns.factories.example.factory.RestaurantFactory;

public class RestaurantMain {

    public static void main(String[] args) {
        Restaurant myRestaurant = RestaurantFactory.pickRestaurant();
        myRestaurant.placeOrder();
    }
}
