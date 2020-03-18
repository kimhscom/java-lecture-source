package happy.com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Explain_Main {

	// 예외처리 하는 이유 : 코드에서 발생된 (정상적인 흐림이 아닌) 문제점의 내용을 출력 해줌
	public static void main(String[] args) {
		while (true) {
			// java.lang.ArithmeticException: / by zero <- 이거 뭐임?
			// java.util.InputMismatchException <- 이건 또 뭐임?
			try {
				int result = 0;
				result = scan()/scan();
				System.out.println(result);
				break;
			} catch (ArithmeticException | InputMismatchException e) {
				System.out.println("다시 입력하세요");
			}finally {
				// System.out.println("무조건 실행");
			}
		}
	}


	// 예상되는 예외 : 사용자가 숫자가 아닌 값을 입력을 했을경우
	// -> InputMisMatchException
	public static int scan() {
		int n = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력해 주세요");
		n = scan.nextInt();
		return n;
	}

}
