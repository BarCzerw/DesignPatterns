package designpatterns.behavioral.chainofresposibility;

public class StorageSpain implements StorageHandler {

    @Override
    public boolean isAvailable(Product product) {

        switch (product) {

            case NOTEBOOK, SMARTPHONE, TABLET -> {
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
        return new StorageItaly().isAvailable(product);
    }


    public void printAvailability(Product product, boolean available) {
        System.out.println(product + " is " + (available ? "" : " not ") + " available in Spain");
    }
}
