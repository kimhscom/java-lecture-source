package happy.com;

public class StringMain {

	public static void main(String[] args) {
		// String 참조 타입
		// 선언 방법은 :
		// String str = "금요일", String str1 = new String("금요일")
		// String 문자열은 문자형이 조합되어 있는 참조타입 
		// -> 문자열은 문자형으로 쪼개질 수 있음
		// -> 문자형으로 문자열로 조합이 가능함
		
		String str1 = "Happy";
		String str2 = "Happy";
		String str3 = new String("Happy"); // A a = new A();
		
		char[] charStr1 = str1.toCharArray();
		for (int i = 0; i < charStr1.length; i++) {
			System.out.println(charStr1[i]);
		}
		
		char[] charString = {'s','m','i','l','e'};
		for (int i = 0; i < charString.length; i++) {
			System.out.println(charString[i]);
		}
		
		String str4 = new String(charString);
		System.out.println(str4);
		
		int n = 10;
		char c = 'A';
		String strTemp = "";
		
		System.out.println(n+c+strTemp); // "75"
		System.out.println(strTemp+n+c); //"10A"
		System.out.println(strTemp.charAt(0));

	}
	
	
}

