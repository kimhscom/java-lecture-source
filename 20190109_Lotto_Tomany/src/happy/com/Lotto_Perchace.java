package happy.com;

public class Lotto_Perchace {
	
	private Lotto_One[] Lotto_Array;
	
	public Lotto_Perchace(int cnt) {
		Lotto_Array = new Lotto_One[cnt];
	}
	
	public void perchance() { // 몇개 구매
		int row = Lotto_Array.length;
		for (int i = 0; i < row; i++) {
			Lotto_One l = new Lotto_One();
			Lotto_Array[i]=l;
		}
	}

	public Lotto_One[] getLotto_Array() {
		return Lotto_Array;
	}
	

}
