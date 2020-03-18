package happy.com;

/*
 * 모든 java의 클래스는 java.lang.Object를 기본적으로 상속(extends) 받고 있다.
 * 따라서 protected, public, 만약 같은 패키지라면 default
 * 확장이 되었다면 부모의 제한적으로 접근가능한 맴버들은 사용 가능
 * equals, getClass, toString, hashcode
 */
public class Member {
	
	private String name;
	private int age;
	private String address;
	
	public Member(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "내 이름은 " + name + "이고 나이는 " + age + "살 이고 사는 곳은 " + address + "이다";
	}



	
	

}
