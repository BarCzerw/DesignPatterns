package designpatterns.behavioral.template.goblins;

public abstract class Goblin {

    public abstract int age();

    public abstract int vitality();

    public int attackDamage() {
        return age() * 300 + vitality() * 500;
    }

    public void printAttackDamage() {
        System.out.println("Attack damage - " + attackDamage());
    }

}
