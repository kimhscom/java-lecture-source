package happy.com;

public class For_Exam {
	// 14번 for문 (Iterator), while(Loop)
	// 초기값 조건이 있는 반복문
	// for(int i=0; i<10; i++) {연산}
	public static void for_Syntex() {
		int sum = 0;
		for(int i = 1; i < 11; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	
//	sum = sum+1;
//	sum = sum+2;
//	int i;
//	for(i = 0; i < 10; i++) {
// }

/*  사용하지 않는게 좋다
	for(;;) {
		
	}
	*/
		
	// m++ 선처리 후증가
	// ++m 선증가 후처리
	int n = 10;
	System.out.println(n++);//10출력 -> 11로 증가
	System.out.println(n++);//11출력 -> 12로 증가
	System.out.println(++n);//13증가 출력 ->
		
	} // For_Syntex
}