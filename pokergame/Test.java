import java.util.ArrayList;
import java.util.Collections;

class Test {
    public static void main(String[] args) {
        ArrayList<Card> hand = new ArrayList<Card>();
        hand.add(new Card(0, 1));
        hand.add(new Card(1, 2));
        hand.add(new Card(2, 3));
        hand.add(new Card(3, 4));
        hand.add(new Card(4, 5));
        Collections.sort(hand);
        if (PokerRules.hasStraight(hand)) {
            System.out.println("HAS STRA");
        }
    }
}