package happy.com;

public class XY_Main {

	public static void main(String[] args) {
		XY a = new XY(10, 10);
		XY b = new XY(100, 200);
		XY result = XY_Calculation.addXY(a, b);
		result.xyPrint();
	}

}
