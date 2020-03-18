package happy.com;

public class Change_UserDto {
	
	public void change01(User_DTO dto) { // 이름 문자열 재입력
		dto.setName("홍길동");
	}
	
	public void change02(User_DTO dto) { // 전화번호 문자열 재입력
		dto.setPhone("114");
	}

}
