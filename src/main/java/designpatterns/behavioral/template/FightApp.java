package designpatterns.behavioral.template;

import designpatterns.behavioral.template.goblins.Goblin;
import designpatterns.behavioral.template.goblins.MountainGoblin;
import designpatterns.behavioral.template.goblins.WeakGoblin;
import designpatterns.behavioral.template.heroes.Hero;
import designpatterns.behavioral.template.heroes.MegaHero;
import designpatterns.behavioral.template.heroes.WeakHero;

public class FightApp {

    public static void main(String[] args) {
        fight(new WeakHero(), new WeakGoblin());
        fight(new MegaHero(), new MountainGoblin());
    }

    public static void fight(Hero hero, Goblin goblin) {
        if (hero.attackDamage() > goblin.attackDamage()) {
            System.out.println(
                    goblin.getClass().getSimpleName() + "(" + goblin.attackDamage() + ")"
                            + " was killed by "
                            + hero.getClass().getSimpleName() + "(" + hero.attackDamage() + ")");
        } else {
            System.out.println(
                    hero.getClass().getSimpleName() + "(" + hero.attackDamage() + ")"
                            + " was killed by "
                            + goblin.getClass().getSimpleName() + "(" + goblin.attackDamage() + ")");
        }
    }
}
