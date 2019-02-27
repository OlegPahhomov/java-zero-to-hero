package ee.itcollage.level10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cardgame {

    public static List<Card> buildDeck() {
        List<Card> cards = new ArrayList<>();
        return cards;
    }

    public static List<Card> shuffle(List<Card> cards) {
        Collections.shuffle(cards);
        return cards;
    }

    public static void main(String[] args) {
        //todo 1 fix tests
        //todo 2 simulate playing poker (buildDeck, shuffle and get 5 cards)

    }
}
