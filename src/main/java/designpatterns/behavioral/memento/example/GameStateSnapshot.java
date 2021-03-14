package designpatterns.behavioral.memento.example;

import java.util.List;

public class GameStateSnapshot {

    private Integer health;
    private Integer mana;
    private List<String> items;

    public GameStateSnapshot(GameState gameState) {
        this.health = gameState.getHealth();
        this.mana = gameState.getMana();
        this.items = List.copyOf(gameState.getItems());
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
}
