package designpatterns.creational.example.factory;

import designpatterns.creational.example.enums.RestaurantType;
import designpatterns.creational.example.restaurants.Kfc;
import designpatterns.creational.example.restaurants.McDonald;
import designpatterns.creational.example.restaurants.Subway;

import java.util.Scanner;

public class RestaurantFactory {

    public static Restaurant getRestaurant(RestaurantType restaurantType) {
        switch (restaurantType) {

            case MC_DONALD -> {
                return new McDonald();
            }
            case KFC -> {
                return new Kfc();
            }

            case SUBWAY -> {
                return new Subway();
            }
            default -> {
                System.out.println("No such restaurant!");
                throw new RuntimeException();
            }
        }
    }

    public static Restaurant pickRestaurant() {

        System.out.println("Pick restaurant:\n1. McDonald\n2. KFC\n3. SUBWAY");

        String input;

        do {
            input = getRestaurantIndex();
        } while (!isValidInput(input));

        return getRestaurant(RestaurantType.getRestaurantType(Integer.parseInt(input)));
    }

    private static String getRestaurantIndex() {
        System.out.print("Pick: ");
        return new Scanner(System.in).nextLine();
    }

    private static boolean isValidInput(String input) {
        return input.equals("1") || input.equals("2") || input.equals("3");
    }

}
