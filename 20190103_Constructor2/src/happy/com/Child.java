package happy.com;

public class Child extends Parents {
	
	public int n;
	
	// 2
	public Child() {
		// 3
		super(10); // 무조건 생성자가 출력보다 우선이다
		// 5
		System.out.println("난 Child 생성자"+super.n);
		// 6
		this.print();
	}
	
	public void print() {}

	// 10
	@Override
	public void make() {
		// 11
		System.out.println("오버라이드");
		// 12
		super.make();
	}

	
}
