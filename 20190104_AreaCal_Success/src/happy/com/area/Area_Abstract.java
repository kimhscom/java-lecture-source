package happy.com.area;

/**
 * 면적 계산을 위한 변수 및 출력 메소드<br>
 * 면적을 계산하는 메소드는 abstract로 생성
 * @author 김현수
 * @since 2019/01/04
 * @version 2.0
 *
 */

public abstract class Area_Abstract {
	/**
	 * 계산할 면적의 가로
	 */
	protected double x;
	/**
	 * 계산할 면적의 세로
	 */
	protected double y;
	
	/**
	 * 생성자 오버로딩, 멤버필드 값 오류
	 * @param x 가로
	 * @param y 세로
	 */
	public Area_Abstract(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	/**
	 * 맴버필드의 x값 반환
	 * @return double
	 */

	public double getX() {
		return x;
	}
	
	/**
	 * 맴버필드의 y값 반환
	 * @return double
	 */

	public double getY() {
		return y;
	}
	
	/**
	 * Area_Abstract를 extends 한 클래스에서 구현할<br>
	 * <b>면적 계산 식</b>
	 * @return 면적(double)
	 */
	public abstract double calProcess();
	
	public void print(double result) {
		System.out.println("계산된 면적 값은?\t" + result);
	}
		

}
