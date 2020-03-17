package happy.com;

// 타입에 관련된 선언방법, 연산 등을 정의 혹은 테스트하는 클래스
public class TypeProcess {
	
	public void typePractice02() {
		// char
		// char 특징 unicode 표를 따라서 작성이 되어 있음
		// 리터럴은 '\u0000'로 작성한다
		// char는 값을 하나만 갖는다 'AB'
		// 정수형의 index 값을 변환이 가능하다
		
		char a = 'A'; // unicode의 값
		char c = '\u0005'; // 리터럴
		int aInt = a;
		char cc = 65;
		
		System.out.println("문자형 A" + a);
		System.out.println("리터럴 \u0005" + c);
		System.out.println("A의 index값 정수" + aInt);
		System.out.println("65의 char값" + cc);
		
	}
	
	public void typePractice01() {
		// 실수, 논리형
		double d = 3.14;
		float f = 3.14f; // 실수 리터럴 값에 f를 선언하여 float크기의 리터럴로 변경
		
		boolean isCheck = true;
//		boolean isc = 0; // java에서만 되지 않음
//		System.out.println(isCheck+1); // 타입 혹은 형태가 다르면 연산이 되지 않음
		
	}

	public void typePractice() {
		//기본 타입
		/*
		 * 8개
		 * byte, short, int, long => 정수형
		 * float, double => 실수형
		 * boolean => 논리형
		 * char => 문자형
		 */
		
		// 선언 : 값(주소)을 변수(객체명)에 크기에 맞춰 넣어 주는 작업
		// 정수 10의 값을 int 타입으로 a라는 변수에 넣어 주세요 // int a = 10;
		
		// 각각의 java 타입을 선언해 보자
		int i = 10; // 리터럴 10진수
		int iBinary = 0b1010;
		int iOcta = 012;
		int iHexa = 0xA;
		System.out.println("10진수"+i);
		System.out.println("2진수"+iBinary);
		System.out.println("8진수"+iOcta);
		System.out.println("16진수"+iHexa);
		
	}// typePractice
}
