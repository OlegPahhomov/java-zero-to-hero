package ee.itcollage.level10;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CardgameTest {

    @Test
    void cards_contain_ace_of_spades() {
        List<Card> cards = Cardgame.buildDeck();
        assertEquals(52, cards.size());
        Card aceOfSpades = new Card(Rank.ACE, Suit.SPADES);
        assertTrue(cards.contains(aceOfSpades));
    }
}
