import java.util.ArrayList;
import java.util.List;

public class DeckTemplate {

    private List<Card> cards = new ArrayList<>();

    public DeckTemplate() {
        Card card1 = new Card(Color.CLUBS, "A", 1);
        this.cards.add(card1);
        Card card2 = new Card(Color.CLUBS, "K", 2);
        this.cards.add(card2);
        Card card3 = new Card(Color.CLUBS, "Q", 3);
        this.cards.add(card3);
        Card card4 = new Card(Color.CLUBS, "J", 4);
        this.cards.add(card4);
        Card card5 = new Card(Color.CLUBS, "10", 5);
        this.cards.add(card5);
        Card card6 = new Card(Color.CLUBS, "9", 6);
        this.cards.add(card6);
        Card card7 = new Card(Color.CLUBS, "8", 7);
        this.cards.add(card7);
        Card card8 = new Card(Color.CLUBS, "7", 8);
        this.cards.add(card8);
        Card card9 = new Card(Color.CLUBS, "6", 9);
        this.cards.add(card9);
        Card card10 = new Card(Color.CLUBS, "5", 10);
        this.cards.add(card10);
        Card card11 = new Card(Color.CLUBS, "4", 11);
        this.cards.add(card11);
        Card card12 = new Card(Color.CLUBS, "3", 12);
        this.cards.add(card12);
        Card card13 = new Card(Color.CLUBS, "2", 13);
        this.cards.add(card13);

        Card card14 = new Card(Color.DIAMONDS, "A", 1);
        this.cards.add(card14);
        Card card15 = new Card(Color.DIAMONDS, "K", 2);
        this.cards.add(card15);
        Card card16 = new Card(Color.DIAMONDS, "Q", 3);
        this.cards.add(card16);
        Card card17 = new Card(Color.DIAMONDS, "J", 4);
        this.cards.add(card17);
        Card card18 = new Card(Color.DIAMONDS, "10", 5);
        this.cards.add(card18);
        Card card19 = new Card(Color.DIAMONDS, "9", 6);
        this.cards.add(card19);
        Card card20 = new Card(Color.DIAMONDS, "8", 7);
        this.cards.add(card20);
        Card card21 = new Card(Color.DIAMONDS, "7", 8);
        this.cards.add(card21);
        Card card22 = new Card(Color.DIAMONDS, "6", 9);
        this.cards.add(card22);
        Card card23 = new Card(Color.DIAMONDS, "5", 10);
        this.cards.add(card23);
        Card card24 = new Card(Color.DIAMONDS, "4", 11);
        this.cards.add(card24);
        Card card25 = new Card(Color.DIAMONDS, "3", 12);
        this.cards.add(card25);
        Card card26 = new Card(Color.DIAMONDS, "2", 13);
        this.cards.add(card26);

        Card card27 = new Card(Color.HEARTS, "A", 1);
        this.cards.add(card27);
        Card card28 = new Card(Color.HEARTS, "K", 2);
        this.cards.add(card28);
        Card card29 = new Card(Color.HEARTS, "Q", 3);
        this.cards.add(card29);
        Card card30 = new Card(Color.HEARTS, "J", 4);
        this.cards.add(card30);
        Card card31 = new Card(Color.HEARTS, "10", 5);
        this.cards.add(card31);
        Card card32 = new Card(Color.HEARTS, "9", 6);
        this.cards.add(card32);
        Card card33 = new Card(Color.HEARTS, "8", 7);
        this.cards.add(card33);
        Card card34 = new Card(Color.HEARTS, "7", 8);
        this.cards.add(card34);
        Card card35 = new Card(Color.HEARTS, "6", 9);
        this.cards.add(card35);
        Card card36 = new Card(Color.HEARTS, "5", 10);
        this.cards.add(card36);
        Card card37 = new Card(Color.HEARTS, "4", 11);
        this.cards.add(card37);
        Card card38 = new Card(Color.HEARTS, "3", 12);
        this.cards.add(card38);
        Card card39 = new Card(Color.HEARTS, "2", 13);
        this.cards.add(card39);

        Card card40 = new Card(Color.SPADES, "A", 1);
        this.cards.add(card40);
        Card card41 = new Card(Color.SPADES, "K", 2);
        this.cards.add(card41);
        Card card42 = new Card(Color.SPADES, "Q", 3);
        this.cards.add(card42);
        Card card43 = new Card(Color.SPADES, "J", 4);
        this.cards.add(card43);
        Card card44 = new Card(Color.SPADES, "10", 5);
        this.cards.add(card44);
        Card card45 = new Card(Color.SPADES, "9", 6);
        this.cards.add(card45);
        Card card46 = new Card(Color.SPADES, "8", 7);
        this.cards.add(card46);
        Card card47 = new Card(Color.SPADES, "7", 8);
        this.cards.add(card47);
        Card card48 = new Card(Color.SPADES, "6", 9);
        this.cards.add(card48);
        Card card49 = new Card(Color.SPADES, "5", 10);
        this.cards.add(card49);
        Card card50 = new Card(Color.SPADES, "4", 11);
        this.cards.add(card50);
        Card card51 = new Card(Color.SPADES, "3", 12);
        this.cards.add(card51);
        Card card52 = new Card(Color.SPADES, "2", 13);
        this.cards.add(card52);
    }

    public List<Card> getCards() {
        return cards;
    }
}
