package ee.itcollage.level10;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CardgameTest {

    @Test
    public void cards_contain_ace_of_spades() {
        List<Card> cards = Cardgame.buildDeck();
        assertEquals(52, cards.size());
        Card aceOfSpades = new Card(Rank.ACE, Suit.SPADES);
        assertTrue(cards.contains(aceOfSpades));
    }

}