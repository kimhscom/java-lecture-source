package happy.com;

import java.util.Arrays;

public class Ref_Main {

	public static void main(String[] args) {
		int[] originArray = {1,2,3,4}; // originArray 값
		int[] copyArray = originArray; // originArray 복사값
		int[] cloneArray = originArray; // originArray 복사값
		
		System.out.println(Arrays.toString(originArray)); // originArray의 주소대신 값으로 표현
		
		copyArray[0] = 100; // 첫번째 값 100으로 바꿈 / 자동으로 오버라이드 됨
		System.out.println(Arrays.toString(originArray));
		
		cloneArray[0] = 200; // 첫번째 값 200으로 바꿈 / 자동으로 오버라이드 됨
		System.out.println(Arrays.toString(originArray));

	}

}
