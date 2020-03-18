package happy.com;

public class AntQuiz {
	
	public void antQuizProcess(int stage) {
		String initval = "11";
//		System.out.println(initval); // 초기값 11만 출력
		for (int i = 0; i < stage; i++) {
			System.out.println(initval); // 생성된 수열을 출력
			initval = antQuizMake(initval);
		}
	}
	
	// Arguments로 계산해야될 수열 초기값을 입력 받음
	public String antQuizMake(String antVal) {
		String antResult = ""; // 누적 변수 : concatenate
		// 1. 비교할 초기값을 선언
		char init = antVal.charAt(0); // "11" = > '1'
		// 2. 비교할 값은 무조건 1개는 존재
		int cnt =1;
		
		// 범위 검색 : 입력 받은 문자열의 범위
		for (int i = 1; i < antVal.length(); i++) { // 0 1 // 초기값을 index 0번의 값은 사용
			if (init == antVal.charAt(i)) {
				cnt++;
			} else {
				// 3. 계산된 앞의 값을 누적
				antResult = antResult + init + cnt;
				init = antVal.charAt(i);
				cnt = 1;
			}
		} // for
		
		antResult = antResult + init + cnt;
		
		return antResult;
	}

}
