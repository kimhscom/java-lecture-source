package happy.com.comm;

import happy.com.area.Area_Abstract;

/**
 * 입력 받은 면적에 따른 계산 및 출력을 해주는 클래스
 * @author 김현수
 * @since 2019/01/04
 */
public class RunDelegate {
	/**
	 * 생성된 객체에서 연산을 실행시키고 출력 해줌
	 * @param area(면적 객체 circle, triangle, square)
	 */
	public static void calPlay(Area_Abstract area) {
		if (area != null) {
		double result = area.calProcess();
		area.print(result);
	} else {
		System.out.println("관리자에게 문의해주세요");
	}
	}

}
