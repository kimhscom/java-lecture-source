package happy.com;

import java.util.Arrays;

public abstract class ABasePlayer implements IBaseBall {

	protected int[] gong;

	public int[] getGong() {
		return gong;
	}

	public ABasePlayer(int n) {
		gong = new int[n];
	}

	public abstract void make();

	@Override
	public void print() {
		System.out.printf("[");
		int n = gong.length;
		for (int i = 0; i < n-1; i++) {
			System.out.printf("%d,",gong[i]);
		}
		System.out.printf("%d]",gong[n-1]);

	}

	public String printString() {
		// String.formate(); => System.out.printf();
		String s = "[";
		int n = gong.length;
		for (int i = 0; i < n-1; i++) {
			s += gong[i]+",";
		}
		s += gong[n-1]+"]";
		return s;
	}

	public String printFormate() {
		String s = String.format("[");
		int n = gong.length;
		for (int i = 0; i < n-1; i++) {
			s+=String.format("%d,",gong[i]);
		}
		s+=String.format("%d],",gong[n-1]);
		return s;
	}

	// toSting Override방식 부모의 toString()
	@Override
	public String toString() {
		return "gong:\t" + Arrays.toString(gong);
	}	

}
