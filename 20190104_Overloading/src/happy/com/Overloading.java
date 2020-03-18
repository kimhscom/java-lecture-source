package happy.com;

public class Overloading extends Parentes {
	
	public void print(int n) {
		System.out.println("오버로딩");
	}
	
	public void print() {
		System.out.println("오버라이딩");
	}
	
	public void make() {
		super.print(); // 부모의 메소드
		System.out.println("메이크 메소드");
	}
	
	public void make(int n) {
		System.out.println("메이크 메소드"+n);
	}
	
	private String make(int n, String s) {
		
		return null;
	}

}
