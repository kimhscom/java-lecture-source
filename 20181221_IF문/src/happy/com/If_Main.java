package happy.com;

public class If_Main {

	public static void main(String[] args) {
		
		int oddSum = 0;
		int evenSum = 0;
		
		for(int i=1; i<11;i++) {
			if(i%2==0) {
				evenSum += i; // evenSum = evenSum+i
			} else if(i%2==1) {
				oddSum += i;
			}
			
			System.out.println("홀수 값" + oddSum);
			System.out.println("짝수 값" + evenSum);
		}	
		
		
			for(int i=2; i<10; i++) {
				for(int j=1; j<10; j++) {
//					System.out.println(i+"X"+j+"="+(i*j));
					System.out.printf("%d x %d = %d\t", i, j, (i*j));
					}
				System.out.println();
			}
		
			for(int i=0; i<5; i++) {
				for(int j=0; j<(i+1); j++) {
					System.out.print("O");
				}
				System.out.println();
			}
			
			for(int i=6; i>0; i--) {
				for(int j=0; j<(i-1); j++) {
					System.out.print("O");
				}
				System.out.println();
			}
			
			for(int i=0; i<4; i++) {
				for(int j=0; j<(4-i); j++) {
					System.out.print("O");
				}
				System.out.println();
			}
			
			for(int i=0; i<4; i++) {
				for(int j=0; j<(i+1); j++) {
					System.out.print(" ");
				}
				for(int j=0; j<(i+1); j++) {
					System.out.print("O");
				}
				System.out.println();
			}
			


	}

}
