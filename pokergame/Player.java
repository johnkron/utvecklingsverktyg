import java.util.ArrayList;
import java.util.Collections;

class Player {

    private ArrayList<Card> hand;
    private int chips;
    private String name;

    Player() {
        chips = 1000;
        hand = new ArrayList<Card>();
        name = "";
    }

    public void removeChips(int removeChips) {
        chips = chips - removeChips;
    }

    public void addChips(int chipsWon) {
        chips = chips + chipsWon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChipsCount() {
        return chips;
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public ArrayList<Card> getHand() {
        Collections.sort(hand);
        return hand;
    }

    public void swapCard(int position, Card card) {
        hand.set(position, card);
    }
}