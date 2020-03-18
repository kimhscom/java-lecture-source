package happy.com;

public class CardPrint_Main {

	public static void main(String[] args) {
//		System.out.println(new CardOne);
		CardCase cc = new CardCase();
		CardOne[] cards = cc.getCardCase();
		for (CardOne c : cards) {
			System.out.print(c+"\n");
		}

	}

}
