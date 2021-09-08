package deckofcards;
import java.util.*;
/**
 * class to store the number of players and cards their holding
 * @author Shravya P
 *
 */
class Hand{
    /**
     * Constructor to initialize cards for players
     */
    public Hand()
    {
        ArrayList<Card> hand=new ArrayList<Card>(9); 
    } 
}
public class Player {
    /**
     * constructor to initialize the players
     * @param n number of players
     */
    private static int n;
    public Player(int n)
    {
        this.n=n;
        Deck cards=new Deck();
        ArrayList<Hand> players=new ArrayList<Hand>(n);    
    }
    /**
     * Method to sequence the players order
     */
    public void getOrder()
    {
       ArrayList<Integer> sequence=new ArrayList<Integer>(n);
       for(int i=0;i<n;i++)
           sequence.add(i);
       Collections.shuffle(sequence);
    }
}
