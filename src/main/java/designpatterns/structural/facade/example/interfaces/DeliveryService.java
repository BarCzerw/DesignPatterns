package designpatterns.structural.facade.example.interfaces;

import designpatterns.structural.facade.example.Product;
import designpatterns.structural.facade.example.implementations.Storage;

public interface DeliveryService {
    boolean deliver(Storage storage, Product product, int quantity, String address);
}
