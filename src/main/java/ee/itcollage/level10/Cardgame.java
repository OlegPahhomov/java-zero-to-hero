package ee.itcollage.level10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cardgame {

    public static List<Card> buildDeck() {
        List<Card> cards = new ArrayList<>();

        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                cards.add(new Card(rank, suit));
            }
        }

        return cards;
    }

    public static List<Card> shuffle(List<Card> cards) {
        Collections.shuffle(cards);
        return cards;
    }

    public static void main(String[] args) {
        List<Card> cards = buildDeck();
        List<Card> shuffledCards = shuffle(cards);

        List<Card> hand = new ArrayList<>();
        for (int i = 0; i < 5 && i < shuffledCards.size(); i++) {
            hand.add(shuffledCards.get(i));
        }
        System.out.println(hand);

        //todo 1 fix tests
        //todo 2 simulate playing poker (buildDeck, shuffle and get 5 cards)

    }
}
