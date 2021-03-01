package designpatterns.factories.example;

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
                return null;
            }
        }
    }

}
