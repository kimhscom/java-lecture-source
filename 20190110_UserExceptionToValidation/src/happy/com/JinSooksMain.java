package happy.com;

public class JinSooksMain {

	public static void main(String[] args) {
		FactoryClass f = FactoryClass.getInstance();
		while (true) {
			try {
				f.factory();
				break;
			} catch (JinSooksException e) {
				e.printStackTrace();
			}

		}
	}

}
