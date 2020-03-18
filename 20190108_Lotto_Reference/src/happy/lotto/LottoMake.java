package happy.lotto;

import java.util.Arrays;

public class LottoMake {

	// 맴버필드를 만드는 이유 1) 상위 변수 내 맴버의 모든 곳에서 사용가능
	//                                  2) 은닉화 (접근제한자 private)
	//                                  3) hashcode override

	private int[] lottoBox; // 배열의 크기를 외부에서 받아서 생성자를 통해 만듬

	public LottoMake() { // default 생성자
		this(6);
	}

	public LottoMake(int n) { // 오버로딩
		lottoBox = new int[n];
	}

	// 최종적으로 6개의 중복되지 않는 값을 저장한 배열을 가져감.
	public int[] getLottoBox() {
		return lottoBox;
	}

	// 랜덤숫자
	private int makeNum() {
		int n = 0;
		n = (int)(Math.random()*45)+1;
		return n;
	}

	// 중복체크
	private boolean isSame(int newNum) { // true 중복
		boolean isc = false;
		for (int i = 0; i < lottoBox.length; i++) {
			if (lottoBox[i]==newNum) {
				isc = true;
				break;
			}
		}
		return isc;
	}

	// lotto 생성
	public void lottoRow() {
		int lottoRowLen = 0;
		while (lottoRowLen < lottoBox.length) { // 무한반복
			int newNum = makeNum();
			if (!isSame(newNum)) { // true
				lottoBox[lottoRowLen++] = newNum;
			}

		}
	}
	
	public void lottoPrint() {
		int[] temp = lottoBox.clone();
		Arrays.sort(temp); // 오름차순 정리
		String[] result =  toExchange(temp);
		System.out.println(Arrays.toString(result));
	}
	
	private String[] toExchange(int[] temp) {
		String[] tempToString = new String[lottoBox.length];
		for (int i = 0; i < temp.length; i++) {
			if (temp[i]/10==0) {
				String s = "0"+temp[i];
				tempToString[i] = s;
			}else {
				tempToString[i] = String.valueOf(temp[i]);
			}
		}
		return tempToString;
	}



}
