package dev.psusanto.CardGameJava.engine;

public class GameStateManager {
    private GameState currentState;
    private static GameStateManager instance;

    private GameStateManager() {
        this.currentState = GameState.MENU;
    }

    public static GameStateManager getInstance() {
        if (instance == null) {
            instance = new GameStateManager();
        }
        return instance;
    }

    public GameState getCurrentState() {
        return currentState;
    }

    public void changeState(GameState newState) {
        System.out.println("Transitioning from " + currentState + " to " + newState);
        this.currentState = newState;
    }


}
