package happy.com;

public class Circle extends Area_Comm {
	
	public Circle(double x, double y) {
		super(x, y);
	}

	@Override
	public void make() {
		result = Math.PI*x*y;
	}
	
	

}
