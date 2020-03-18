package happy.com;

import java.util.Arrays;

// java.lang.String spilt()
public class Cut_split {
	
	public void split() {
		// 기준에 의해서 문자을 잘라 문자열의 배열로 변환
		// 기준이 앞뒤로 중복이 되지 않으면 성공적으로 자름
		// 첫값 이후에는 32(space)가 반드시 포함
		String str = "oop:foo:poo";
		String[] strCut1 = str.split(":");
		System.out.println(strCut1.length);
		System.out.println(Arrays.toString(strCut1));
		
		// 만약 앞뒤의 같은 값으로 기준을 잡을때
		// 배열의 끝값은 사라진다
		String[] strCut2 = str.split("o");
		System.out.println(strCut2.length);
		System.out.println(Arrays.toString(strCut2));
	}

}
