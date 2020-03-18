package happy.com;

public class SandClock {
	
	public static void printIncrease(int stage) { // 전체 층수
		for (int i=0; i<stage; i++) { // 현재 층수 < 전체 층수
			for (int j=0; j<stage-i-1; j++) {
				System.out.print("▪");
			} // 공백 전체 층수 - 현재 층수 - 1
			for (int j=0; j<2*i+1; j++) {
				System.out.print("◊");
			} // 그림 2*현재 층수 + 1
			for (int j=0; j<stage-i-1; j++) {
				System.out.print("▪");
			} // 공백 전체 층수 - 현재 층수 - 1
			System.out.println();
		}
		} // printIncrease
		
	public static void printDecrease(int stage) { // 전체 층수
		for (int i=0; i<stage; i++) { // 현재 층수 < 전체 층수
			for (int j=0; j<i; j++) {
				System.out.print("▪");
			} // 공백 현재 층수
			for (int j=0; j<2*(stage-i)-1; j++) {
				// 0,1,2,3,4 == 5
				// 0,1,2 == 3
				// 0 == 1
				System.out.print("◊");
			} // 그림
			for (int j=0; j<i; j++) {
				System.out.print("▪");
			} // 공백 현재 층수
			System.out.println();
		}
	}

}
