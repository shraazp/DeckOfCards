package deckofcards;
import java.util.*;
public class Deck {
	private ArrayList<Card> cards;
	/**
    * Constructs a standard deck of 52 cards.
    */
	private static final List<String> RANKS = new ArrayList<String>(List.of("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King","Ace"));
	private static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
	public Deck() {
        cards=new ArrayList<Card>(52);
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 0; rank < 13; rank++) {
                getCards().add(new Card(SUITS[suit],RANKS.get(rank)));   
            } }
        }
	/**
	 * Method to shuffle the 52 cards
	 */
	public void shuffle()
	{
	    Collections.shuffle(getCards());
	}
	/**
	 * getter method to return cards
	 * @return arraylist cards
	 */
    public ArrayList<Card> getCards() {
        return cards;
    }
    
}
    
