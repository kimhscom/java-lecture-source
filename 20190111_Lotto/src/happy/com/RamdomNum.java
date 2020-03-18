package happy.com;
/**
 * 무작위 숫자
 * @author 김현수
 *
 */
public class RamdomNum {
	
	public int lottoN() {
		int num = 0;
		num = (int)(Math.random()*45)+1;
		return num;
	}

}
