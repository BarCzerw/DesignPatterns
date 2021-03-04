package designpatterns.structural.bridge.example.enums;

public enum Additions {
    SUGAR(0.5),
    BROWN_SUGAR(0.8),
    MILK(1.2),
    JUICE(1.0),
    HONEY(1.6);

    private double price;

    Additions(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
