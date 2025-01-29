package dev.psusanto.CardGameJava.util;


import dev.psusanto.CardGameJava.exceptions.InvalidDeckException;
import dev.psusanto.CardGameJava.game.*;

import java.util.Collections;
import java.util.ArrayList;

//functions that are shared between different types of elements and future types of objects
public class HelperFunctions {
    private static HelperFunctions instance;

    private HelperFunctions() {}

    public static HelperFunctions getInstance() {
        if (instance == null) {
            instance = new HelperFunctions();
        }
        return instance;
    }
    
    public void shuffleDeck(ArrayList<Card> deck) {
        Collections.shuffle(deck);
    }

    public Card drawCard(ArrayList<Card> deck) throws InvalidDeckException {
        //take last element in arraylist
        if (!deck.isEmpty()) {
            return deck.remove(deck.size() - 1);
        }
        throw new InvalidDeckException("Deck is empty, no cards to draw");
    }

    public void addCard(ArrayList<Card> hand, Card card) {
        hand.add(card);
    }

    public void addCardInIndex(ArrayList<Card> hand, Card card, int index) {
        hand.add(index, card);
    }

    public void removeCard(ArrayList<Card> hand, Card card) {
        hand.remove(card);
    }

    public void removeCardInIndex(ArrayList<Card> hand, Card card, int index) {
        hand.remove(index);
    }

    public void dealCards(ArrayList<Player> players, ArrayList<Card> deck, int cardsPerPlayer) throws InvalidDeckException {
        for (int i = 0; i < cardsPerPlayer; i++) {
            for (Player player : players) {
                if (!deck.isEmpty()) {
                    addCard(player.getHand().getHand(), drawCard(deck));
                }
            }
        }
    }

    public void addPlayer(ArrayList<Player> players, String name) {
        players.add(new Player(name));
    }

    public double getMaximum(ArrayList<Card> hand) {   // getter-Methode für den höchsten Wert der Karte bei ungleichen Farben
        double maximum = 0.0;

        for (int i = 0; i < hand.size(); i++) {
            if (hand.get(i).getPoints() > maximum) {

                maximum = hand.get(i).getPoints();
            }
        }

        return maximum;
    }

}
