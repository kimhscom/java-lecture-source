package happy.com;

import java.util.ArrayList;

public class LottoMake {
	
	ArrayList<RamdomNum> lottoCom;
	
	public LottoMake() {
		lottoCom = new ArrayList<RamdomNum>();
	}
	
	public void make(int cell) { // 1줄에 6개, 4개...
		int count = 0;
		while (true) {
			RamdomNum rn = new RamdomNum();
			if (!lottoCom.contains(rn)) { // 값이 있으면 true
				lottoCom.add(rn);
				count++;
			}
			if (count>=cell) {
				break;
			}
		}
	}

}
