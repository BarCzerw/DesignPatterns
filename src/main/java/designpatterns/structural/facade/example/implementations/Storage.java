package designpatterns.structural.facade.example.implementations;

import designpatterns.structural.facade.example.Product;

import java.util.Map;

public class Storage {

    private Map<Product, Integer> quantities;

    public Storage(Map<Product, Integer> quantities) {
        this.quantities = quantities;
    }

    public int getQuantityOf(Product product) {
        return quantities.get(product);
    }

    public void withdraw(Product product, int quantity) {
        int currentQuantity = getQuantityOf(product);
        if (currentQuantity >= quantity) {
            quantities.put(product, currentQuantity - quantity);
        }
    }
}
