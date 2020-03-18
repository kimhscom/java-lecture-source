package happy.com;

public class Arguments {
	
	// 내가 필요한 값들에 대해서 미리 선언
	private int coffeeAA = 500;
	private int coffeeLT = 700;
	
	// 값은 : Arguments
	// 외부에서 입력 받은 값을 담고 있는 변수 -> 메소드의 body내에서 사용
	// 입력 받은 int(돈)을 커피가격과 연산하여 잔수를 리턴
	/**
	 * 커피의 잔수를 계산하는 메소드
	 * @param 정수의 금액
	 * @return 계산된 잔수(정수)
	 */
	public int make(int money) {
		int n = 0;
			n = money/coffeeAA;
		return n;
	}
	// 이쁘게 출력
	public void print(int cups) {
		System.out.println(cups + "잔의 커피가 나왔습니다");
	}

}
