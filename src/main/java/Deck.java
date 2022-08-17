import java.util.*;

public class Deck {

    private List<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
    }

    public Deck(List<Card> cards) {
        this.cards = cards;
    }

    public static Deck build() {
        Deck deck = new Deck(new DeckTemplate().getCards());
        return deck;
    }

    // This built-in method with compareTo() is more appropriate for production.
    // It passes the tests.
    // I've commented it out to show how a custom sorting method would work.
//    public void sort() {
//        Collections.sort(this.cards);
//    }
    public void sort() {
        List<Card> spades = new ArrayList<>();
        List<Card> hearths = new ArrayList<>();
        List<Card> diamonds = new ArrayList<>();
        List<Card> clubs = new ArrayList<>();

        for (Card card : this.cards) {
            if (card.getColor().equals(Color.SPADES))
                spades.add(card);
            else if (card.getColor().equals(Color.HEARTS))
                hearths.add(card);
            else if (card.getColor().equals(Color.DIAMONDS))
                diamonds.add(card);
            else
                clubs.add(card);
        }

        quicksort(spades);
        quicksort(hearths);
        quicksort(diamonds);
        quicksort(clubs);
        clubs.addAll(diamonds);
        clubs.addAll(hearths);
        clubs.addAll(spades);

        setCards(clubs);
    }

    void quicksort(List<Card> list) {
        quicksort(list, 0, list.size() -1);
    }
    void quicksort(List<Card> list, int lowIndex, int highIndex) {
        if (lowIndex < highIndex) {
            int partitionIndex = partition(list, lowIndex, highIndex);

            quicksort(list, lowIndex, partitionIndex-1);
            quicksort(list, partitionIndex+1, highIndex);
        }
    }

    int partition(List<Card> list, int low, int high) {
        Card pivot = list.get(high);
        int lowIndex = (low - 1);

        for (int j = low; j < high; j++) {
            if (list.get(j).getRank() <= pivot.getRank()) {
                lowIndex++;
                Card temp = list.get(lowIndex);
                Card cardAtJ = list.get(j);
                list.set(lowIndex, cardAtJ);
                list.set(j, temp);
            }
        }

        Card temp = list.get(lowIndex + 1);
        list.set(lowIndex + 1, list.get(high));
        list.set(high, temp);

        return lowIndex + 1;
    }

    // This built-in method is more appropriate for production.
    // It passes the tests.
    // I've commented it out to show how a custom shuffling method would work.
//    public void shuffle() {
//        Collections.shuffle(this.cards);
//    }
    public void shuffle() {
        Random randomizer = new Random();

        for (int i = 0; i < cards.size()-1; i++) {
            int random = randomizer.nextInt(cards.size()-1);
            Card temp = this.cards.get(i);
            cards.set(i, cards.get(random));
            cards.set(random, temp);
        }
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public Card drawCard() {
        if (this.cards.isEmpty()) {
            throw new NullPointerException("There are no more cards in the deck.");
        } else return this.cards.remove(cards.size()-1);
    }

    public int size() {
        return this.cards.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deck deck = (Deck) o;
        return Objects.equals(cards, deck.cards);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cards);
    }
}
