package designpatterns.creational.example.enums;

public enum RestaurantType {

    MC_DONALD,
    KFC,
    SUBWAY;

    public static RestaurantType getRestaurantType(int index) {
        return RestaurantType.values()[index-1];
    }
}
