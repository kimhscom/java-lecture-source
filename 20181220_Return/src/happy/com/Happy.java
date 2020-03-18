package happy.com;

public class Happy {
	
	// 반환이 void 되어 있으면 메소드 실행 후 어떠한 값도 받을 수 없다
	public void make01() {
		
	}
	
	// 반환이 어떠한 타입으로 되어있다면 반드시 그 타입으로 반환 결과을 줘야 한다
	// 기본타입, 참조타입(JDK, User Define Class)
	public boolean isCheck() {
		return false;
	}
	
	public boolean checkSum() {
		boolean b = false;
		return b;
	}
	
	// 리턴은 아무리 넘기고 싶어도 딱 1개뿐이 못 사용한다.
	// 
	public Member getMember() {
		Member m = new Member();
		return m;
	}

}
