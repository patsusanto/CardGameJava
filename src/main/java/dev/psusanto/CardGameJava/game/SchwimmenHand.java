package dev.psusanto.CardGameJava.game;

import java.util.ArrayList;

import dev.psusanto.CardGameJava.util.HelperFunctions;

public class SchwimmenHand implements Hand {
    private ArrayList<Card> hand;
    private double score;
    private int maxHandSize = 3;
    private HelperFunctions helper = HelperFunctions.getInstance();

    public SchwimmenHand() {
        hand = new ArrayList<Card>();
        score = 0.0d;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public double getScore() {
        return score;
    }

    public int getMaxHandSize() {
        return maxHandSize;
    }
    
    @Override
    //all elements have to be same to sum up
    public void calculateScore() {   

        double sumScore = 0.0;
        //wenn alle gleich
        if ((hand.get(0).getSuit() == hand.get(1).getSuit()) && (hand.get(1).getSuit() == hand.get(2).getSuit())) {

            sumScore = hand.get(0).getPoints() + hand.get(1).getPoints() + hand.get(2).getPoints();
        //Karte 1 und 2
        } else if (hand.get(0).getSuit() == hand.get(1).getSuit()) {

            sumScore = hand.get(0).getPoints() + hand.get(1).getPoints();
        //Karte 1 und 3
        } else if (hand.get(0).getSuit() == hand.get(2).getSuit()) {

            sumScore = hand.get(0).getPoints() + hand.get(2).getPoints();
        //Karte 2 und 3
        } else if (hand.get(1).getSuit() == hand.get(2).getSuit()) {

            sumScore = hand.get(1).getPoints() + hand.get(2).getPoints();
        //all karte ungleich
        } else if ((hand.get(0).getSuit() != hand.get(1).getSuit()) && (hand.get(1).getSuit() != hand.get(2).getSuit())) {
            sumScore = helper.getMaximum(hand);
        }
        
        this.score = sumScore;
    }
}
