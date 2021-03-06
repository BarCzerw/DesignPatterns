package designpatterns.behavioral.chainofresposibility;

public class StoragePoland implements StorageHandler {

    private StorageHandler nextHandler;

    @Override
    public boolean isAvailable(Product product) {
        switch (product) {
            case NOTEBOOK -> {
                printAvailability(product, true);
                return true;
            }
            default -> {
                printAvailability(product, false);
                return next(product);
            }
        }
    }

    public boolean next(Product product) {
        return new StorageGermany().isAvailable(product);
    }

    public void printAvailability(Product product, boolean available) {
        System.out.println(product + " is " + (available ? "" : " not ") + " available in Poland");
    }
}
