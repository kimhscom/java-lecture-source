package happy.com;

import java.util.StringTokenizer;

// java.util.StringTokenizer
// Iterator Pattern을 사용합니다.
public class Cut_StringTokenizer {
	
	public  void stringTokenizer() {
		String str = "oop : foo : poo";
		StringTokenizer token = new StringTokenizer(str);
		// pass by reference 개념
		// object로 밖에 안들어간다 casting으로 이용해서 사용
		while (token.hasMoreElements()) { // 순서도 중복도 없음
			String obj = (String) token.nextElement();
			System.out.println(obj);	// 반복 메소드를 두번 사용해도 한번만 출력됨		
		}
		
		StringTokenizer token2 = new StringTokenizer(str, "o"); // 공백을 포함 특정 문자까지 제외하고 출력된다
		while (token2.hasMoreElements()) {
			String obj = (String) token2.nextElement();
			System.out.println(obj);	
		}
	}

}
