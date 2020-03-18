package happy.com;

public class HappyMain {

	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		System.out.println(t1); // hash값이 다르게 출력
		System.out.println(t2); // hash값이 다르게 출력
//		System.out.println(t1==t2);; // 출력된 hash값을 비교하여 동일하지 않아 논리 연산자 값인 false로 출력된다.
		System.out.println(Test.count);

	}

}
