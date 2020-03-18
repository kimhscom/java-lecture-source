package happy.com.lacb;

import happy.com.AccessModify_Class;

public class Extends_Diff_Class extends AccessModify_Class {
	
	//TODO 6. 확장하였지만 패지키가 다른경우는 default 접근제한의
	//             특징에 따라 사용하지 못한다.

	public void extends_diff() {
		publicMethod();
		protectedMethod();
	}
	
	// AccessModify_Class를 상속했지만 AccessModify_Class와 Extends_Diff_Class는 패키지가 다르기 때문에 default를 사용할 수 없다.
	// private 역시 사용할 수 없다.
}
