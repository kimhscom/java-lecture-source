package happy.com;

public class ShortCircute {
	
	// 논리연산자 판단 메소드
	public void check() {
		if (returnFalse() && returnTrue()) {
			System.out.println("TEST");
		}
	}
	
	public boolean returnFalse() {
		System.out.println("False");
		return false;
	}
	
	public boolean returnTrue() {
		System.out.println("True");
		return true;
	}

}
