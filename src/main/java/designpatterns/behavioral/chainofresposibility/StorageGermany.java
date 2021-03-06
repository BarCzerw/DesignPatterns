package designpatterns.behavioral.chainofresposibility;

public class StorageGermany implements StorageHandler {
    @Override
    public boolean isAvailable(Product product) {
        switch (product) {
            case TABLET -> {
                printAvailability(product, true);
                return true;
            }
            default -> {
                printAvailability(product, false);
                return next(product);
            }
        }
    }

    @Override
    public boolean next(Product product) {
        return new StorageSpain().isAvailable(product);
    }

    public void printAvailability(Product product, boolean available) {
        System.out.println(product + " is " + (available ? "" : " not ") + " available in Germany");
    }

}
