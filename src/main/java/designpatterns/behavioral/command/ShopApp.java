package designpatterns.behavioral.command;

import designpatterns.behavioral.chainofresposibility.Product;

public class ShopApp {

    public static void main(String[] args) {

        Checkout checkout = new Checkout();

        checkout.add(Product.NOTEBOOK);
        checkout.add(Product.PS5);
        checkout.add(Product.TABLET);

        System.out.println(checkout.getProducts());

        checkout.remove(Product.NOTEBOOK);

        System.out.println(checkout.getProducts());
    }
}
