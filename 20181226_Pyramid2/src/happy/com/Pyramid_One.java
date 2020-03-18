package happy.com;

import java.lang.reflect.Array;

public class Pyramid_One {

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

			if(i<mid) {
				j2++;
			} else {
				j2--;
			}
		
		 // 문법 안맞음
        //int j2 = (i<mid)? j2++ : j2--;
        // j2 = (i<mid)? ++j2 : --j2;
		}

	}
}



