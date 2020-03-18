package happy.com.comm;
/**
 * 계산하고자 하는 요청에 의해 분기 하는 클래스
 * @author 김현수
 * @since2019/01/04
 */

import happy.com.area.Area_Abstract;
import happy.com.area.Area_Circle;
import happy.com.area.Area_Square;
import happy.com.area.Area_Triangle;

public class Choice_Factory {
	/**
	 * 선택된 면적 계산 객체를 생성
	 * @param 1.원, 2.사각형, 3.삼각형
	 * @return 계산할 면적의 객체를 반환
	 */
	public Area_Abstract chice(int number) {
		Area_Abstract aa = null;
		DoubleXY in = new DoubleXY();
		switch (number) {
		case 1:
			aa = new Area_Circle(in.getX(), in.getY());
			break;
		case 2:
			aa = new Area_Square(in.getX(), in.getY());
			break;
		case 3:
			aa = new Area_Triangle(in.getX(), in.getY());
			break;
		default:
			break;
		}
		
		return aa;
	}

}
