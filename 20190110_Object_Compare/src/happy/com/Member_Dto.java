package happy.com;

public class Member_Dto {
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
	
	@Override
	public String toString() {
		return "Member_Dto [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		// 부모가 생성을 했지만 override 부모가 생성 hashcode에 덮어쓰기
		/*final int prime = 31; // 소수값
		int result = 1;
		result = prime * result + age; // 숫자
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;*/
		return age+name.hashCode() + 137;
	}
	@Override
	// 객체를 비교 한다
	// 조건 있어야 된다
	public boolean equals(Object obj) { // Object obj = new Member_Dto();
		boolean isc =false;
		Member_Dto dto = (Member_Dto)obj;
		if(name.equals(dto.getName()) && age == dto.getAge()) {
			isc =true;			
		}
		return isc;
		
		/*if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member_Dto other = (Member_Dto) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;*/
	}	
	

}
