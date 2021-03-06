package designpatterns.behavioral.chainofresposibility;

import java.util.LinkedList;
import java.util.List;

public class StorageApp {

    public static void main(String[] args) {

        List<Product> products = createProductsList();
        checkAvailability(products);

    }

    private static LinkedList<Product> createProductsList() {
        return new LinkedList<>(List.of(
                Product.TABLET,
                Product.SMARTPHONE,
                Product.NOTEBOOK,
                Product.PS5
        ));
    }

    private static void checkAvailability(List<Product> products) {
        System.out.println("--------------------------------");
        for (Product product : products) {
            product.isAvailable();
            System.out.println("--------------------------------");
        }
    }
}
