package designpatterns.behavioral.strategy;

public class PaymentApp {

    public static void main(String[] args) {

        Payment payment = PaymentChoice.getPayment(PaymentType.PAYPAL);
        payment.pay(46.43);

        payment = PaymentChoice.getPayment(PaymentType.BANK);
        payment.pay(689.43);

        payment = PaymentChoice.getPayment(PaymentType.BITCOIN);
        payment.pay(835.22);

    }

}
