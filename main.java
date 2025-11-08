import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Initialization
        arrDeck deck1 = new arrDeck();
        final Random cpuSelection = new Random();
        int cpuchoice = 0;

        int userfacescore;
        int cpufacescore;

        int usersuitscore;
        int cpusuitscore;

        int userwins = 0;
        int cpuwins = 0;

        // While loop to keep the game running
        while (userwins < 3 && cpuwins < 3)
        {

            // basically, this makes the entire deck "null" so that it can be repopulated after a game has run through
            if (userwins > 0 || cpuwins > 0) {deck1.clearDeck();}

            System.out.println("Creating deck..");
            deck1.populateDeck();

            System.out.println("Shuffling deck..");
            deck1.shuffleDeck();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the card you want to cut, from 1-51: __ ");
            int target = scanner.nextInt();
            System.out.println(deck1.cardCut(target));

            System.out.println("CPU is making its choice..");
            if (target < 51)
            {
                cpuchoice = cpuSelection.nextInt(target, 51);
            }
            else
            {
                cpuchoice = 51;
            }

            System.out.println(deck1.cardCut(cpuchoice + 1));

            userfacescore = deck1.selectCard(target - 1).getFace();
            cpufacescore = deck1.selectCard(cpuchoice).getFace();

            if (cpufacescore > userfacescore)
            {
                cpuwins++;
                System.out.println("CPU Victory. Loser.");
            }

            else if (userfacescore > cpufacescore)
            {
                userwins++;
                System.out.println("User Victory. Winner.");


            }
            else
            {
                usersuitscore = deck1.selectCard(target - 1).getSuit();
                cpusuitscore = deck1.selectCard(cpuchoice).getSuit();

                if (usersuitscore > cpusuitscore)
                {
                    cpuwins++;
                    System.out.println("CPU Victory. Loser.");
                }
                else if (cpusuitscore > usersuitscore)
                {
                    userwins++;
                    System.out.println("User Victory. Winner.");
                }
            }
            System.out.printf("Current Player Wins: %d\nCurrent CPU Wins: %d\n", userwins, cpuwins);
        }

    // The outside of the while loop, says the victor
    if (cpuwins == 3)
    {
        System.out.println("Computer Wins. You really couldn't beat a random number generator?");
    }
    else if (userwins == 3)
    {
        System.out.println("You won, I guess..");
    }

    System.out.println("Printing all the arrays for the sake of grading, first sorted, then unsorted.");

    deck1.clearDeck();
    deck1.populateDeck();
    System.out.println(deck1.showDeck());
    deck1.shuffleDeck();
    System.out.println(deck1.showDeck());

    }
}
