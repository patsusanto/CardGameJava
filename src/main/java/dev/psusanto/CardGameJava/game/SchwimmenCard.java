package dev.psusanto.CardGameJava.game;

import dev.psusanto.CardGameJava.exceptions.InvalidCardException;

public class SchwimmenCard implements Card{
    private String suit;
    private int rank;
    private double points;

    public SchwimmenCard(String suit, int rank) throws InvalidCardException {
        ValidateRank(rank);
        ValidateSuit(suit);
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    public void printCard() {
        String suitAsString = "";
        switch (rank) {
            case 11:
                suitAsString = "Unter";
                break;
            case 12:
                suitAsString = "Ober";
                break;
            case 13:
                suitAsString = "Koenig";
                break;
            case 14:
                suitAsString = "Ass";
                break;
            default:
                suitAsString = String.valueOf(suit);

        }       
        System.out.println(rank + " of " + suitAsString);
    }

    private void ValidateRank(int rank) throws InvalidCardException {
        //schwimmen only has 7 to ace
        if (rank > 6 && rank < 15)
            throw new InvalidCardException("Card has invalid Rank");
    }

    private void ValidateSuit(String suit) throws InvalidCardException {
        String[] possibleSuits = {"Eichel", "Schelln", "Herz", "Gras"};

        for (int i = 0; i < possibleSuits.length; i++) {
            if (!suit.equals(possibleSuits[i])) {
                throw new InvalidCardException("Card has invalid Rank");
            }
        }

    }

    @Override
    public double getPoints() {
        return points;
    }
}
