import java.util.Collections;
import java.util.Stack;

class Deck {

    private Stack<Card> cards;

    Deck() {
        this.populateDeck();
    }

    public void populateDeck() {
        this.cards = new Stack<Card>();
        for(int i = 0; i< 4; i++) {
            for(int j = 0; j < 13; j++) {
                this.cards.add(new Card(i, j));
            }
        }
    }

    public void shuffle() {
        this.populateDeck();
        Collections.shuffle(cards);
    }

    public Card deal() {
        if (cards.isEmpty()) {
            shuffle();
        }
        return cards.pop();
    }

    public String toString() {
        return cards.toString();
    }
}