package happy.com;

// SingleTon Design pattern
// heap에 객체를 단 1회 생성하는 방법
public class Single {
	
	// 값, 주소는 무조건 Heap에 존재하지만
	// 값 혹은 객체를 사용하기 위해서 반드시 변수에 담겨어야 함
	// 자신의 객체가 메모리에 할당 된다면 그 주소는 묶여 있는 변수
	
	private static Single single; // 타입을 static으로 했기때문에 new할 필요없음 
	
	private Single() { // default 생성자
		System.out.println("생성자 Single 호출");
	}
	
	/*
	 * single이 자기자신이 null인 상태이므로
	 * 자기자신이 새로운 인스턴스를 호출할 수 있게
	 * 메소드를 추가함
	 */
	public static Single getInstance() {
		if (single==null) {
			single = new Single();
		}
		return single;
	}
	
	public void print() {
		System.out.println("출력");
	}

}
