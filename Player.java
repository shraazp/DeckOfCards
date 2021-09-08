package deckofcards;
import java.util.*;
/**
 * class to store the number of players and cards their holding
 * @author Shravya P
 *
 */
class Hand{
    /**
     * Constructor to initialise cards for players
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
    public Player(int n)
    {
        Deck cards=new Deck();
        ArrayList<Hand> players=new ArrayList<Hand>(n);    
    }
}
