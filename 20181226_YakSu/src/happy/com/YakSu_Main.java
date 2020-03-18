package happy.com;

import java.util.Scanner;

public class YakSu_Main {
	
	//TODO 1. 약수 출력 메소드를 생성
	public static void main(String[] args) {
		YakSu_Ref yaksu = new YakSu_Ref();
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력해 주세요");
		int num = scan.nextInt();
		System.out.printf("입력받은 값: %d%n", num);
		yaksu.make(num);// 값을 입력 받음

	}

}
