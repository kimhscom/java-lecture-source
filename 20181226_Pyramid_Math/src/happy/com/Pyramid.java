package happy.com;

public class Pyramid {
	
	// 계산하기 어려웠던 공백 및 그림을 API 제공해 주는 Math.abs()를
	// 이용하여 계산
	public void pyramid_Math(int stage) { 
		for (int i = 0; i < stage; i++) { // 전체 층수
			for (int j = 0; j < Math.abs(i-stage/2); j++) { // 공백 절대값(현재 층수-전체 층수/2)
				System.out.print("☆");
			}
			for (int j = 0; j < stage-2*(Math.abs(i-stage/2)); j++) { // 그림 현재 층수-2*(절대값(현재 층수-전체 층수/2))
				System.out.print("★");
			}
			for (int j = 0; j < Math.abs(i-stage/2); j++) { // 공백 절대값(현재 층수-전체 층수/2)
				System.out.print("☆");
			}
			System.out.println();
		}
	}

}
