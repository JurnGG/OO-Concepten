package week7.kaartspelletjes_2;

public enum Suit {
    SPADES, HEARTS, DIAMONDS, CLUBS;

    @Override
    public String toString() {
        return switch (this) {
            case SPADES -> "♠";
            case HEARTS -> "♥";
            case DIAMONDS -> "♦";
            case CLUBS -> "♣";
        };
    }
}
