package happy.com.comm;

public class DoubleXY {
	
	private double x;
	private double y;
	
	public DoubleXY() { // default 생성자
		inputMember();
	}
	
	public void inputMember() {
		System.out.println("x, y 값을 차례대로 입력해 주세요");
		x = InputVal.inputDoubleVal();
		y = InputVal.inputDoubleVal();
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

}
