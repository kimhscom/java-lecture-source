package happy.com;
// 완전수 : 어떠한 숫자의 진약수가 자신의 숫자가 되는 수
// 6 : 1 2 3 => 6
// 약수를 판단, 약수의 합, 완전수를 판단
public class Perfect_Number {
	
	int cnt = 0;
	//TODO 7. 완전수의 갯수, 완전수들을 출력
	public void perfectSummary(int stage) { // 범위
		for (int i = 2; i < stage; i++) {
			perfectchk(i);
		}
		System.out.printf("%d의 범위 중에서 완전수의 갯수는 %d",stage,cnt);
	}
	
	//TODO 5. 완전수 여부 판단
	private void perfectchk(int inputNum) {
		if (inputNum == yaksuSum(inputNum)) {
			System.out.printf("%d는 완전수로 판단된\n",inputNum);
			cnt++;
		}
	} // perfectchk
	
	//TODO 3. 약수 합 => 약수판단 메소드를 이용해서 만듬
	private int yaksuSum(int originNum) {
		// 누적 변수
		int yaksuSum = 0;
		for (int i = 1; i < originNum; i++) {
			if (isCheck(originNum, i)) {
				yaksuSum += i;
//				yaksuSum = yaksuSum + i
			}
		} //for
//		System.out.println(yaksuSum);
		return yaksuSum;
	}
	
	//TODO 1. 약수판단 메소드
	private boolean isCheck(int num, int val) {
		boolean isc = false;
		if (num % val == 0) {
			isc = true;
		}
	//System.out.println(isc);
		return isc;
	}//isCheck

}
