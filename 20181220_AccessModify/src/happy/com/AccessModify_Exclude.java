package happy.com;

public class AccessModify_Exclude {
	//TODO 2. 외부에서는 private 제외한 모든 메소드들을 사용할 수 있다
	public void exclude() {
		AccessModify_Class ac = new AccessModify_Class();
		ac.publicMethod();
		ac.protectedMethod();
		ac.defaultMethod();
		
	}

}
