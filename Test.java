package deckofcards;
/**
 * class to test the deck of cards
 * takes input number of players from user
 */
import java.util.Scanner;
public class Test {
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of players");
        n=sc.nextInt();
        if(n<2||n>4)
        {
            System.out.println("Enter the value between 2 and 4");
            n=sc.nextInt();
        }
        Player player=new Player(n);
        player.getOrder();
        player.cardDistribution();
        sc.close();
            
    }

}
