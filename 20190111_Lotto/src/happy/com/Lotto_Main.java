package happy.com;

import java.util.Arrays;

public class Lotto_Main {

	public static void main(String[] args) {
		
//		int[] m = new int[] {1, 6, 3, 4, 2};
//		System.out.println(" 정렬 전 : " + Arrays.toString(m));
//		SortBubble.bubble(m);
//		System.out.println(" 정렬 후 : " +Arrays.toString(m));
		
		LottoGame lg = new LottoGame();
		lg.lottoPlayer();

	}

}
