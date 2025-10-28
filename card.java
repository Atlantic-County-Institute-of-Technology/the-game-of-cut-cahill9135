public class card {

    // Suits and faces are organized by numerical order.
    // Face goes from 1-13, with 1 being an ACE and a 13 being a KING
    // The order of suits goes Spades, Hearts, Clubs, Diamonds (1,2,3,4).
    final int suit;
    final int face;
    private final String[] faces = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    private final String[] suits = {null, "Spades", "Hearts", "Clubs", "Diamonds"};

    // CLASS CONSTRUCTOR
    public card(int face, int suit) {
        this.suit = suit;
        this.face = face;

    }

    // ACCESSORS

    public String getSuit() {
        return suits[suit];
    }

    public String getFace() {
        return faces[face];
    }

    // String Display Function
    public String toString() {
        String result = "You have a ";
        result = result + getFace() + "of " + getSuit() + ".";
        return result;
    }
}
