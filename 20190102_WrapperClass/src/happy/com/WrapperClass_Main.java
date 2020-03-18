package happy.com;

public class WrapperClass_Main {

	public static void main(String[] args) {
		int a =10;
		Integer aa = new Integer(10);
		
		double d= 3.14;
		Double dd = new Double(3.14);
		
//		System.out.println(a==aa);
		System.out.println(a==d);
		// heap은 서로 생성된 Class가 다르다면 비교 대상이 되지 않는다
//		System.out.println(aa==dd); 
		
		int i = 100;
		Long l = new Long(200);
		
//		i = (Integer)l;
//		i =(int) l.longValue();
		
		Integer val = 10; // new Integer(10);
		System.out.println(val.MAX_VALUE);
		System.out.println(val.MIN_VALUE);
		
		Integer.parseInt("11");
		
		int valInt = val; // 참조타입에서 기본타입 : (auto)Unboxing
		Integer valInteger = valInt; // 기본타입에서 참조타입 : (auto)Boxing
		
		Integer kval = new Integer(100); // 참조타입 선언
		int kkval = kval.intValue(); // 참조타입 기본타입으로 변환하는 메소드 사용
		
		// 결론 :  기본타입의 Warpper는 기본타입의 형변환처럼 되지 않는다
		// 			참조 -> 기본 Unboxing , 기본 -> 참조 Boxing
		
		// Interger -> Double
		Integer u = new Integer(55); // 참조타입 선언
		int uu = u.intValue(); // heap 객체의 값을 stack으로 전환
		double ud = uu; // stack에서 기본타입(형태) 형변환
		Double uD = ud; // double의 Wrapper로 참조타입으로 변환
		
		double uud = uD.doubleValue(); // Double 참조타입을 stack으로 전환
		int du = (int)uud; // 기본타입(형태) 형변환
		
	}

}
