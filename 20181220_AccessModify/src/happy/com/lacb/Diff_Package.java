package happy.com.lacb;

import happy.com.AccessModify_Class;

public class Diff_Package {
	
	// TODO 3.외부패키지인 경우 public 제외한 모든 메소드들 사용 불가
	public void diff() {
		AccessModify_Class ac = new AccessModify_Class();
		ac.publicMethod();
	}

}
