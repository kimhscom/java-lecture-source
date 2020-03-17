package happy.com;

/*
 * 8. 형변환
 * - 형태를 변환할 수 있는 코드를 이야기 함
 * - 크기에 대한 형변환, 형태 형변환
 * - 작은 곳에서 큰 곳으로 변환 promotion 자동으로 발생
 * - 큰 곳에서 작은 곳으로 변환 lose 값이 발생 casting
 * -- 정수에서 실수 변환 promotion
 * -- 실수에서 정수 변환 casting
 * 
 * @char 값의 형태 'A' ->index 값인 정수 65
 * 
 *  %%%% 주의 사항 값이 리터럴이냐 아니면 값이 선언되어 있는 변수
 */
public class TypeCalculation {
	
	public void charPractice() {
		// 문자형 하나의 구성 요소로 되어 있습니다.
		// Apple 문자열 참조타입 -> 'A','p','p','l','e'
		// Unicode 표
		// 정수로 변환이 가능함
		
		int a = 65;
	    char c = (char) a; // 값이 담겨있는(변수)에 있다면 casting, 리터럴 이라면 그냥 사용
	    int ca = 'A';
	    System.out.println("int의 값을 char(문자형)으로 변환 : "+c);
	    System.out.println("문자형은 자동으로 숫자로 변경"+ca);
		
	    // 엔터 13, space bar(?), 대문자A :65, 소문자 : 9~
	    for (int i = 0; i < 101; i++ ) {
	    	System.out.println(i +":" +(char)i);
	    }
	}
	
	public void calDouble() {
		// java의 기본 연산은 int 연산이 발생 한다
		// 하지만 분자 혹은 분모가 실수인 경우는 실수 연산이 된다.
		double d1 = 10;
		double d2 = 4;
		double dCal01 = d1/d2;
		System.out.println(dCal01);
		
		int i1 = 10;
		int i2 = 4;
		float fCal01 = i1/i2; // 2.0 // 결과는 int 연산에 의해서 2 promotion에 의해서 2.0으로 변환
		
		long l1 = 10l;
		long l2 = 4l;
		float fCal02 =l1/l2;
//		float fCal03 =1200000000000000000000l;
		int inputVal 	= Integer.MAX_VALUE;
		long inputVal1 = Long.MAX_VALUE;
		float fCal03 = inputVal;
		float fCal04 = inputVal1;
		
		System.out.println(inputVal);
		System.out.println(inputVal1);
		System.out.println(fCal03); // int -> float
		System.out.println(fCal04); // long -> float
		
//		System.out.println(Double.MAX_VALUE);
//		System.out.println(Double.MAX_VALUE+1000);
//		System.out.println(Float.MAX_VALUE);
		
	}
	
	
	public void calDigit() {
		byte b = 127; // -128 ~ 127
//		byte bMax = 128; // 리터럴은 선언되어 있는 타입의 크기에 영향을 받음
//		byte bCalMax = 127+1; // 리터럴은 먼저 연산이 되면 결과가 리터럴
		
		byte c= 1;
		
		int bcSumInt = b+c;
//		byte bcSum = b+c; // 자바의 연산은 무조건 int 연산
		// b와 c가 int 형태로 변환되어 계산됨, 그 결과를 byte의 크기에 넣어 줌
		// Casting (강제 형변환)
		// (byte) 캐스팅 연산자
		byte bcSum = (byte)(b+c); // 자바의 연산은 무조건 int 연산 // -128
		System.out.println(bcSum);
		
		// Promotiona(자동 형변환)
		byte inputVal = 10; // byte < short < int < long
		short inputShort = inputVal;
		int inputInt = inputShort;
		long inputLong = inputInt;
		
		// Casting
		long outputLong = inputLong;
		int outputInt = (int)outputLong;
		byte outputByte = (byte)(short)(int)(long)outputLong;
		
		// 선언: 값(주소)을 변수(객체명)에 크기에 맞춰 넣어 주는 작업
		int aa, bb, cc = 10; // cc만 값 10을 가짐, 나머지 값은 0
		
	}
}
