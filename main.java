//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int cpuWins = 0;
        int plyrWins = 0;

        arrDeck deck1 = new arrDeck();

        deck1.populateDeck();

//        System.out.println(deck1.selectCard(5));

        System.out.println(deck1.showDeck());

    }
}
