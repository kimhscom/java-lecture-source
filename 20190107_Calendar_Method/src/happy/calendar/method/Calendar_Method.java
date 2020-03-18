package happy.calendar.method;
/**
 * Happy팀에서 만든 달력
 * @author 김현수
 * since 20190107
 * 
 */
public class Calendar_Method {
	/**
	 * 윤년에 관련된 최대일수	
	 */
	private final int[] LEAF = {31,29,31,30,31,30,31,31,30,31,30,31};
	// 객체에 final을 붙이면 주소값만 고정이 됨 값은 재입력이 안된다.
	/**
	 * 평년에 관련된 최대일수
	 */
	private final int[] PLAIN = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	/*
	public Calendar_Method() {
		PLAIN[0] = 10;
		PLAIN = new int[10];
//		PLAIN = {31,28,31,30,31,30,31,31,30,31,30,31};
		PLAIN = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};		
	}
	*/
	
	/**
	 * 입력받은 년도로 판단하여 윤년/평년을 확인
	 * @param year(입력받는 년도 int)
	 * @return true:윤년 / false:평년
	 */
	public boolean isLeafYear(int year) {
		boolean isc = false;
		if (year%4==0 && year%100!=0 || year%400==0) {
			isc = true;
		}
		return isc;
	}
	
	/**
	 * 원하는 년도 이전 까지의 일 수를 누적
	 * @param year 입력 년도
	 * @return 누적 일수
	 */
	public int day(int year) {
		int days =0;
		for (int i = 1; i < year; i++) {
			if (isLeafYear(i)) {
				days += 366;
			}else {
				days += 365;
			}
		}
		return days;
	}
	
	/**
	 * 원하는 년도, 월 이전 까지의 일 수를 누적
	 * @param year 입력 년도
	 * @param month 입력 월
	 * @return int 누적 일수
	 */
	public int day(int year, int month) {
		int days = day(year);
		for (int i = 1; i < month; i++) {
			if (isLeafYear(year)) {
				days = LEAF[i-1];
			}else {
				days += PLAIN[i-1];
			}
		}
		return days;
	}
	
	/**
	 * 입력 받은 년도, 월, 일 까지 일 수를 누적
	 * @param year 입력 받는 년도
	 * @param month 입력 받는 월
	 * @param date 입력 받는 일
	 * @return int 누적 일 수
	 */
	public int day(int year, int month, int date) {
		int days = day(year, month);
		days += date;
		return days;
	}
	
	public int lastDay(int year, int month) {
		int lastDays = 0;
		if (isLeafYear(year)) {
			lastDays = LEAF[month-1];
		}else {
			lastDays = PLAIN[month-1];
		}
		return lastDays;
	}
	
	public void printCalendar(int year, int month) {
		System.out.printf("\t\t%d년\t%d월\n",year,month);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		// 구하고자 하는 달의 1일을 구한 후 print를 출력하기 위해 -1을 해줌
		int dayOfWeek = (day(year, month, 1)+1-1)%7;
		int beforeDay = beforeDay(year, month);
		int beforeDayCal = beforeDay - dayOfWeek+1;
		for (int i = beforeDayCal; i <= beforeDay; i++) {
			System.out.printf("%d\t",i);
		}
		/*for (int i = 0; i < dayOfWeek; i++) {
			System.out.printf("-\t");
		}*/
		
		// 달력의 년월의 최대 일 수
		int lastDay = lastDay(year, month);
		for (int i = 1; i <= lastDay; i++) {
			System.out.printf("%d\t",i);
			if ((dayOfWeek+i)%7==0) {
				System.out.println();
			}
		}
		
		int afterDays = (7-(dayOfWeek+lastDay)%7)%7;
		for (int i = 1; i <= afterDays; i++) {
			System.out.printf("%d\t",i);
		}
	} // printCalendar
	
	public int beforeDay(int year, int month) {
		int beforeDays =31;
		// 1월 일때는 전달의 최대일 수 가 31이 됨
		if (month!=1) {
			beforeDays = lastDay(year, month-1);
		}
		return beforeDays;
	}

}
