package designpatterns.behavioral.template.heroes;

public abstract class Hero {

    public abstract int strength();

    public abstract int power();

    public int attackDamage() {
        return strength() * 3 + power() * 10;
    }

    public void printAttackDamage() {
        System.out.println("Attack damage - " + attackDamage());
    }

}
