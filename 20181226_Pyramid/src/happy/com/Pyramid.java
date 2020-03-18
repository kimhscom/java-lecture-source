package happy.com;

public class Pyramid {
	
	public void printIncrease(int stage) {
		for (int i=0; i<stage; i++) {
			for (int j=0; j<stage-i-1; j++) {
				System.out.print("▪");
			} // 공백
			for (int j=0; j<2*i+1; j++) {
				System.out.print("◊");
			} // 그림
			for (int j=0; j<stage-i-1; j++) {
				System.out.print("▪");
			} // 공백
			System.out.println();
		}
		} // printIncrease
		
	public void printDecrease(int stage) {
		for (int i=0; i<stage; i++) {
			for (int j=0; j<i; j++) {
				System.out.print("▪");
			} // 공백
			for (int j=0; j<2*(stage-i)-1; j++) {
				// 0,1,2,3,4 == 5
				// 0,1,2 == 3
				// 0 == 1
				System.out.print("◊");
			} // 그림
			System.out.println();
		}
	}

}
