package designpatterns.structural.facade.example.interfaces;

import designpatterns.structural.facade.example.Product;

public interface PaymentService {
    boolean payForProduct(Product product, int quantity);
}
