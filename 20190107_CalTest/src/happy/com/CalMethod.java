package happy.com;

public class CalMethod {
	private final int[] LEAF = {31,29,31,30,31,30,31,31,30,31,30,31};
	private final int[] PLAIN = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public boolean isLeafYear(int year) {
		boolean isc = false;
		if (year%4==0 && year%100!=0 || year%400==0) {
			isc = true;
		}
		return isc;
	}
	
	public int day(int year) {
		int days = 0;
		for (int i = 1; i < year; i++) {
			if (isLeafYear(i)) {
				days += 366;
			} else {
				days += 365;
			}
		}
		return days;
	}
	
	public int day(int year, int month) {
		int days = 0;
		for (int i = 1; i < month; i++) {
			if (isLeafYear(year)) {
				days += LEAF[i-1];
			} else {
				days += PLAIN[i-1];
			}
		}
		return days;
	}
	
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
	
	public void calPrint(int year, int month) {
		System.out.printf("\t\t%d년\t%d월\n",year,month);
		System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
		
		int dayOfWeek = (day(year,month,1)+1-1)%7;
		int beforeDay = beforeDay(year, month);
		int beforeDayCal = beforeDay-dayOfWeek+1;
		for (int i = beforeDayCal; i <= beforeDay; i++) {
			System.out.printf("%d\t",i);
		}
		
		int lastDay = lastDay(year, month);
		for (int i = 1; i <= lastDay; i++) {
			System.out.printf("%d\t",i);
			if ((dayOfWeek+i)%7==0) {
				System.out.println();
			}
		}
		
		int afterDay = (7-(dayOfWeek+lastDay)%7)%7;
		for (int i = 1; i <= afterDay; i++) {
			System.out.printf("%d\t",i);
		}
	}
	
	public int beforeDay(int year, int month) {
		int beforeDays = 31;
		if (month!=1) {
			beforeDays = lastDay(year, month-1);
		}
		return beforeDays;
	}

}
