package happy.com;

public class Lotto_Main {

	public static void main(String[] args) {
		Lotto_Perchace lp = new Lotto_Perchace(5);
		lp.perchance();
		Lotto_One[] lotto_com = lp.getLotto_Array();
		for (int i = 0; i < lotto_com.length; i++) {
			System.out.println(lotto_com[i]);
		}

	}

}
