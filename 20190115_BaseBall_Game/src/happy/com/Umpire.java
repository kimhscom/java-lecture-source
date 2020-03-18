package happy.com;

public class Umpire {
	
	private int[] comBall;
	private int[] userBall;
	private int arrLenght;
	
	public Umpire() {
		this(3);
	}
	
	public Umpire(int n) {
		comBall = new int[n];
		userBall = new int[n];
		arrLenght = n;
	}
	
	public Umpire(int[] comBall, int[] userBall) {
		super();
		arrLenght = comBall.length;
		this.comBall = comBall;
		this.userBall = userBall;
	}
	
	public int[] getComBall() {
		return comBall;
	}

	public void setComBall(int[] comBall) {
		this.comBall = comBall;
	}

	public int[] getUserBall() {
		return userBall;
	}

	public void setUserBall(int[] userBall) {
		this.userBall = userBall;
	}

	public int strike() {
		int count = 0;
		for (int i = 0; i < arrLenght; i++) {
			if (comBall[i]==userBall[i]) {
				count++;
			}
		}
		
		return count;
	}
	
	public int ball() {
		int count = 0;
		for (int i = 0; i < arrLenght; i++) {
			for (int j = 0; j < arrLenght; j++) {
				if (i!=j && userBall[i]==comBall[j]) {
					count++;
				}
			}
		}
		
		return count;
	}
	

}
