package happy.com;

import java.util.Arrays;
import java.util.Scanner;

// 32. ShallowCopy & DeepCopy -> 객체에서...
// 얕은 복사, 깊은 복사
// 얕은 복사 : 주소값을 복사
// 깊은 복사 : 객체의 내용을 새로 생성한 객체를 전달

public class ArrayCopy {

	public static void main(String[] args) {
//		array();
		
		int[] a = {10,20,30};
//		int[] b = {10,20,30};
		int[] b =a;
		System.out.println(Arrays.toString(a));
		b[0] = 100;
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(a));
		
	}
	
	public static void deepCopy() {
		// 객체를 내용을 복사해서 새로운 객체를 만들어 전달함
		// stack, heap(java.lang.Object clone()), memory 처리
	}
	
	public static void array() {
		// 33. 기본배열 <-> JSF(참조배열)
		// 기본배열은 Class가 있을까? 없습니다.
		// 타입에 맞춰 공간을 만듬 -> 추가 할 수 있을까? 없음
		int[] a = new int[3]; // int만 들어갈 수 있는 3개의 공간이 heap에 만들어 짐
		String[] s = new String[3];
		
		// 공간을 할당 하면서 값을 넣는것
		int[] b = {1,2,3};
		
		int[] c = new int[] {1,2,3};
		
		// array -> 객체(reference, hashcode)
		
		System.out.println(c.length); // 길이
		System.out.println(c[2]);
		c[0] = 100;
		
		Scanner scan = new Scanner(System.in);
		System.out.println(scan); // java.util.Scanner@16진수
		
		//java.lang.Object toString() => getClass().getName() + "@" + Interger.toHexString(객체.hashcode())
		System.out.println(c); // [I@16진수]
		
		// ** 기본배열은 class 없다. 기능이 없다
		// java.util.Arrays => 기능을 대신 해줌
		// Arrays.toString(c) => [1,2,3]
		
		System.out.println(Arrays.toString(c));
		
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		
		// 34. 향상된 for문 : 배열에서만 사용가능 //
		for (int n : c) { // 출력 타입 선언 : 배열
			
		}
		
	}
	
	public static void primary() {
		// 기본 타입 : 리터럴(값) 복사
		int a = 10; // 10값이 a 묶여있음
		int b = a; // a의 10이라는 값이 복사되서 b 묶여있음
		int c = a+20; // a의 10을 복사해서 20과 더해 c 묶음
		
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
	}

}
