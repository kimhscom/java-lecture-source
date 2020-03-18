package happy.com;

public class User_DTO {
	
	private String name; // 이름 초기 문자열
	private String address; // 주소 초기 문자열
	private String phone; // 전화번호 초기 문자열
	
	public String getName() { // 이름 문자열 반환
		return name;
	}
	public void setName(String name) { // 이름 문자열 입력
		this.name = name;
	}
	public String getAddress() { // 주소 문자열 반환
		return address;
	}
	public void setAddress(String address) { // 주소 문자열 입력
		this.address = address;
	}
	public String getPhone() { // 전화번호 문자열 반환
		return phone;
	}
	public void setPhone(String phone) { // 전화번호 문자열 입력
		this.phone = phone;
	}
	@Override // 재정의
	public String toString() {
		return "User_DTO [name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}
	
	

}
