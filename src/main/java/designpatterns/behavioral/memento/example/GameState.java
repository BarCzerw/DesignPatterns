package designpatterns.behavioral.memento.example;

import java.util.List;

public class GameState {

    private Integer health;
    private Integer mana;
    private List<String> items;

    public GameState(Integer health, Integer mana, List<String> items) {
        this.health = health;
        this.mana = mana;
        this.items = items;
    }

    public Integer getHealth() {
        return health;
    }

    public Integer getMana() {
        return mana;
    }

    public List<String> getItems() {
        return items;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public void addItem(String item) {
        items.add(item);
    }

    public void restoreFromSnapshot(GameStateSnapshot snapshot) {
        health = snapshot.getHealth();
        mana = snapshot.getMana();
        items = List.copyOf(snapshot.getItems());
    }

    @Override
    public String toString() {
        return "GameState{" +
                "health=" + health +
                ", mana=" + mana +
                ", items=" + items +
                '}';
    }
}
