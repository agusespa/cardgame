import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Game {

    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to the card game!");

        System.out.println("How many decks do you want to use?");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int deckSelection = 0;
        while (deckSelection == 0) {
            String deckSelectionLine = reader.readLine();
            try {
                deckSelection = Integer.valueOf(deckSelectionLine);
                if (deckSelection < 1) throw new IllegalArgumentException();
            } catch (RuntimeException e) {
                System.out.println("Please enter a valid number");
            }
        }

        List<Deck> deckList = new ArrayList<>();
        for (int i = 0; i < deckSelection; i++) {
            Deck deck = Deck.build();
            deckList.add(deck);
        }

        while (deckList.size() > 0) {
            Deck currentDeck = deckList.get(deckList.size()-1);

            System.out.println("Choose an action");
            System.out.println("Enter 1 to draw a card");
            System.out.println("Enter 2 to shuffle the deck");
            System.out.println("Enter 3 to sort the deck");
            System.out.println("Enter 4 to exit the game");

            int selection = 0;
            while (selection < 1 || selection > 4) {
                String selectionLine = reader.readLine();
                try {
                    selection = Integer.valueOf(selectionLine);
                    if (selection < 1 || selection > 4) throw new IllegalArgumentException();
                } catch (RuntimeException e) {
                    System.out.println("Please enter a valid choice");
                }
            }

            if (selection == 1) {
                try {
                    System.out.println("You got " + currentDeck.drawCard());
                } catch (Exception e) {
                    deckList.remove(deckList.size()-1);
                    System.out.println("You have " + deckList.size() + " deck(s) left.");
                }
            }
            else if (selection == 2) currentDeck.shuffle();
            else if (selection == 3) currentDeck.sort();
            else break;
        }

        System.out.println("Thanks for playing!");
    }
}
