package happy.com;

import java.lang.reflect.Array;

public class Pyramid_Three {
	
	int j2 = 0;
	public void pyramid(int stage) {
		// 중간값
		int mid = stage/2; // 2
		int j2 =0; // 변하는 값
		for (int i=0; i<stage; i++) {
			System.out.print(j2);
 
			for (int j=0; j<mid-j2; j++) {
				System.out.print("◇");
			}
			for (int j=0; j<2*j2+1; j++) { // stage 홀수만 가능
				System.out.print("◆");
			}
			for (int j=0; j<mid-j2; j++) {
				System.out.print("◇");
			}
			System.out.println();
			
			// 3항 연산자는 반드시 리턴이 있기 때문에
			// 반환되는 값(0)은 n에 저장, 처리된 1값은 상위 변수 저장
			// int n = (i<mid) ? j2++ : j2--;
			
			// 처음에 처리된 0값만 계속해서 입력. 즉, 변화되는 값 없음
			// j2 = (i<mid) ? j2++ : j2--;
			
			// 선증가된 값은 상위 변수에 저장
			j2 = (i<mid) ? ++j2 : --j2;

	}
}		
		public void isCheck (int staging, int mid) { // 층수랑 mid값을 입력 받아서 j2증가
			if(staging < mid) {
				j2++;
			} else {
				
			}
		}
}
