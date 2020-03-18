package happy.com;

public class Common_Class {
	
	public static int n = 10;
	
	//TODO 4. nonstatic에서 static 호출
	public void make() {		
		System.out.println("non static");
		glass();
		view();
	}
	
	public void view() {
		
	}
	
	public static void glass() {
		System.out.println("static");
	}

}
