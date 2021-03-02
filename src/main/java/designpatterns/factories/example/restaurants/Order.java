package designpatterns.factories.example.restaurants;

import designpatterns.builders.example.Burger;
import designpatterns.factories.example.enums.BurgerType;
import designpatterns.factories.example.factory.Restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {

    private final List<Burger> burgerList;

    public Order() {
        burgerList = new ArrayList<>();
    }

    public Order placeOrder(Restaurant restaurant) {
        System.out.println("Add to order:\n1. Cheeseburger\n2. Hamburger\n3. BBQ Burger");
        String input = getOrderIndex();

        while (isValidInput(input)) {
            burgerList.add(restaurant.order(BurgerType.getBurgerType(Integer.parseInt(input))));
            input = getOrderIndex();
        }
        return this;
    }

    public double getOrderPrice() {
        double sum = 0;
        for (Burger burger : burgerList) {
            sum += burger.getPrice();
        }
        return sum;
    }

    private String getOrderIndex() {
        System.out.print("Order:");
        return new Scanner(System.in).nextLine();
    }

    private boolean isValidInput(String input) {
        return input.equals("1") || input.equals("2") || input.equals("3");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Your order:\n");
        for (Burger burger : burgerList) {
            sb.append(burger).append("\n");
        }
        sb.append("-----------\nTotal: ").append(getOrderPrice());
        return sb.toString();
    }
}
