package happy.com;

public class Object_Test {

	public static void main(String[] args) {
		Member m1 = new Member("진숙씨", 25, "병원");
		Member m2 = new Member("범진씨", 29, "다른병원");
		
		// 객체가 어느 Class에서 인스턴스화가 되었는지 확인
		System.out.println(m1.getClass());
		System.out.println(m2.getClass());
		System.out.println(m1.getClass() == m2.getClass());
		
		// 객체를 표한 할 수 있도록 해줌
		// System.out.print() 내부에서 Object toString() 실행
	    String m1Str = m1.toString();
		String m2Str = m2.toString();
		System.out.println(m1Str);
		System.out.println(m2Str);
		System.out.println(m1);
		
		// 같은 클래스에서 인스턴스화 되었지만 인스턴스 된 객체를 서로 다른 주소와 hashcode를 갖는다
		int m1Code = m1.hashCode();
		int m2Code = m2.hashCode();
		System.out.println(Integer.toHexString(m1Code));
		System.out.println(m2Code);

		// 객체를 비교하기 위해서는
		// 주소와 hashcode는 모두 부모가 부여 해줌
		// 객체 비교는 부모만 할 수 있음
		// equals
		String str = "happy";
		boolean isc = m1.equals(m2); // hashcode를 비교함
		boolean isc1 = str.equals(m1); // Object를 부모를 두고 있지만 다른 Class이기 때문에 비교 대상이 아님
		System.out.println(isc);
		System.out.println(isc1);

	}

}
