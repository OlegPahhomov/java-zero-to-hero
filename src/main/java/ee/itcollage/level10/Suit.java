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
			icon = '♣';
			break;
		case DIAMONDS:
			icon = '♦';
			break;
		case HEARTS:
			icon = '♥';
			break;
		case SPADES:
			icon = '♠';
			break;
		default:
			throw new IllegalStateException("No icon implemented for " + super.toString());
		}
		
		return String.valueOf(icon);
	}
}