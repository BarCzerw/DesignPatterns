package designpatterns.behavioral.chainofresposibility;

public enum Product {
    NOTEBOOK,
    SMARTPHONE,
    TABLET,
    PS5;

    boolean isAvailable() {
        return new StoragePoland().isAvailable(this);
    }
}
