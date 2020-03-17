// 패키지: 자바 클래스들을 모아놓은 디렉터리
package happy.com;

// 임포트: 다른 패키지에 클래스내 메소드를 사용할 때
import java.util.Calendar;
import java.util.GregorianCalendar;

// Feature f =  new Feature();
public class Feature { // body, block: 클래스 껍때기
// 맴버(Member)
	// 맴버 필드 영역 : 메소드에 소속되지 않고 선언되어 있는 것들
	// 인스턴스 변수
	int n = 10;
	
	// 생성자 영역(Default 생성자)
	public Feature() { 
	}
	
	// 맴버 메소드 영역
	public void make( ) { 
		Calendar cal = new GregorianCalendar();
		// 변수 지역변수 : local variable
		int m = 20;
		System.out.println(m);
	}
	
	public void print() {
		int m = 10;
	}

}
