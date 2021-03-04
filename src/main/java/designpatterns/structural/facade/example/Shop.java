package designpatterns.structural.facade.example;

public class Shop {

    private int boxQuantity;
    private int containerQuantity;
    private int binQuantity;

    public Shop(int boxQuantity, int containerQuantity, int binQuantity) {
        this.boxQuantity = boxQuantity;
        this.containerQuantity = containerQuantity;
        this.binQuantity = binQuantity;
    }

    public void order(Product product, int quantity) {
    }
}
