package happy.com;

public class Child_One extends Parents_One {
	
	// 부모가 같은 이름이라도
	// private 되어 있다면 자식 클래식는
	// 그 이름의 메소드가 존재하는 지를 판단할 수 없다

	@Override
	public void make() {
		System.out.println("오버라이드");
	}

	// 부모의 메소드를 존재여부를 판단 할 수 있으나
	// 부모 클래스에서 final로 선언이 되어 있기 때문에 재정의 금지 이다.
	/*@Override
	public void print() {
		System.out.println("오버라이드");	
	}*/
	
	

}
