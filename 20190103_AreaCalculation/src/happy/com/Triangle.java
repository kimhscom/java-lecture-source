package happy.com;

public class Triangle extends Area_Comm {

	public Triangle(double x, double y) {
		super(x, y);		
	}

	@Override
	public void make() {
		result = (x*y)/2;
	}
	
	

}
