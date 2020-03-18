package happy.com;

import java.util.Arrays;

public class BaseBall_Main {

	public static void main(String[] args) {
		BaseBall_Inval ball = new BaseBall_Inval();
		int[] userBall = ball.inputBox(3, 1, 9, false);
		System.out.println(Arrays.toString(userBall));
	}

}
