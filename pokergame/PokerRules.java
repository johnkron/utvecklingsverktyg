import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Stack;

class PokerRules {

    static boolean hasFlush(ArrayList<Card> hand) {
        int lastSuit = -1;
        boolean hasFlush = true;
        for (int i = 0; i < 5; i++) {
            if (lastSuit > 0 && lastSuit != hand.get(i).getSuit()) {
                hasFlush = false;
                return false;
            }
            lastSuit = hand.get(i).getSuit();
        }
        return hasFlush;
    }

    static boolean hasStraight(ArrayList<Card> hand) {
        int lastRank = -1;
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            if (lastRank > 0) {
                sum = sum + (lastRank - hand.get(i).getRank());
            }
            lastRank = hand.get(i).getRank();
        }
        return sum == 4 || PokerRules.hasAceHighStraight(hand);
    }

    static boolean hasAceHighStraight(ArrayList<Card> hand) {
        if (hand.get(0).getRank() == 12 && hand.get(1).getRank() == 11 &&
            hand.get(2).getRank() == 10 && hand.get(3).getRank() == 9 &&
            hand.get(4).getRank() == 0) {
                return true;
        }
        return false;
    }

    static boolean hasRoyalStraightFlush(ArrayList<Card> hand) {
        return PokerRules.hasFlush(hand) && PokerRules.hasAceHighStraight(hand);
    }

    static boolean hasThreeOfAKind(ArrayList<Card> hand) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        boolean threeOfAKind = false;
        for (int i = 0; i < 5; i++) {
            list.add(hand.get(i).getRank());
        }
        for (Integer rank : list) {
            if (Collections.frequency(list, rank) == 3) {
                threeOfAKind = true;
            }

        }
        return threeOfAKind;
    }

    static boolean hasTwoPairs(ArrayList<Card>hand) {
        Stack<Card> stack = new Stack<Card>();
        HashSet set = new HashSet<>();
        int pairs = 0;
        stack.addAll(hand);
        while(!stack.isEmpty()) {
            Card c = stack.pop();
            if (set.add(c.getRank()) == false) {
                pairs++;
                set.remove(c.getRank());
            }

        }
        return pairs == 2;
    }


    static boolean hasFourOfAKind(ArrayList<Card> hand) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        boolean fourOfAKind = false;
        for (int i = 0; i < 5; i++) {
            list.add(hand.get(i).getRank());
        }
        for (Integer rank : list) {
            if (Collections.frequency(list, rank) == 4) {
                fourOfAKind = true;
            }

        }
        return fourOfAKind;    
    }

    static boolean hasFullHouse(ArrayList<Card> hand) {
        return PokerRules.hasPair(hand) && PokerRules.hasThreeOfAKind(hand);
    }

    static boolean hasPair(ArrayList<Card> hand) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        boolean fourOfAKind = false;
        for (int i = 0; i < 5; i++) {
            list.add(hand.get(i).getRank());
        }
        for (Integer rank : list) {
            if (Collections.frequency(list, rank) == 2) {
                fourOfAKind = true;
            }

        }
        return fourOfAKind;
    }

}