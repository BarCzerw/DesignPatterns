package designpatterns.structural.facade.example.interfaces;

import designpatterns.structural.facade.example.Product;
import designpatterns.structural.facade.example.implementations.Storage;

public interface AvailabilityService {
    boolean isAvailable(Storage storage, Product product, int quantity);
}
