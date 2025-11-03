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
        for (int suit = 1; suit <= 4; suit++) {
            for (int face = 1; face <= 13; face++) {
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

        for(int i = 0; i < DECK_SIZE; i++) {
            result += deck[i].toString() + "\n";
        }
        return result;
    }

}
