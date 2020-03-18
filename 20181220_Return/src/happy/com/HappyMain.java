package happy.com;

public class HappyMain {
	
	/*
	 * 1. 반환이 되어야 할 메소드 인지 아닌지를 판단
	 * 2. 반환이 안된다면 void 처리
	 * 	or
	 * 	반환이 필요하다면 반환되는 값의 타입을 선언 int
	 * 3. 메소드 내에서 반환되는 타입을 선언 및 초기값을 초기화 함
	 * 4. return을 작성하고 선언된 타입을 작성함
	 * 5. 연산을 작성 후 선언된 변수에 입력함
	 */

	// 커피자판기 커피가 반환(500입력 받았음 커피는 400임)
	public 커피 커피자판기() { // 반환타입 작성 1
		커피 c = null; // 초기값 선언 2
		c = new 커피(); // 연산 4
		return c; // 리턴 3
	}
	
	public static void main(String[] args) {
		// 메소드 실행시 확인사항
		// 메소드가 인자를 필요로 하는지 확인
		// ex) Character.getNumericValue(ch)
		// 그 값을 전달해 줌(arguments)
		// 반환타입이 있는 메소드 실행 후 반드시 같은 타입으로 받아줌
		int n = Character.getNumericValue('A');

		
	}

}
