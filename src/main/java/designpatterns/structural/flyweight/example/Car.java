package designpatterns.structural.flyweight.example;

public class Car {
    private String marka;
    private Silnik silnik;
    private String kolor;
    public Car(String marka, Silnik silnik, String kolor) {
        this.marka = marka;
        this.silnik = silnik;
        this.kolor = kolor;
    }
    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", silnik=" + silnik +
                ", kolor='" + kolor + '\'' +
                '}';
    }
}
