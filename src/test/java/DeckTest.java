import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DeckTest {

    private final Deck sampleDeck = new Deck(new DeckTemplate().getCards());
    private Deck testDeck;
    private Deck shuffledDeck;

    @BeforeEach
    public void setUp() {
        testDeck = Deck.build();
        shuffledDeck = new Deck(new DeckTemplate().getCards());
        shuffledDeck.shuffle();
    }

    @Test
    public void shouldBuildA52CardSortedDeck() {
        Deck newDeck = Deck.build();
        assertEquals(sampleDeck.getCards(), newDeck.getCards());
    }

    @Test
    public void shouldShuffleTheDeck() {
        testDeck.shuffle();
        assertFalse(sampleDeck.getCards().equals(testDeck.getCards()));
        assertTrue(sampleDeck.size() == testDeck.size());
    }

    @Test
    public void shouldSortTheDeck() {
        shuffledDeck.sort();
        assertEquals(sampleDeck.getCards(), shuffledDeck.getCards());
        assertTrue(sampleDeck.size() == shuffledDeck.size());
    }

    @Test
    public void shouldRemoveCardFromDeckAndReturnIt() {
        Card card = new Card(Color.SPADES, "2", 13);
        Card cardDrawn = testDeck.drawCard();
        assertEquals(51, testDeck.size());
        assertEquals(card, cardDrawn);
    }

    @Test
    public void shouldThrowExceptionWhenDrawingCardFromEmptyDeck() {
        Deck deck3 = new Deck();
        assertThrows(NullPointerException.class, deck3::drawCard);
    }
}
