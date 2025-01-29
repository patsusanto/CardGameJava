package dev.psusanto.CardGameJava.game;

public interface Card {

    public String getSuit();

    public int getRank(); 

    public double getPoints(); 

    public void printCard();
}
