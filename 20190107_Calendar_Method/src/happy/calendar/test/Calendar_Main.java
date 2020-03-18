package happy.calendar.test;

import happy.calendar.method.Calendar_Method;

public class Calendar_Main {

	public static void main(String[] args) {
		Calendar_Method cal = new Calendar_Method();
		// 1~2019까지 윤년이 몇개 있는지 확인
//		int cnt = 0;
//		for (int i = 1; i < 2019; i++) {
//			if (cal.isLeafYear(i)) {
//				cnt++;
//			}
//		} // for
//		System.out.println(cnt);
		
		// 1~2019 이전까지 총 일수를 계산
//		int yearDays = cal.day(2019);
//		System.out.println(yearDays);
		
		// 2019년 1월 이전까지 총 일 수
//		int monthDays = cal.day(2019,3);
//		System.out.println(monthDays);
		
		// 살아온 날짜 구하기
//		int birthday = cal.day(1986,8,20);
//		int nowday = cal.day(2019,1,7);
//		System.out.println("살아온 일 수 : "+(nowday - birthday));
		
//		int nowday = cal.day(2019,1,7);
//		System.out.println(nowday);
		
		// 기능 테스트
//		int nowDate = cal.day(2019,8,20);
		// 그레고리안이 1년 1월 1일 월요일 지정 => 요일
		/*
		int calNowDate = (nowDate+1)%7;
		System.out.println(calNowDate);
		switch (calNowDate) {
		case 1: System.out.println("일요일");		break;
		case 2: System.out.println("월요일");     break;
		case 3: System.out.println("화요일");		break;
		case 4: System.out.println("수요일");	    break;
		case 5: System.out.println("목요일");		break;
		case 6: System.out.println("금요일");		break;
		case 7: System.out.println("토요일");		break;
		}*/
		
		/*
		// 년도 월일 최대일 수 확인
		int plainTest = cal.lastDay(2019,2); // 28
		
		boolean leafIsc = cal.isLeafYear(2016);
		System.out.println(leafIsc);
		
		int leafTest = cal.lastDay(2016, 2); //29
		
		System.out.println(plainTest);
		System.out.println(leafTest);
		*/
		
		for (int i = 1; i <= 12; i++) {
			cal.printCalendar(2019, i);
			System.out.println("\n");
		}		
	}

}
