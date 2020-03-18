package happy.com;

public class Separate {
	
	static int n;
	
	public  Separate(int n) { // 전체 층수
		this.n=n;
	}
	
	public  void LoopCtrl() { // 순환 제어 위에서 아래로 순서대로 작동
		for (int i = 1; i < n; i++) { // 위에
			picture(i);
		}
		for (int i = n; i > 0; i--) { // 아래
			picture(i);
		}
	}
	
	public  void picture(int i) {
		for (int j = 0; j < (n-i); j++) { // 공백 (전체 층수-현재 층수)
			System.out.print("◇");
		}
		for (int j = 0; j < (2*i)-1; j++) { // 그림 ((2*현재 층수)-1)
			System.out.print("◆");
		}
		for (int j = 0; j < (n-i); j++) { // 공백 (전체 층수-현재 층수)
			System.out.print("◇");
		}
		System.out.println();
	}

}
