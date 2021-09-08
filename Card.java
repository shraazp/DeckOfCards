package deckofcards;
/**
 * Card class consists of two parameters rank and suite
 * @author Shravya P
 */
public class Card {
    private final String rank;
	private final String suit;
	/**
	* Constructs a card of the given rank and suit.
	*/
	public Card(String suits, String ranks) 
	{
	    this.rank = suits;
	    this.suit = ranks;
	}
	/**
	* Gets the card's rank.
	*/
	public String getRank() 
	{
	    return this.rank;
	}
	/**
	* Gets the card's suit.
	*/
	public String getSuit() 
	{
	    return this.suit;
	}	    
}
