package happy.com;

public class AccessModify_Class {
	
	/*
	 * 내부에서 자신이 가지고 있는 각각 다른 접근제한자를 호출
	 * 접근제한자에 상관없이 내 클래스에 있는 모든 메소드는 사용가능
	 */
	//TODO 1. 내부 메소드 연결
	public void InnerAccess() {
		publicMethod();
		protectedMethod();
		privateMethod();
		defaultMethod();
	}
	
	public void publicMethod() {
		System.out.println("난 퍼블릭이다.");
	}
	
	protected void protectedMethod() {
		System.out.println("난 프로텍티드 이다.");
	}
	
	void defaultMethod() {
		System.out.println("난 디폴트 이다");
	}
	
	private void privateMethod() {
		System.out.println("난 프라이베이트 이다.");
	}

}
