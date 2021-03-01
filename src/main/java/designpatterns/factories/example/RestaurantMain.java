package designpatterns.factories.example;

public class RestaurantMain {

    public static void main(String[] args) {
        Restaurant kfc = Factory.getRestaurant(RestaurantType.KFC);
        Restaurant mcd = Factory.getRestaurant(RestaurantType.MC_DONALD);
    }
}
