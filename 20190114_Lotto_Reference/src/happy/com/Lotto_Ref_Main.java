package happy.com;

import java.util.ArrayList;

public class Lotto_Ref_Main {

	public static void main(String[] args) {
//		RamdomNum n = new RamdomNum();
//		System.out.println(n);
		
		LottoMake lm = new LottoMake();
		lm.make(6);
		ArrayList<RamdomNum> lists = lm.lottoCom;
		for (int i = 0; i < lists.size(); i++) {
			System.out.print(lists.get(i)+"\t");
		}
		System.out.println();
	}

}
