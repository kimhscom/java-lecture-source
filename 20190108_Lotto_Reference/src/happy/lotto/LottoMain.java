package happy.lotto;

import java.util.Arrays;

public class LottoMain {

	public static void main(String[] args) {
//		LottoMake l_ref = new LottoMake(15);
//		int[] ref = l_ref.getLottoBox();
//		System.out.println(Arrays.toString(ref));
		
//		LottoMake l_ref = new LottoMake();
//		System.out.println(l_ref.makeNum());
		
//		l_ref.lottoRow();
//		int[] lottoLine = l_ref.getLottoBox();
//		System.out.println(Arrays.toString(lottoLine));
		
//		System.out.println(12/10);
		
		LottoMake l_ref = new LottoMake();
		l_ref.lottoRow();
		l_ref.lottoPrint();

	}

}
