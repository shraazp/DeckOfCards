package deckofcards;
import java.util.*;
/**
 * class to store the number of players and cards their holding
 * @author Shravya P
 *
 */
class Hand{
    private ArrayList<Card> hand;
    /**
     * Constructor to initialize cards for players
     */
    public Hand()
    {
       hand=new ArrayList<Card>(9); 
    } 
    /**
     * Gets the hand
     * @return the list containing cards
     */
    public List<Card> getHand()
    {
        return this.hand;
    }
    /**
     * to add a value to the hand
     * @param a card value
     */
    public void setHand(Card a)
    {
        this.hand.add(a);
    }
}
public class Player {
    /**
     * constructor to initialize the players
     * @param n number of players
     */
    private int n;
    private static ArrayList<Hand> players;
    private ArrayList<Integer> sequence;
    private Deck deck;
    public Player(int n)
    {
        this.n=n;
        deck=new Deck();
        players=new ArrayList<Hand>(n);
        for(int i=0;i<n;i++)
            players.add(i,new Hand());
    }
    /**
     * Method to sequence the players order
     */
    public void getOrder()
    {
       sequence=new ArrayList<Integer>(n);
       for(int i=0;i<n;i++)
           sequence.add(i);
       Collections.shuffle(sequence);
    }
    /**
     * in this method cards are distributed among players
     * each player should have different 9 cards
     * first the deck is shuffled then a random number is obtained 
     * card corresponding to that random number is given 
     * to player according to sequence
     */
    public void cardDistribution()
    {
        deck.shuffle();
        //to remove the card which is given to player
        ArrayList<Card> tempCards=deck.getCards();
        Random random = new Random();  
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<n;j++)
            {
               //to get the player according to sequence 
               Hand playerHand = players.get(sequence.get(j));
               int x=random.nextInt(tempCards.size());
               playerHand.setHand(tempCards.get(x));
               tempCards.remove(x);
            }
        }  
    }  
}
   

