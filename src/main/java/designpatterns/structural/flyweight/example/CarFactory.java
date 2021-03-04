package designpatterns.structural.flyweight.example;

import java.util.Map;

public class CarFactory {

    private static final Map<String, Silnik> grupaSilników = Map.of(
            "Nowy", new Silnik(TypSilnika.DIESEL, "2.0"),
            "Stary", new Silnik(TypSilnika.DIESEL, "5.0"),
            "Jakis", new Silnik(TypSilnika.BENZYNA, "1.8")
    );

    public static Car stwórzSamochód(String marka, String kolor, String rodzajSilnika) {
        switch (rodzajSilnika) {
            case "Nowy":
            case "Stary":
            case "Jakis":
                return new Car(marka, grupaSilników.get(rodzajSilnika), kolor);
            default:
                throw new RuntimeException();
        }
    }
}
