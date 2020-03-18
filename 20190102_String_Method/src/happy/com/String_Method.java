package happy.com;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class String_Method {
/*
* charcharAt(int index) 
* Returns the char value at the specified index.
* 문자열 생성 index번호를 부여
* ex) happy 앞쪽부터 0시작 해서 번호를 부여
* 	h:0 a:1 p:2 p:3 y:4
*/
	public void charMethod() {
		String str = "hapPy";
		char c = str.charAt(3); // P:3
		System.out.println(c);
		System.out.println((int)c);
	}
	/*	
	* int compareTo(String anotherString) 
	* Compares two strings lexicographically.
	* 두개의 문자열을 비교 사전적으로 비교
	* a == a, a==A, a-A 차이값을 반환해 줌
	* 
	*/
	public void compareToMethod() {
		String str1 = "cow";
		String str2 = "row";
		
		int n = str1.compareTo(str2);
		System.out.println((int)'c'); // 99
		System.out.println((int)'r'); // 114
		System.out.println(n); // -15
		
		/*
		 * int compareToIgnoreCase(String str) 
		 * Compares two strings lexicographically, ignoring case differences.
		 */
		String str3 = "hapPy";
		String str4 = "happy";
		int compareToNum = str3.compareTo(str4);
		int IgnoreNum = str3.compareToIgnoreCase(str4);
		System.out.println(compareToNum);
		System.out.println(IgnoreNum);
	}
	
	/*
	 * String concat(String str)
	 * Concatenates the specified string to the end of this string.
	 */
	
	public void concatMethod() {
		String str0 = "happy.com";
		String str1 = "happy";
		String str2 = ".com";
		String str3 = "etc";
		
		//** String 메소드 중에서 반환타입이 String인 것은
		// 무조건 new String() 생성하여 반환한다
		
		// happy + .com + etc
//		String concat = str1.concat(str2).concat(str3);
		String concat = str1.concat(str2);
		System.out.println(str0 == concat);
		
	}
/*
 * boolean contains(CharSequence s)
 * Returns true if and only 
 * if this string contains the specified sequence of char values.	
 */
	
	public void containsMethod() {
		String str1 = "wait's no more time";
		
		boolean isc = str1.contains("more");
		boolean isc2 = str1.contains("k");
		System.out.println(isc);
		System.out.println(isc2);
	}

/*
boolean equals(Object anObject) 
Compares this string to the specified object.
문자열을 비교할 때 사용한다 X 외우지 마세요
equals 객체의 해쉬코드를 비교함
*/

	public void equalsMethod() {
		String str1 = "happy";
		String str2 = new String("happy");
		String str3 = "happy";
		
		System.out.println(str1==str2); // 기본타입 값을 비교 / 객체 주소 비교
		System.out.println(str1.equals(str2)); // hashcode
		
		// 분석결과 : 문자열은 생성이 되면 새로운 객체로 만들어 지면서
		// 				 ref를 부여 받지만 값이 같다면 hashcode를 갖는다.
		
		System.out.println(str1==str3); // 기본타입 값을 비교 / 객체 주소 비교
		System.out.println(str1.equals(str3)); // hashcode
		
		// 분석결과 : 문자열을 생성시 new로 생성한 객체와 그냥 생성한 객체 다르다.
	}
	
	public void equalsIgnoreCasemethod() {
		String str1 = "happy";
		String str2 = "Happy";
		String str3 = new String("happy");
		
		System.out.println(str1==str2); //false // h와 H는 다르기 때문에
		System.out.println(str1.equalsIgnoreCase(str2)); // 대소문자를 구분하지 않고 hashcode를 비고 true
		System.out.println(str2.equalsIgnoreCase(str3)); // new와 new 하지 않은 객체 hashcode / true
		
	}
	
	/*
	 * int hashCode() 
	   Returns a hash code for this string.
	   객체가 가지고 있는 고유한 값
	   모든 java 최상위 부모인 java.lang.Object의 클래스가 부여 해줌
	   String은 값으로 Hashcode를 재정의해서 사용함
	 */
	
	public void hashcodeMethod() {
		String str1 = "happy";
		Scanner scan = new Scanner(System.in);
		// wrapper class // 기본타입에 대입되는 참조타입
		// int <-> Integer, char <-> Character // autoBoxing, autoUnBoxing
		Boolean isc = new Boolean(true);
		
		System.out.println(str1.hashCode());
		System.out.println(scan.hashCode());
		System.out.println(isc.hashCode());
		
	}
	
	/*
	 * int indexOf(String str) 
	   Returns the index within this string of the first occurrence of the specified substring.
	   문자열 중에서 char, str, (int)char 검색해서 해당 문자의 위치를 index번호로 반환
	   없다면 ? 뭘 반환할까? 검색 값이 없다면 -1을 반환한다
	 */
	
	public void indexOfMethode() {
		String str1 =  "happy@happy.com";
		// @를 찾아보자
		int n1 = str1.indexOf("@");
		System.out.printf("@의 위치 %d \n", n1);
		int n2 = str1.indexOf("h");
		System.out.printf("h의 위치 %d \n", n2);
		int n3 = str1.lastIndexOf("h");
		System.out.printf("뒤쪽 h의 위치 %d \n", n3);
		
	}
	
	/*
	 * boolean isEmpty() 
	   Returns true if, and only if, length() is 0.
	 */
	
	public void isEmptyMethod() {
		String str1 = "happy";
		String str2 = "";
		String str3 = null;
		
		boolean isc1 = str1.isEmpty();
		boolean isc2 = str2.isEmpty();
//		boolean isc3 = str3.isEmpty();
		
		System.out.println(isc1);
		System.out.println(isc2);
//		System.out.println(isc3);
		
	}
	/*
	 * int length() 
	   Returns the length of this string.
	   문자열의 길이를 반환함
	 */
	public void lengthMethod() {
		// 길이를 표현할 수 있는 메소드 3개있음
		// 문자열의 길이 : length()
		// 배열의 길이 : length
		// JCF 길이 : size();
		
		String str = "happy"; // String 선언
		String[] strArray = {"happ","y",".com"}; // 배열 선언
		ArrayList<String> jcfArray = new ArrayList<String>(); // JCF(List) 선언
		jcfArray.add("kor");
		jcfArray.add("happy");
		
		System.out.println(str.length());
		System.out.println(strArray.length);
		System.out.println(jcfArray.size());
	}
	
	/*
	 * boolean matches(String regex) 
	   Tells whether or not this string matches the given regular expression.(정규화 표현식)
	 */
	
	public void matchMethod() {
		String strMail = "happy@naver.com";
		String regex = "^[_a-z0-9-]+(.[_a-z0-9-]+)*@(?:\\w+\\.)+\\w+$";   
		boolean isc = strMail.matches(regex);
		System.out.println(isc);
	}
	
	/*
	 * String replace(char oldChar, char newChar) 
	   Returns a string resulting from replacing all occurrences of oldChar in this string with newChar.
	 */
	
	public void replaceMethod() {
		// String은 참조타입 기본타입의 특성을 갖는다 따라서
		String str = "happy"; // immutable(불변성) : 새로운 값을 입력하기 전에 그 값을 유지
		String strChange = str.replace("ha", "pu"); // 원본값이 변경이 되는 것이 아니라 새로운 객체(new String(으로 반환))
		System.out.println(str);
		System.out.println(strChange);
	}
	
	/*
	 * String trim() 
	   Returns a string whose value is this string, with any leading and trailing whitespace removed.
	 */
	
	public void trimMethod() {
		String str = "	happ		y		";
		String strBlank = "　	happ		y		　";		
		System.out.println((int)(' ')); // white space는 space bar 한칸을 이야기 한다.
		String strSpace = str.trim();
		String strBlankTrim = strBlank.trim();
		
		System.out.println(strSpace);
		System.out.println(strBlankTrim);
	}

	
}