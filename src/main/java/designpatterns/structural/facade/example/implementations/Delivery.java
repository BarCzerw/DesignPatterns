package designpatterns.structural.facade.example.implementations;

import designpatterns.structural.facade.example.Product;
import designpatterns.structural.facade.example.interfaces.DeliveryService;

public class Delivery implements DeliveryService {
    @Override
    public boolean deliver(Storage storage, Product product, int quantity, String address) {
        if (address != null || !address.isEmpty()) {
            System.out.println("Sending to " + address);
            storage.withdraw(product, quantity);
            return true;
        } else {
            System.out.println("Wrong address");
            return false;
        }
    }
}
