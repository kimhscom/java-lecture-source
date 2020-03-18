package happy.com;

public class XY_Calculation {
	
	public static XY addXY(XY a, XY b) {
		return new XY(a.getX()+b.getX(), a.getY()+b.getY());
	}

}
