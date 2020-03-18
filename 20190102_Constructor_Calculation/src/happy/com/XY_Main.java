package happy.com;

public class XY_Main {

	public static void main(String[] args) {
		XY a = new XY();
		a.x = 10;
		a.y = 10;
		XY b= new XY();
		b.x = 20;
		b.y = 20;
		
		XY result = XY_Calculation.add(a, b);
		System.out.println(result.x);
		System.out.println(result.y);
	}

}
