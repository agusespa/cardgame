import java.util.*;

public class Deck {

    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
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

        quickSort(spades);
        quickSort(hearths);
        quickSort(diamonds);
        quickSort(clubs);

        clubs.addAll(diamonds);
        clubs.addAll(hearths);
        clubs.addAll(spades);

        setCards(clubs);
    }

    void quickSort(List<Card> list) {
        quickSort(list, 0, list.size() -1);
    }
    void quickSort(List<Card> list, int left, int right) {
            // swap elements according to rank and return a pivot to divide the list
            int partitionIndex = partition(list, left, right);

            // recursively call the partition method on the two halves of the list
            if (left < partitionIndex - 1) {
                quickSort(list, left, partitionIndex - 1);
            }
            if (partitionIndex < right) {
                quickSort(list, partitionIndex, right);
            }
    }

    int partition(List<Card> list, int left, int right) {
        Card pivot = list.get((left + right) / 2);

        while (left <= right) {

            // find elements that are in the wrong side
            while (list.get(left).getRank() < pivot.getRank())
                left++;
            while (list.get(right).getRank() > pivot.getRank())
                right--;

            // swap the elements to their correct side
            if (left <= right) {
                Card leftCard = list.get(left);
                Card rightCard = list.get(right);
                list.set(left, rightCard);
                list.set(right, leftCard);
                left++;
                right--;
            }
        }
        return left;
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
        if (cards.isEmpty()) {
            throw new NullPointerException("There are no more cards in the deck.");
        } else return this.cards.remove(cards.size()-1);
    }

    public int size() {
        return cards.size();
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
