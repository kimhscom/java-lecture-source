package happy.com;

import java.util.Scanner;

public class FactoryClass {

	private static FactoryClass factory;
	private FactoryClass() {}
	public static FactoryClass getInstance() {
		if (factory == null) {
			factory = new FactoryClass();
		}
		return factory;
	}

	public int factory() throws JinSooksException {
		int val = 100;
		int n = inputVal();
		if (n==1 || n==10) {
			throw new JinSooksException("유효하지 않은 값을 입력함");
		}
		return val;
	}

	private int inputVal() {
		int n = 0;
		while(true) {
			try {
				System.out.println("입력하세요");
				Scanner scan = new Scanner(System.in);
				n = scan.nextInt();
				break;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return n;
	}

}
