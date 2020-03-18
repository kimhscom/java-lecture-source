package happy.com.area;
/**
 * 사각형 면적을 계산함
 * @author 김현수
 * @version 2019/01/04
 */
public class Area_Square extends Area_Abstract {
	/**
	 * 부모의 생성자를 초기화 하기 위한 생성자<br>
	 * 부모의 맴버필드에 값을 입력 함
	 * @param x 가로
	 * @param y 세로
	 */

	public Area_Square(double x, double y) {
		super(x, y);
	}
	/**
	 * 사각형 면적 계산
	 */

	@Override
	public double calProcess() {
		double square = x*y;
		return square;
	}

}
