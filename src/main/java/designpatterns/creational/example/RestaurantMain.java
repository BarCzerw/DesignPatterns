package designpatterns.creational.example;

import designpatterns.creational.example.factory.Restaurant;
import designpatterns.creational.example.factory.RestaurantFactory;

public class RestaurantMain {

    public static void main(String[] args) {
        Restaurant myRestaurant = RestaurantFactory.pickRestaurant();
        myRestaurant.placeOrder();
    }
}
