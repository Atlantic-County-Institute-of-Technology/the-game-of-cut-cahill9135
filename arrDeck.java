import java.util.Arrays;
import java.util.Random;

public class arrDeck {


    private card[] deck;
    private final Random shuffler = new Random();
    private final int DECK_SIZE = 52;



    public arrDeck(){
        deck = new card[DECK_SIZE];
    }

    public void populateDeck() {
        int index = 0;
        for (int suit = 1; suit <= 4; suit++)
        {
            for (int face = 1; face <= 13; face++)
            {
                deck[index] = new card(face, suit);
                index++;
            }
        }
    }

    public card selectCard(int target) {
        return deck[target];
    }

    public String showDeck() {
        String result = "";

        for(int i = 0; i < DECK_SIZE; i++)
        {
            result += deck[i].toString() + "\n";
        }
        return result;
    }

    public card cardCut(int target) {
        // Subtracts one to account for the user input being from 1-52, rather than making them input 0-51.
        return deck[target - 1];
    }

    public void shuffleDeck() {
        // Shuffles the deck through a bubble sort without sorting, just kinda throwing variables around.
        for (int i= 0; i < deck.length; i++)
        {
            card temp = deck[i];
            int a = shuffler.nextInt(52);
            deck[i] = deck[a];
            deck[a] = temp;
        }
    }

    public void clearDeck() {
        // Makes the whole deck null
        Arrays.fill(deck, null);
    }

}
