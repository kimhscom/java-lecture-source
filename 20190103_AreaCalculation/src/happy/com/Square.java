package happy.com;

public class Square extends Area_Comm {

	public Square(double x, double y) {
		super(x, y);		
	}

	@Override
	public void make() {
		result = x*y;
	}
	
	

}
