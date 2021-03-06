package designpatterns.behavioral.chainofresposibility;

public interface StorageHandler {
    boolean isAvailable(Product product);
    boolean next(Product product);
}
