package util.happy;

import java.util.Scanner;

/**
 * 
 * @author 김현수
 * @since 20181226
 * @version 1.0a
 *
 */
 
public class Happy_Input {
	 
	 /**
	  * Scanner를 사용하여 Int값을 반환<br>
	  * 예외처리 없음
	  * @return 정수값
	  */
	
	public static int StageInput() {
		int n = 0;
		Scanner scan = new Scanner(System.in); // 키보드로 입력 받는다
		n = scan.nextInt();
		System.out.println("키보드로 입력 받은 값"+n);
		scan.close();
		return n;
	}

}
