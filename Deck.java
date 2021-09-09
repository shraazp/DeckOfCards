package deckofcards;
import java.util.*;
public class Deck {
	/**
    * Constructs a standard deck of 52 cards.
    */
    private ArrayList<Card> cards;
	private static final List<String> RANKS = new ArrayList<String>(List.of("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King","Ace"));
	private static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
	public Deck() {
        this.cards=new ArrayList<Card>(52);
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 0; rank < 13; rank++) {
                cards.add(new Card(SUITS[suit],RANKS.get(rank)));   
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
    /**
     * method to compare two ranks
     * @param rank1 one rank
     * @param rank2 next rank to be compared
     * @return rank which has lesser value
     */
    public Card compare(Card rank1,Card rank2) {
        if(RANKS.indexOf(rank1.getRank())<RANKS.indexOf(rank2.getRank()))
            return rank1;   
        else
            return rank2;
       }
    
}
    
