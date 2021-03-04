package designpatterns.structural.facade.example.implementations;

import designpatterns.structural.facade.example.Product;
import designpatterns.structural.facade.example.interfaces.PaymentService;

public class Payment implements PaymentService {
    @Override
    public boolean payForProduct(Product product, int quantity) {
        System.out.println(product.getPrice()*quantity + " paid for " + quantity + " of " + product);
        return true;
    }
}
