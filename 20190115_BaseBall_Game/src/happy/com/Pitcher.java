package happy.com;

import java.util.Arrays;

public class Pitcher extends ABasePlayer{
	
	public Pitcher() {
		this(3);
	}
	
	public Pitcher(int n) {
		super(n);
	}

	@Override
	public void make() {
		Arrays.fill(gong, -1); // 음수가 나오면 바로 체크할 수 있도록 -1을 해준다
		int count = 0;
		int n = gong.length;
		while (count!=n) {
			int temp = this.makeNum();
			if (!isSame(temp)) {
				gong[count++] =temp;
			}
		}
	}
	
	// 난수를 발생 시킴
	private int makeNum() {
		int n = 0;
		n = (int)(Math.random()*9)+1;
		return n;
	}
	
	private boolean isSame(int temp) { // 중복이면 true
		boolean isc = false;
		for (int i = 0; i < gong.length; i++) {
			if (gong[i]==temp) {
				isc =true;
				break;
			}			
		}
		return isc;
	}
	
	public int[] getGong() {
		return gong;
	}

}
