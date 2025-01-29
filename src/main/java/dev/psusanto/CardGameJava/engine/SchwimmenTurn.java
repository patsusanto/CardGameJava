package dev.psusanto.CardGameJava.engine;

public class SchwimmenTurn {
    private GameState state = GameState.PLAYING;
    private GameStateManager stateManager = GameStateManager.getInstance();
    
    public SchwimmenTurn() {    
        stateManager.changeState(state);
    }
}
