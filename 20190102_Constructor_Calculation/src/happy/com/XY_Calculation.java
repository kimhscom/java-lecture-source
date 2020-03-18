package happy.com;

public class XY_Calculation {
	
	public static XY add(XY a, XY b) {
//		XY addResult = null;
		XY addResult = new XY();
		addResult.x = a.x+b.x;
		addResult.y = a.y+b.y;
		return addResult;
	}

}
