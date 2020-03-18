package happy.com;

import java.util.Arrays;

public class Lotto_One {
	
	private int[] lottoRow;
	
	public Lotto_One() {
		this(6);
	}
	
	public Lotto_One(int n) {
		lottoRow = new int[n];
		make();
	}
	private void make() {
		Arrays.fill(lottoRow, -10);
	}

	@Override
	public String toString() {
		return "당첨번호 : " + Arrays.toString(lottoRow);
	}
	

}
