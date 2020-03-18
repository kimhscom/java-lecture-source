package happy.com;

public class Triangle {
	
	public static void triangle_one(int stage) {
		for (int i =0; i < stage; i ++) { // 전체층수
			for (int j =0; j < i+1; j++ ) {
				System.out.print("@");
			}
			System.out.println();
		}
	}
	
	public static void triangle_two(int stage) {
		for (int i =0; i < stage; i ++) { // 전체층수
			for (int j =0; j < (stage-i); j++ ) {
				System.out.print("@");
			}
			System.out.println();
		}
	}
	
	public static void triangle_three(int stage) {
		for (int i =0; i < stage; i ++) { // 전체층수
			for (int j =0; j < stage-i-1; j++ ) { // 공백
				System.out.print("  ");
			}
			for (int j =0; j < i+1; j++ ) { // 모양
				System.out.print("@");
			}
			System.out.println();
		}
	}

}
