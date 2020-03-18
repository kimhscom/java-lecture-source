package happy.com;

import util.happy.Happy_Input;

public class PyramidMain {

	public static void main(String[] args) {
		int n = Happy_Input.StageInput();
		delgate(n);
	}
	
	public static void delgate(int stage) { // 위임
		Pyramid p = new Pyramid();
		p.printIncrease(stage);
		p.printDecrease(stage);
	}

}
