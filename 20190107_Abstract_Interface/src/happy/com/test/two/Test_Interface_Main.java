package happy.com.test.two;

import happy.com.Interface_One;
import happy.com.Interface_Two;
import happy.com.test.Implements_Interface;

public class Test_Interface_Main {

	public static void main(String[] args) {
//		Implements_Interface ii =new Implements_Interface();
//		ii.make();
//		ii.print();
		// 인터페이스를 안에 접근제한자는 차이가 없다 작동이 되느냐 안되느냐에 차이.
		
		Interface_One o = new Implements_Interface();
		Interface_Two t = new Implements_Interface();
		o.make();
		o.print();
		
		t.make();
		t.process();
		
		System.out.println();
// o.A //static final		
		// 상속은 무조건 extends
		// implements는 무조건 interface를 받는 것

	}

}
