package happy.com;

public class Common_Main {

	public static void main(String[] args) {
		// TODO 2. 다른 클래스의 static을 호출
		// 클래스명.맴버 ex)Math.PI
		
		int n = Common_Class.n;
		Common_Class.glass();
		
		//TODO 3. nonStatic인 경우는 인스턴스화를 한 후 호출
		Common_Class cc = new Common_Class();
		cc.make();
	}

}
