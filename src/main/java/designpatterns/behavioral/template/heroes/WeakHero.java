package designpatterns.behavioral.template.heroes;

public class WeakHero extends Hero{
    @Override
    public int strength() {
        return 5;
    }

    @Override
    public int power() {
        return 3;
    }
}
