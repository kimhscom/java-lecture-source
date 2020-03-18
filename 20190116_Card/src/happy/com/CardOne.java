package happy.com;

public class CardOne {
	
	public String card;
	
	public static final String[] SHAPE = {"◆", "♠", "♣","♥"};
	public static final String[] NUMBER = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	public CardOne() {
		makeCard();
	}
	
	public void makeCard() {
		int s = (int)(Math.random()*SHAPE.length);
		int n = (int)(Math.random()*NUMBER.length);
		card = SHAPE[s].concat(NUMBER[n]);
	}

	@Override
	public String toString() {
		return "[" + card + "]";
	}	
	
	@Override
	public int hashCode() {
		return card.hashCode()+137;
	}

	@Override
	public boolean equals(Object obj) {
		boolean isc =false;
		CardOne one = (CardOne)obj;
		if (card.equals(one.card)) {
			isc = true;
		}
		return isc;
	}
	
	

}
