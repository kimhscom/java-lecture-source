package happy.com;

import java.util.Scanner;

public class BaseBall_Game {

	private int n; // 배열의 크기
	private Pitcher pit; // 자동생성
	private Hitter hit; // 수동생성
	private Umpire ump; // 비교

	public BaseBall_Game() {
		this(3);
	}

	public BaseBall_Game(int n) { // argument 배열의 길이
		this.n=n;
		pit = new Pitcher(n);
		hit = new Hitter(n);
		ump = new Umpire(n);		
	}

	// 게임 진행
	public void newGame() {
		Scanner scan = new Scanner(System.in);
		String s = "Y";
		do { // 무조건 한번 실행 다음에 판단
			play();
			System.out.println("Next Game? (Y or N)");
			s = scan.next();

			// 메세지
			if (s.trim().toUpperCase().compareTo("N")==0) {
				System.out.println("Good Game~~!!");
			} 

		} while (s.trim().toLowerCase().equals("y")); 
	} 

	// 게임 실행
	public void play() {
		int num = 0;
		int strike = 0;
		int ball = 0;

		pit.make(); // 컴푸터 숫자가 생성
		pit.print(); // 확인차 출력

		ump.setComBall(pit.getGong()); // 맞춰야 할 컴퓨터의 숫자를 비교 클래스에 맴버필드로 저장

		// 게임 진행

		while (num != BaseConst.ITERATOR) { // 횟루의 종료 조건
			num++;

			hit.make();
			System.out.println("You Are hitting count"+num+" times");
			
			ump.setUserBall(hit.getGong());
			
			strike = ump.strike();
			ball = ump.ball();
			
			System.out.printf("you are %d strike // %d ball\n", strike, ball);
			
			if (strike == BaseConst.STRIKE) {
				break;
			}
		} // while
		
		if (strike == BaseConst.STRIKE) {
			System.out.println("You Win~~~~");
		} else {
			System.out.println("You Lose~~~~");
			System.out.println("컴퓨터의 숫자는?\t" + pit.toString());
		}
		
	}

}
