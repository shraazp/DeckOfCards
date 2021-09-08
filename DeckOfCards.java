package deck_of_cards;
/**
 *  initialize deck of cards having suit ("Clubs", "Diamonds", "Hearts", "Spades") 
 *  & Rank ("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace").
 */
public class DeckOfCards {
	String[] deck= new String[52];
	String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
	String[] RANKS = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
	/**
	 * constructor to initialize the arrays decks,ranks and suits
	 */
	public DeckOfCards()
	{
		 for (int k = 0; k < RANKS.length; k++) {
	         for (int j = 0; j < SUITS.length; j++) {
	             deck[SUITS.length*k + j] = RANKS[k] + " of " + SUITS[j];
	         }
	     }
	}
	/**
	 * main function of the class
	 */
	public static void main(String args[])
	{	
	 DeckOfCards deckCards=new DeckOfCards();
	}   
}
