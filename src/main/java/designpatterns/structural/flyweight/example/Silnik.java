package designpatterns.structural.flyweight.example;

public class Silnik {
    private TypSilnika typSilnika;
    private String pojemnosc;

    public Silnik(TypSilnika typSilnika, String pojemnosc) {
        this.typSilnika = typSilnika;
        this.pojemnosc = pojemnosc;
    }

    public TypSilnika getTypSilnika() {
        return typSilnika;
    }

    public String getPojemnosc() {
        return pojemnosc;
    }

    @Override
    public String toString() {
        return "Silnik{" +
                "typSilnika=" + typSilnika +
                ", pojemnosc='" + pojemnosc + '\'' +
                '}';
    }
}
