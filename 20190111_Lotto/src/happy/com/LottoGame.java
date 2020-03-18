package happy.com;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LottoGame {

	int gameCount; // 몇줄의 lotto를 만들어 낼지 입력하는 변수
	int nums; // 배열의 크기
	private int[] lotto; // 최종적으로 담길 배열

	public int[] getLotto() { // 다른 클래스나 메소드에서 반환된 값을 받을 때 사용
		return lotto;
	}

	public LottoGame() {
		this.gameCount = 5;
		this.nums = 6;
		lotto = new int[this.nums];
	}

	public LottoGame(int gameCount, int nums) {
		super();
		this.gameCount = gameCount;
		this.nums = nums;
		lotto = new int[this.nums];
	}

	public LottoGame(int gameCount) {
		super();
		this.gameCount = gameCount;
		this.nums = 6;
		lotto = new int[6];
	}
	public void lottoPlayer() {
		for (int i = 0; i < gameCount; i++) {
			lottoMake(); // 로또생성
			lottoPrint(); // 출력
		}
	} // lottoPlayer
	
	private void lottoPrint() {
		SortBubble.bubble(lotto);
		//Arrays.sort(lotto);
		
		// 출력
		System.out.println(Arrays.toString(lotto));
		
//		System.out.printf("[%d,",lotto[0]);
//		for (int i = 0; i < lotto.length; i++) {
//			System.out.printf("%d,",lotto[i]);
//		}
//		System.out.printf("%d]", lotto[lotto.length-1]);
		
//		String result = "";
//		result += String.format("[%d,", lotto[0]);
//		for (int i = 0; i < lotto.length-1; i++) {
//			result += String.format("%d,",lotto[i]);
//		}
//		result += String.format("%d]", lotto[lotto.length-1]);
//		System.out.println(result);
		
	}

	private void lottoMake() {
		int count = 0;
		RamdomNum rn = new RamdomNum();
		while (true) {
			int newNum = rn.lottoN();
			// 중복검사 후에 값 입력 lotto[]
			if (!isCheck(newNum)) {
				lotto[count] =newNum;
				count++;
			}
			if(count==nums) {
				break;
			}
		}
	}
	
	private boolean isCheck(int newNum) { // 중복 이면 true
		boolean isc = false;
		for (int i = 0; i < lotto.length; i++) {
			if (lotto[i]==newNum) {
				isc = true;
			}
			
		}
		
		return isc;
	}

}
