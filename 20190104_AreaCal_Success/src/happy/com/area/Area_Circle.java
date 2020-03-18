package happy.com.area;
/**
 * 원 면적을 계산함
 * @author 김현수
 * @since 2019/01/04
 */
public class Area_Circle extends Area_Abstract {
	/**
	 * 부모의 생성자를 초기화 하기 위한 생성자<br>
	 * 부모의 맴버필드에 값을 입력 함
	 * @param x 반지름
	 * @param y 반지름
	 */

	public Area_Circle(double x, double y) {
		super(x, y);
	}
	/**
	 * 원 면적 계산
	 */
	@Override
	public double calProcess() {
		double circle = x*y*Math.PI;
		return circle;
	}

}
