package designpatterns.creational.example.enums;

public enum BurgerType {
    CHEESEBURGER(),
    HAMBURGER(),
    BBQ_BURGER();

    public static BurgerType getBurgerType(int index) {
        return BurgerType.values()[index-1];
    }
}
