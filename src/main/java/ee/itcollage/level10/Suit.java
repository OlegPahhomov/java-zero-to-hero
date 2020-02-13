package ee.itcollage.level10;

public enum Suit {
	/** &spades; */
	SPADES,
	/** &hearts; */
	HEARTS,
	/** &diams; */
	DIAMONDS,
	/** &clubs; */
	CLUBS;

	@Override
	public String toString() {
		char icon;
		switch (this) {
			case CLUBS:
				icon = '\u2663';
				break;
			case DIAMONDS:
				icon = '\u2666';
				break;
			case HEARTS:
				icon = '\u2665';
				break;
			case SPADES:
				icon = '\u2660';
				break;
			default:
				throw new IllegalStateException("No icon implemented for " + super.toString());
		}

		return String.valueOf(icon);
	}
}
