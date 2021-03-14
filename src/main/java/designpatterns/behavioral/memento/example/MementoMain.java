package designpatterns.behavioral.memento.example;

import java.util.ArrayList;

public class MementoMain {

    public static void main(String[] args) {

        final GameState gameState = new GameState(100, 80, new ArrayList<>());

        final GameStateManager gameStateManager = new GameStateManager();
        gameStateManager.saveGame(gameState);
        System.out.println(gameState);

        gameState.addItem("Basic sword");
        gameState.takeDamage(10);
        System.out.println(gameState);

        gameStateManager.saveGame(gameState);

        gameState.takeDamage(50);
        gameState.addItem("Shield");
        System.out.println(gameState);

        GameStateSnapshot gameStateSnapshot = gameStateManager.restorePreviousCheckpoint();
        gameState.restoreFromSnapshot(gameStateSnapshot);
        System.out.println(gameState);
    }

}
