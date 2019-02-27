package ee.itcollage.level10;

import java.util.Objects;

public class Card {

	private Rank rank;
	private Suit suit;
	
	public Card(Rank rank, Suit suit) {
		super();
		this.rank = rank;
		this.suit = suit;
	}

	public Rank getRank() {
		return rank;
	}

	public Suit getSuit() {
		return suit;
	}

	@Override
	public String toString() {
		return String.format("%s of %s", rank, suit);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Card card = (Card) o;
		return rank == card.rank &&
				suit == card.suit;
	}

	@Override
	public int hashCode() {
		return Objects.hash(rank, suit);
	}
}
