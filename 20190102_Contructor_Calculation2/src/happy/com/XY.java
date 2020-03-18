package happy.com;

public class XY {
	
	private int x;
	private int y;
	
	public XY(int x, int y) { // 생성자 오버로딩
		this.x = x;
		this.y = y;
	}
	
	
	
	public int getX() {
		return x;
	}



	public int getY() {
		return y;
	}



	public void xyPrint() {
		System.out.printf("x: %d, y: %d 입니다 \n",x,y);
	}

}
