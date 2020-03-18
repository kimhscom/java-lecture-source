package happy.com;

public class PrintMain {
	
	// 출력 print, println, printf
		public static void main(String[] args) {
		// 가로로만 출력
		// 반드시 값(arguments)이 있어야 함
		System.out.print("금");
		System.out.print("요");
		System.out.print("일");
		
		//arguments를 출력하고 난 다음 한줄내려 줌(엔터)
		System.out.println("금");
		System.out.println("요");
		System.out.println("일");
		
		// printf는 출력을 작성하고 필요한 값을 바인딩
		// %d(digit), %s(String), %f(실수), %c(char)
		// %n(엔터)
		int year = 2018;
		int month = 12;
		System.out.println(year+"년도"+month+"월");
		
		System.out.printf("%f 원주율%n",3.14);
		System.out.printf("%d년도 %d월",year, month);
		
		// 16번 이스케이프 문자 & 엔티티 태그
		// 번역되지 않고 문자 그대로 표출되는 문자
		
		// \t(8바이트 공간), \n(한줄 내림), \"(two quotation), \\(폴더)
		
		System.out.print("\n\"사 \\ \t랑\"");
	}

}
