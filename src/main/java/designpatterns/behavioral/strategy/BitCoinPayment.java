package designpatterns.behavioral.strategy;

public class BitCoinPayment implements Payment{
    @Override
    public void pay(double price) {
        System.out.println("Paid " + price + " from BitCoin wallet");
    }
}
