package happy.com;

// Parents 클래스를 상속받아 사용한다.
public class Test extends Parents {
	
	public static int count = 1;
	
	// 블록 영역 출력시 가장 우선적으로 실행된다.
	// new를 사용했을 때 한번만 사용된다.
	static{
		count = count + 1;
		System.out.println(count);
	}
	
	{
		System.out.println("난 블록이야");
	}
	
	// 생성자 영역
	public Test() {
		System.out.println("난 Test의 생성자 이다.");
	}

}
