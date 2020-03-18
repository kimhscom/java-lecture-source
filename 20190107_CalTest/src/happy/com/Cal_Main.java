package happy.com;

public class Cal_Main {

	public static void main(String[] args) {
		CalMethod cal = new CalMethod();
		
		/*
		int cnt = 0;		
		for (int i = 1; i < 1000; i++) {
			if (cal.isLeafYear(i)) {
				cnt++;
			}			
		}	
		System.out.println(cnt);
		*/
		
		/*
		int date = cal.day(2019, 1, 7);
		int month = cal.day(2019, 1);
		int year = cal.day(2019);
		System.out.println(date);
		System.out.println(month);
		System.out.println(year);
		System.out.println(year+month+date);
		*/
		
		/*
		int monthDay =  cal.lastDay(2019, 6);
		System.out.println(monthDay);
		*/
		
		cal.calPrint(2019, 1);
		
	}
}
