package dev.psusanto.CardGameJava.game;

import java.util.ArrayList;
import java.util.Collections;

import dev.psusanto.CardGameJava.exceptions.InvalidCardException;
import dev.psusanto.CardGameJava.exceptions.InvalidDeckException;

public class SchwimmenDeck implements Deck {
    private ArrayList<Card> schwimmenDeck;
    private String[] availableSuits = {"Eichel", "Schelln", "Herz", "Gras"};
    private int[] availableRanks = {7, 8, 9, 10, 11, 12, 13, 14};

    public SchwimmenDeck() throws InvalidDeckException, InvalidCardException {
        this.schwimmenDeck = new ArrayList<Card>();
        createDeck();
        validateDeck();
    }

    private void createDeck() throws InvalidCardException {
        //for each suit and rank, create a card and add it to array list
        for (int i = 0; i < availableSuits.length; i++) {
            for (int j = 0; j < availableRanks.length; j++) {
                schwimmenDeck.add(new SchwimmenCard(availableSuits[i], availableRanks[j]));
            }
        }
    }

    @Override
    public ArrayList<Card> getDeck() {
        return schwimmenDeck;
    }  

    private void validateDeck() throws InvalidDeckException {
        if (schwimmenDeck.size() != 32) {
            throw new InvalidDeckException("Deck size not 32");
        }
    }
}
