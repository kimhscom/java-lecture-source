package happy.com;

import java.util.Calendar;

// 39. Switch~Case
// 선택 조건문
public class SwitchMain {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); // 2019-01-08
		// 1:일요일, 2:월요일~~~, 7:토요일
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		
		switch (dayOfWeek) {
		case Calendar.SUNDAY:System.out.println("일요일");			break;
		case Calendar.MONDAY:System.out.println("월요일");			break;
		case Calendar.TUESDAY:System.out.println("화요일");			break;
		case Calendar.WEDNESDAY:System.out.println("수요일");			break;
		case Calendar.THURSDAY:System.out.println("목요일");			break;
		case Calendar.FRIDAY:System.out.println("금요일");			break;
		default:
			System.out.println("토요일");
			break;
		}
		/*
		 * key와 value는 항상 같은 타입
		 * key와 value는 값만 정수만 ~1.6까지
		 * key와 value는 값만 정수 + 문자열 1.7~ 이후
		 * fall-throw 아래통과
		 *
		switch (key) {
		case value: // key==value 같은 값이라면 실행되는 연산
			
			break;
			
		case value: // 선택조건을 여러가지 작성 가능 예) else if
		
		    break:

		default:
			break;
		}*/

	}

}
