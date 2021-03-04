package designpatterns.structural.facade.example;

import designpatterns.structural.facade.example.implementations.Storage;
import designpatterns.structural.facade.example.interfaces.AvailabilityService;
import designpatterns.structural.facade.example.interfaces.DeliveryService;
import designpatterns.structural.facade.example.interfaces.PaymentService;

public class OrderFacade {

    private AvailabilityService availabilityService;
    private PaymentService paymentService;
    private DeliveryService deliveryService;
    private Storage storage;

    public OrderFacade(AvailabilityService availabilityService, PaymentService paymentService, DeliveryService deliveryService, Storage storage) {
        this.availabilityService = availabilityService;
        this.paymentService = paymentService;
        this.deliveryService = deliveryService;
        this.storage = storage;
    }

    public void placeOrder(Product product, int quantity) {
        if (availabilityService.isAvailable(storage, product, quantity)) {
            paymentService.payForProduct(product,quantity);
            deliveryService.deliver(storage,product,quantity,"home");
        }
        System.out.println("---------------------");
    }
}
