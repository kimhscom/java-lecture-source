package happy.com;

public class String_Compare {
	
	public void string_one() {
		// str1, str2의 값은 Spring Pool
		// 같은 값을 가지고 있다면 String Pool 같은 값이 연결되어 있다.
		String str1 = "Bloom";
		String str2 = "Bloom";
		
		System.out.println("그냥 생성 & 값이 같을 때 : "+(str1==str2)); // true
	}
	
	public void string_two() {
		String str1 = "Bl";
		String str2 = "oom";
		
		String str3 = "Bloom";
		
		String strAdd = str1+str2;
		String strAdd2 = "Bl"+"oom";
		
		System.out.println(str3==strAdd);
		System.out.println(str3==strAdd2);		
		
	}
	
	public void string_three() {
		String str1 = "Bloom"; // String Pool
		String str2 = new String(); // ""
		String str3 = new String("Bloom"); // String Pool "Bloom" 주소
		
		System.out.println(str2);
		System.out.println("str2 \"\"의 hashcode  : "+str2.hashCode());
		System.out.println("new str2 \"\"의 hashcode :" + System.identityHashCode(str2));
		
		// == 비교하는 것 기본타입 값(리터럴), 참조타입 주소
		System.out.println(str1 == str3);
		
		// str1.hashcode() -> String Pool에 "Bloom"; hashcode
		// str3.hashcode() -> Heap영역에 있는 "Bloom"의 주소가 들어 있는" 객체 hashcode
		System.out.println(str1.hashCode());
		System.out.println(str3.hashCode());
		
		System.out.println(str1.hashCode() == str3.hashCode());
		
		// java.lang.Stirng intern
		System.out.println(str1.intern() == str3.intern());
				
	}
	
	public void string_four() {
		String str1 = "엘베";
		String str2 = new String("엘베");
		
		// 표면적인 hashcode
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		// Spring Pool 생성 "엘베의 원래 hashcode"
		System.out.println(str2.intern().hashCode());
		System.out.println(str1.intern().hashCode());
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}

}
