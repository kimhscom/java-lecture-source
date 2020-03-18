package happy.com;

public class ZMain {

	public static void main(String[] args) {
		ISuperClassA obj = new C();
		AbstractB ab = (AbstractB)obj;
		C c = (C)ab; // 문제없음
//		D d = (D)ab; // ClassCastException이 발생한다
		
		C cc = new C();
		AbstractB bb = cc;
		ISuperClassA aa = bb;
		
//		ISuperClassA aa = new ISuperClassA() {			
//			@Override
//			public void print() {}			
//			@Override
//			public void make() {}
//		};
//		C c = (C)aa;
//		D d = (D)aa;

	}
	
	// aa특성 ISuperClassA -> C D

}
