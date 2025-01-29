package dev.psusanto.CardGameJava.game;

public class Player {
    private String name;
    private Hand hand;
    
    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Hand getHand() {
        return hand;
    }
}
