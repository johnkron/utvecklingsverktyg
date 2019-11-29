import java.util.ArrayList;
import java.util.Scanner;

class Game {

    Game() {}

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter player name:");
        String playerName = scanner.next();

        Player player = new Player();
        player.setName(playerName);

        Deck deck = new Deck();
        deck.shuffle();

        boolean playing = true;

        while(playing) {
        
            dealPlayerHand(player, deck);

            String chipStack = Integer.toString(player.getChipsCount());
            System.out.println(player.getName() + ", your current chip stack is: " + chipStack);
            System.out.println("Place your bet:");
            int bet = scanner.nextInt();
            player.removeChips(bet);

            System.out.println(player.getName() + ", your current hand is: \n");
            System.out.println(printHand(player.getHand()));
            System.out.println("Select cards to swap, type n to swap no cards:");
            String cardsToSwap = scanner.next();
            if (!cardsToSwap.trim().equals("n")) { 
                String[] swapCards = cardsToSwap.split(",");
                for(int i = 0; i < swapCards.length; i++) {
                    int position = Integer.parseInt(swapCards[i].trim());
                    player.swapCard(position, deck.deal());
                }
                System.out.println("Your hand after swap is:");
            }

            System.out.println(printHand(player.getHand()));

            int chipsWon = 0;
            boolean youWin = true;
            String whatYouHave = "";
            ArrayList<Card> hand = player.getHand();
            if (PokerRules.hasRoyalStraightFlush(hand)) {
                chipsWon = bet * 200;
                whatYouHave = "Royal straight flush";
            } else if (PokerRules.hasFullHouse(hand)) {
                chipsWon = bet * 10;
                whatYouHave = "Full house";
            } else if (PokerRules.hasFlush(hand)) {
                chipsWon = bet * 8;
                whatYouHave = "Flush";
            } else if (PokerRules.hasStraight(hand)) {
                chipsWon = bet * 6;
                whatYouHave = "Straight";
            } else if (PokerRules.hasThreeOfAKind(hand)) {
                chipsWon = bet * 4;
                whatYouHave = "Three of a kind";
            } else if (PokerRules.hasTwoPairs(hand)) {
                chipsWon = bet * 3;
                whatYouHave = "Two pairs";
            } else if (PokerRules.hasPair(hand)) {
                chipsWon = bet * 2;
                whatYouHave = "One Pair";
            } else {
                youWin = false;
            }

            if (youWin) {
                System.out.println("Congratulations You Won!");
                System.out.println("You have " + whatYouHave + ", this got you " + Integer.toString(chipsWon) + " chips!");
            }

            player.addChips(chipsWon);

            System.out.println("Do you want to play again? (y/n)");
            String result = scanner.next();
            if (!result.equals("y")) {
                playing = false;
            }
        }

        scanner.close();
    }

    private void dealPlayerHand(Player player, Deck deck) {
        player.clearPlayerHand();
        for(int i = 0; i < 5; i++) {
            player.addCard(deck.deal());
        }
    }

    private String printHand(ArrayList<Card> hand) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            builder.append("[");
            builder.append(i);
            builder.append("] ");
            builder.append(hand.get(i));
            builder.append("\n");
        }

        return builder.toString();
    }

}