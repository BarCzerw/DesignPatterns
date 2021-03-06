package designpatterns.behavioral.command;

import designpatterns.behavioral.chainofresposibility.Product;

public interface Button {
    void add(Product product);
    void remove(Product product);
}
