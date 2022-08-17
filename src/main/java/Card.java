import java.util.Objects;

public class Card implements Comparable{

    private Color color;

    private String value;

    private int rank;

    public Card(Color color, String value, int rank) {
        this.color = color;
        this.value = value;
        this.rank = rank;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public int compareTo(Object o) {
        Card c2 = (Card) o;
        if (c2.getColor().equals(this.getColor())) {
            if (c2.getRank() < this.getRank()) return 1;
            else return -1;
        } else return c2.getColor().compareTo(this.getColor());
    }

    @Override
    public String toString() {
        if (color == Color.CLUBS)
            return value + " ♣";
        else if (color == Color.DIAMONDS)
            return value + " ♦";
        else if (color == Color.HEARTS)
            return value + " ♥";
        else
            return value + " ♠";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return rank == card.rank && color == card.color && Objects.equals(value, card.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, value, rank);
    }
}

