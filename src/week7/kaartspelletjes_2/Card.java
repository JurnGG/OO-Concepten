package week7.kaartspelletjes_2;

import week7.cache.Car;

import java.util.Random;

public class Card {
    private Random random = new Random();
    private Suit suit;
    private CardValue Card;

    public Card(){
        this.suit = Suit.values()[random.nextInt(Suit.values().length)];
        this.Card = CardValue.values()[random.nextInt(CardValue.values().length)];
    }
    public Card(Suit suit, CardValue Card) {
        this.suit = suit;
        this.Card = Card;
    }

    public Suit getSuit() {
        return suit;
    }

    public CardValue getValue() {
        return Card;
    }

    public int getValueAsInt(){
        return Card.getValue();
    }

    @Override
    public String toString() {
        return suit+ " " + Card + " (" + getValueAsInt() + ")";
    }
}
