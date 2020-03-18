package happy.com.run;

import happy.com.area.Area_Abstract;
import happy.com.comm.Choice_Factory;
import happy.com.comm.InputVal;
import happy.com.comm.RunDelegate;

public class AreaCal_Main {

	public static void main(String[] args) {
		Choice_Factory factory = new Choice_Factory(); // 분기 객체
		System.out.println("1.원, 2.사각형, 3.삼각형");
		int number = InputVal.inputIntVal(); // 키보드 정수값 입력
		Area_Abstract area = factory.chice(number); // 분기 메소드 반환
		RunDelegate.calPlay(area);		

	}

}
