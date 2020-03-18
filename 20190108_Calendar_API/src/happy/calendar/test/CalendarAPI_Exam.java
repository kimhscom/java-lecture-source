package happy.calendar.test;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

import happy.calendar.api.Calendar_API;

public class CalendarAPI_Exam {

	public static void main(String[] args) {
		// 생성하는 방법
		// Calendar.getInstance(), GregorianCalendar

		// 자동으로 그리니치천문대를 기준으로 시스템에 있는 현재 기준으로 사용함
		// 2019 01 08
		Calendar cal = Calendar.getInstance();
		GregorianCalendar gCal = new GregorianCalendar();

		// int dayOfWeek = gCal.get(Calendar.DAY_OF_WEEK);
		// System.out.println(dayOfWeek);

		int dayOfYear = gCal.get(Calendar.DAY_OF_YEAR);
		System.out.println(dayOfYear);

		// Date date = gCal.getTime();
		// System.out.println(date.toString());

		int lastDay = gCal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(lastDay);

		// 2019 2 25에 요일 / 2월의 최대일수
		gCal.set(2019, 2 - 1, 25); // ??

		int setDayOfWeek = gCal.get(Calendar.DAY_OF_WEEK);
		int setLastDay = gCal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(setDayOfWeek);
		System.out.println(setLastDay);

		int y = 2019;
		int m = 1;
		int d = 1;

		cal.set(y, m - 2, d);
		int beforeDayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int beforeLastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(beforeDayOfWeek);
		System.out.println(beforeLastDay);

		Calendar_API calAPI = new Calendar_API();
		calAPI.printCalendar(2019, 1);

	}

}
