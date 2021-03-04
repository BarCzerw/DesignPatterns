package designpatterns.structural.facade.example.implementations;

import designpatterns.structural.facade.example.Product;
import designpatterns.structural.facade.example.interfaces.AvailabilityService;

public class Availability implements AvailabilityService {
    @Override
    public boolean isAvailable(Storage storage, Product product, int quantity) {
        if (storage.getQuantityOf(product) >= quantity) {
            System.out.println(product + " is available");
            return true;
        } else {
            System.out.println(product + " not available");
            return false;
        }
    }
}
