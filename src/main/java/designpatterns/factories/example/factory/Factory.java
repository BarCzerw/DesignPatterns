package designpatterns.factories.example.factory;

import designpatterns.factories.example.restaurants.Kfc;
import designpatterns.factories.example.restaurants.McDonald;
import designpatterns.factories.example.enums.RestaurantType;

public class Factory {

    public static Restaurant getRestaurant(RestaurantType restaurantType) {
        switch (restaurantType) {

            case MC_DONALD -> {
                return new McDonald();
            }
            case KFC -> {
                return new Kfc();
            }
            default -> {
                System.out.println("No such restaurant!");
                throw new RuntimeException();
            }
        }
    }

}
