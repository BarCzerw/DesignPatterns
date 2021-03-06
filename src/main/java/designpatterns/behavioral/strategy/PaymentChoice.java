package designpatterns.behavioral.strategy;

public class PaymentChoice {

    public static Payment getPayment(PaymentType paymentType) {
        switch (paymentType) {
            case PAYPAL -> {
                return new PayPalPayment();
            }
            case BANK -> {
                return new BankPayment();
            }
            case BITCOIN -> {
                return new BitCoinPayment();
            }
            default -> throw new IllegalStateException("Unexpected value: " + paymentType);
        }
    }
}
