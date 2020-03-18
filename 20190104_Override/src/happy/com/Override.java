package happy.com;

public class Override extends Parents {
	
	@java.lang.Override
	public void make() {
		super.make();
		System.out.println("자식의 메소드 make");
	}

}
