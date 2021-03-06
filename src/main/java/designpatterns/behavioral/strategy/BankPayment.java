package designpatterns.behavioral.strategy;

public class BankPayment implements Payment{
    @Override
    public void pay(double price) {
        System.out.println("Paid " + price + " in bank");
    }
}
