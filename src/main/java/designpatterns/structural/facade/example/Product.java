package designpatterns.structural.facade.example;

public enum Product {
    BOX(34.60),
    CONTAINER(670.42),
    BIN(13.11);

    private double price;

    Product(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
