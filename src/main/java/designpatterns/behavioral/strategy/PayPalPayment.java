package designpatterns.behavioral.strategy;

public class PayPalPayment implements Payment{
    @Override
    public void pay(double price) {
        System.out.println("Paid " + price + " by PayPal");
    }
}
