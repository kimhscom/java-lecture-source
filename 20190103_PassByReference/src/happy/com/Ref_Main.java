package happy.com;

public class Ref_Main {

	public static void main(String[] args) {
		User_DTO origin = new User_DTO(); // origin 객체 생성
		origin.setName("이슬"); // 이름 입력
		origin.setAddress("냉장고"); // 주소 입력
		origin.setPhone("119"); // 전화번호 입력
		System.out.println(origin); // origin 객체 출력
		
		Change_UserDto change = new Change_UserDto();
		
		change.change01(origin);
		System.out.println(origin);
		
		change.change02(origin);
		System.out.println(origin);
		
		// 객체의 위치@16진수 hashcode
		// print() -> java.lang.Object toString() 실행
		// 상속을 받은 자식 클래스에 오버라이드를 하면 부모의 메소드가 아닌 자식
//		System.out.println(origin);

	}

}
