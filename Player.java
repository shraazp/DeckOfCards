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
        //one card is added at a time
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
            players.add(new Hand());
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
               //get a random card
               int x=random.nextInt(tempCards.size());
               playerHand.setHand(tempCards.get(x));
               //remove the assigned card so its not repeated
               tempCards.remove(x);
            }
        }  
    }  
    /**
     * Method to check how many number of spades,diamonds,hearts and clubs 
     * with each player
     */
    public void verify()
    {   
        //to get each player
        for (Hand player:players)
        {
            //cards in players hand
            List<Card> p = player.getHand();
            int spade=0,heart=0,diamond=0,club=0;
            //for each card
            for(Card i : p)
            {  
                String j = i.getSuit();
                switch(j)
                {
                case "Spades":spade++;
                break;
                case "Diamonds":diamond++;
                break;
                case "Hearts":heart++;
                break;
                case "Clubs":club++;
                break;
                }
            }
            System.out.println("-------------");
            System.out.println("player:"+players.indexOf(player));
            System.out.println("Clubs:"+club);
            System.out.println("Diamonds:"+diamond);
            System.out.println("Hearts:"+heart);
            System.out.println("Spades:"+spade);
        } }
    /**
     * method to sort cards according to ranks
     * store the cards in players hands in ascending order
     * Ace has the highest value
     */
    public void sort()
    {
        //to get each player
        for (Hand player:players)
        {
            //hand of the player
            List<Card> p = player.getHand();
            //to sort the cards
            for(int i=0;i<p.size();i++)
            {
                for(int j=0;j<p.size()-i-1;j++)
                {
                    //get the card
                    Card rank1=p.get(j);
                    Card rank2=p.get(j+1);
                    //to compare which card has highest rank
                    if(deck.compare(rank1,rank2)==rank2)
                    {
                        //replace the cards
                        p.set(j, rank2);
                        p.set(j+1,rank1);
                    }   
                }
            } }
    }
    /**
     * to print the cards in players hands
     */
    public void print()
    {
        //to get each player
        for (Hand player:players)
        {
            System.out.println("-------------");
            System.out.println("player:"+players.indexOf(player));
            //returns set of cards in players hand
            List<Card> s = player.getHand();
            //to print each card
            for(Card i : s)
            System.out.println(i.getRank()+" of "+i.getSuit());
            
        }
    }
}
   

