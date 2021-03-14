package designpatterns.behavioral.memento.example;

import java.util.ArrayDeque;
import java.util.Deque;

public class GameStateManager {

    private Deque<GameStateSnapshot> gameStateSnapshots = new ArrayDeque<>();


    public void saveGame(GameState gameState) {
        gameStateSnapshots.push(new GameStateSnapshot(gameState));
    }

    public GameStateSnapshot restorePreviousCheckpoint() {
        return gameStateSnapshots.pop();
    }
}
