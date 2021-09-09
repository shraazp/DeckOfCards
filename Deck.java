package deckofcards;
import java.util.*;
public class Deck {
	private List<Card> cards;
	/**
     * Constructs a standard deck of 52 cards.
     */
	private static final List<String> RANKS = new ArrayList<String>(List.of("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King","Ace"));
	private static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
	public Deck() {
        this.cards = new ArrayList<Card>(52);
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 0; rank < 13; rank++) {
                cards.add(new Card(SUITS[suit],RANKS[rank]));   
            } }
        }
}
    
