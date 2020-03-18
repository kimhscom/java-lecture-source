package happy.com;

public class String_Main {

	public static void main(String[] args) {
		String_Method sm = new String_Method();
//		sm.charMethod();
//		sm.compareToMethod();
//		sm.concatMethod();
//		sm.containsMethod();
//		sm.equalsMethod();
//		sm.equalsIgnoreCasemethod();
//		sm.hashcodeMethod();
//		sm.indexOfMethode();
//		sm.isEmptyMethod();
//		sm.lengthMethod();
//		sm.matchMethod();
//		sm.replaceMethod();
		sm.trimMethod();
		
		// 오버로딩
		// 기능(메소드명)이 같지만, 사용되는 Arguments가 달라지기 때무에 만들냄
//		System.out.println(1);
//		System.out.println('a');
//		System.out.println("happy");
//		string_Feature();		
	} // main
	
	public static void string_Feature() {
		// 객체의 조건 : 주소, 해쉬코드
		String str1 = new String("real");
		String str2 = new String("real");
		System.out.println(str1==str2); // == 값(주소)
		System.out.println(str1.hashCode()); // 오버라이딩
		System.out.println(str2.hashCode());
	}

}
