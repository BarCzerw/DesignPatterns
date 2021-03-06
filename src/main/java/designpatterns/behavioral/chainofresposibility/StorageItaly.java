package designpatterns.behavioral.chainofresposibility;

public class StorageItaly implements StorageHandler {
    @Override
    public boolean isAvailable(Product product) {
        switch (product) {
            case PS5 -> {
                printAvailability(product, true);
                return true;
            }
            default -> {
                printAvailability(product, false);
                return false;
            }
        }
    }

    @Override
    public boolean next(Product product) {
        return false;
    }

    public void printAvailability(Product product, boolean available) {
        System.out.println(product + " is " + (available ? "" : " not ") + " available in Italy");
    }
}
