package designpatterns.behavioral.command;

import designpatterns.behavioral.chainofresposibility.Product;

import java.util.HashSet;
import java.util.Set;

public class Checkout implements Button{

    private Set<Product> products;

    public Checkout() {
        this.products = new HashSet<>();
    }

    public Set<Product> getProducts() {
        return products;
    }

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public void remove(Product product) {
        products.remove(product);
    }
}
