package happy.com;

public class Area_Comm {
	
	protected double x; // 가로
	protected double y; // 세로
	protected double result; // 결과
		
	public Area_Comm(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void make() { // 계산을 하는 메소드
		System.out.println("계산이 되어야 함");
	}
	
	public void print() {
		System.out.printf("계산된 면적은? %f", result);
	}

}
