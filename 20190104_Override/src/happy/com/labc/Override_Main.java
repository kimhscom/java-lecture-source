package happy.com.labc;

import happy.com.Override;
import happy.com.Parents;

public class Override_Main {

	public static void main(String[] args) {
//		Parents p = new Parents();
//		p.make();
		
		// 자식의 이름으로 자식을 생성
		// 자식이 생성되었다면 Object->Parents->Override
		// o 객체명 특선 Override 특성은 가짐
//		Override o = new Override(); 
//		o.make();
		
		// Override 되었다면 부모의 메소드는 공개되어 있지 않다
		// 무조건 Override된 자식 메소드가 실행이 된다
		Parents op = new Override();
		op.make();
	}

}
