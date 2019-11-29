class Card implements Comparable<Card> {

    private int suit;
    private int rank;

    Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public int getSuit() {
        return this.suit;
    }

    public int getRank() {
        return this.rank;
    }

    public int compareTo(Card c) {
        if (c.rank > rank) {
            return 1;
        } else {
            return -1;
        }
    }

    public String toString() {
        String suit = "";
        String rank = "";
        if (this.suit == 0) {
            suit = "clubs";
        } else if (this.suit == 1) {
            suit = "diamonds";
        } else if (this.suit == 2) {
            suit = "hearts";
        } else {
            suit = "spades";
        }

        if (this.rank == 0) {
            rank = "A";
        } else if(this.rank > 0 && this.rank < 10) {
            rank = Integer.toString(this.rank + 1);
        } else if (this.rank == 10) {
            rank = "J";
        } else if (this.rank == 11) {
            rank = "Q";
        } else {
            rank = "K";
        }

        return rank + " of " + suit;

    }
}