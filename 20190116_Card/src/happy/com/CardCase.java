package happy.com;

import java.util.ArrayList;

public class CardCase {
	
//	private ArrayList<CardOne> cardcase;
	
	private CardOne[] cardCase;
	
	public CardCase() {
		cardCase = new CardOne[CardOne.SHAPE.length*CardOne.NUMBER.length];
		make_CardCase();
	}

	private void make_CardCase() {
		int count = 0;
		while (true) {
			CardOne one = new CardOne();
			if (!duplicate(one, count)) {  // 중복이 아니라면
				cardCase[count++] = one;
			}
			if (count == cardCase.length) { // 종료
				break;
			}
		}
		
	}

	private boolean duplicate(CardOne one, int count) { // true 중복
		boolean isc = false;
		for (int i = 0; i <count; i++) {
			if (cardCase[i].equals(one)) {
				isc = true;
				break;
			}
		}
		return isc;
	}

	public CardOne[] getCardCase() {
		return cardCase;
	}
	

}
