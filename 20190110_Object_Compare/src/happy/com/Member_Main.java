package happy.com;

public class Member_Main {

	public static void main(String[] args) {
		Member_Dto jin = new Member_Dto();
		jin.setName("진숙");
		jin.setAge(25);
		
		Member_Dto sook = new Member_Dto();
		sook.setName("진숙");
		sook.setAge(25);
		
		System.out.println(jin.hashCode());
		System.out.println(sook.hashCode());
		
		System.out.println(System.identityHashCode(jin));
		System.out.println(System.identityHashCode(sook));
		
		System.out.println(jin==sook);
		System.out.println(jin.equals(sook));

	}

}
