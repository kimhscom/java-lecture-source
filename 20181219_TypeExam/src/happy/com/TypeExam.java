package happy.com;

import javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction;

public class TypeExam {
	// int -> char
	public void exam01() {
		int n = 65;
		char c = (char)n;
		System.out.println(c);
		char cc = (int)(3.14);
	}
	
	public void exam02() {
		// char 연산
		// char -> int
		char c = 'a';
		int i = c; // 97
		
		// 'A'+2 -> 'C'
		// '9'-'0' -> 9
		
		// 1. +
		// 2. 'A' -> 65
		// 3. 65+2 => 67
		// 유니코드 표에서 67번째 있는 값을 찾습니다 'C'
		// char cc의 변수 담기에 됨.
		char cc = (char)('A' + 2);
		
		char nine = '9';
		char zero = '0';
		System.out.println((int)nine +":" + (int)zero);
		
		// 자바의 연산은 무조건(실수가 아닌 이상) int 연산이 발생
		int ii = (int)('9'-'0'); // 57-48 => 9
		int ii2 = ('9'-'0');
		byte ii3 = ('9'-'0'); // byte b = 127+1; // byte bb = 128;
		
		int iii = (int)('a'-'A'); // a => 97, A => 65		
	} // exam02
	
	public void exam03() {
		// 메소드 소개
		// char 숫자형 문자형 숫자(정수)로 바꾸는 방법
		// '1' -> 1
		int cal = (int)'1'; // 48
		int cal2 = '1' - 47; // => 1
		// char에 있는 숫자형 문자를 편하게 바꾸고 싶음
		// a -> 숫자로 변경 가능?
		
		// char의 숫자는 보이는 그대로 숫자로
		// 대소문자 a~z 까지는 10, 11, 12~35 증가
		// 그외에 특수 문자를 -1로
		// 출력됨
		int cg = Character.getNumericValue('A');
		System.out.println(cg);
		
	}
	
	public void exam04() {
		// 문자열 String
		// 문자열은 문자형이 여러개 뭉쳐있는 모양
		// "ant" -> 'a' 'n' 't'
		
		//?? "11" 숫자형 문자 -> 11 숫자로 변경
		//	"3.14" 실수형 문자 -> 3.14 실수로 변경
		// "apple" 문자열 문자형의 조합 -> 다시 문자형으로 쪼갤 수 있나
		
		int nn = Integer.parseInt("11"); //java.lang.String charAt()
		System.out.println(nn);
		
		//0. charAt();
		// 문자열에서 index번째 있는 문자를 가져오는거
		// 문자열에서 index번째 있는 문자를 char의 형태로 가져 옴
		
		String str = "11";
		// 1. 지금 나온 방법으로 푼다
		int calStr1 = str.charAt(0); // => 49
		int calStr2 = str.charAt(1); // => 49
		
		/*
		int cal = Character.getNumericValue(calStr1)*10 // 49 -> 49 - 48 => 1 -> 1 * 10 => 10 
				+ Character.getNumericValue(calStr2); // 49 -> 49 - 48 => 1 => 10 + 1 => 11
		
		//getNumericValue() : 
		
		// '0' -> 48 -> 48 - 48 => 0
		System.out.println(Character.getNumericValue('0'));
		// 48 -> '0' -> 48 -> 48-48 => 0
		System.out.println(Character.getNumericValue(48));
		*/
		
		
		
	}
}
