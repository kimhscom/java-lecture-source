package happy.com;

public class SingleMain {

	public static void main(String[] args) {
//		Single a = new Single();
//		Single b = new Single();
		Single a = Single.getInstance();
		Single b = Single.getInstance();
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		a.print();
		b.print();

	}

}
