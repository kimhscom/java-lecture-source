package happy.com;
/**
 * 버블정렬
 * @author 김현수
 *
 */
public class SortBubble {
	
	public static void bubble(int[] m) { // static void로 한 이유 
		for (int i = 0; i < m.length-1; i++) { // 반복의 횟수 -1을 이유 맨오른쪽은 반복을 할 필요가 없기 때문
			for (int j = 0; j < m.length-1-i; j++) { // 값을 넣는 횟수가 줄어들기 때문
				if (m[j]>m[j+1]) {
					int temp = m[j];
					m[j] = m[j+1];
					m[j+1] =temp;
				} // if
			} // for
		} // for
	} // bubble

}
