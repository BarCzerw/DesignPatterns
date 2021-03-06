package designpatterns.behavioral.template.heroes;

public class SuperHero extends Hero{
    @Override
    public int strength() {
        return 50;
    }

    @Override
    public int power() {
        return 150;
    }
}
