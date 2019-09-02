package ee.itcollage.level10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Cardgame {

    public static List<Card> buildDeck() {
        List<Card> cards = new ArrayList<>();
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                Card card = new Card(rank, suit);
                cards.add(card);
            }
        }
        return cards;
    }

    public static List<Card> shuffle(List<Card> cards) {
        Collections.shuffle(cards);
        return cards;
    }

    public static void main(String[] args) {
        //todo 1 fix tests
        List<Card> cards = buildDeck();
        shuffle(cards);
        List<Card> pokerHand = cards.stream().limit(5).collect(Collectors.toList());
        System.out.println(pokerHand);
        //todo 2 simulate playing poker (buildDeck, shuffle and get 5 cards)

    }
}
