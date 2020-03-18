package happy.com;

public class Constructor {
	
	int n = 0;
	
	static {
		System.out.println("난 스태틱 생성자");
	}
	{
		n = 200;
		System.out.println("난 연산이다."+n);
	}
	
	// default 생성자
	public Constructor() { // 생성자
		n = 10000;
		System.out.println("난 생성자이다."+n);
	}
	
	public Constructor(int n) {
		
	}

}
