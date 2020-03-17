package happy.com;

public class TypeExam {
	
	// 메인 메소드
	// java 프로그램의 시작과 끝

	public static void main(String[] args) {
		//외부에 있는 내것이 아닌 다른 클래스의 메소드를 사용하기
		// 1. 외부에 있는 클래스의 이름 알아야 함 TypeProcess
		// 2. 메모리에 할당하여 문서가 아닌 객체(instance)로 만들어야함
		//    -> instance화, 객체화
		//    -> new 라는 예약어를 사용
		
		// 객체를 선언 한다
		TypeProcess tp = new TypeProcess();
		// 실행 했다
//		tp.typePractice();
//		tp.typePractice02();
		
		TypeCalculation tc = new TypeCalculation();
//		tc.calDouble();
		tc.charPractice();
	}

}
