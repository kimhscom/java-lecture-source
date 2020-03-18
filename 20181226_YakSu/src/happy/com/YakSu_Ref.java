package happy.com;

public class YakSu_Ref {
		
	// make()
	// TODO 2.약수를 연산(출력, 갯수, 합)
	public void make(int num) {
		int cnt = 0; // 갯수를 누적;
		int yaksuSum = 0; // 약수의 합을 누적
		String yaksuNumber = "약수 값들 : ";
		
		for (int i=1; i<num; i++) {
			if(isCheck(num,i)) { // 참이라면 약수, 거짓이라면 약수 아님
				cnt ++;
				yaksuSum += i;
				yaksuNumber += (i+"\t");
			}
		} // for
		System.out.println(cnt);
		System.out.println(yaksuSum);
		System.out.println(yaksuNumber);
	}
	
	
	//isCheck()
	// 약수여부 판단
	private boolean isCheck(int num, int i) {
		return (num%i==0)?true:false;
	}

}
