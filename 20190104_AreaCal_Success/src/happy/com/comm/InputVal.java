package happy.com.comm;

import java.util.Scanner;

/**
 * 계산 시스템에서 키보드로 입력 받을 수 있도록 하는 클래스
 * @author 김현수
 *
 */
public class InputVal {
	
	public static int inputIntVal() {
		int num = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 값을 입력해 주세요");
		num = scan.nextInt();
		return num;
	}
	
	public static double inputDoubleVal() {
		double num = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("실수 값을 입력해 주세요");
		num = scan.nextDouble();
		return num;
	}

}
