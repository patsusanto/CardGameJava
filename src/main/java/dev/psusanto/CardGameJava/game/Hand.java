package dev.psusanto.CardGameJava.game;

import java.util.ArrayList;

public interface Hand {
    
    public ArrayList<Card> getHand();
    public double getScore();
    public int getMaxHandSize();
    public void calculateScore();
    
}
