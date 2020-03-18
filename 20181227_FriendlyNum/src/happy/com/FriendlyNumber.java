package happy.com;

// 친화수란 A의 진약수의 합이 B가 되고 B의 진약수 합이 A가 되는수
// 220 284
public class FriendlyNumber {
	
	//TODO 3. 이중 for문 없이 완전수 제거
	public void friendlyNumProcess(int area) {
		long starTime = System.currentTimeMillis();
		for (int i = 2; i < area; i++) {
			int a = i; // 220
			int b = yaksuSum(a); // 284
			int c = yaksuSum(b); // 220
			if (a!=b && a<b && a==c) {
				System.out.printf("%d와 %d는 친화수로 판단됨\n",a,b);
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - starTime);
		
//		for (int i = 2; i < area; i++) {
//			for (int j = 2; j < area; j++) {
//				if (i!=j && i==yaksuSum(j) && yaksuSum(i)==j) {
//					System.out.printf("%d와 %d는 친화수로 판단됨\n",i,j);
//				}
//			}
//		}
	}
	
	//TODO 2. 입력받은 수의 약수 합
	public int yaksuSum(int inputNum) {
		int sum = 0;
		for (int i = 1; i < inputNum; i++) {
			if (isCheck(inputNum, i)) {
				sum += i;
			}
		}
		return sum;
	}
	
	//TODO 1. 약수 판단 메소드
	// true 약수
	public boolean isCheck(int num, int n) {
		boolean isc = false;
		if(num%n==0) {
			isc = true;
		}
		return isc;
	}

}
