package happy.com;

//TODO 4.extends를 통해서 다른 클래스를 나의 부모클래스로 만든다.
//                    나의 클래스가 부모의 클래스로 인해 확장된다.
public class Extends_Class extends AccessModify_Class{
// 확장이 되면 부모에 있는 모든 맴버를 사용할 수 있다.	
	public void extendsParents() {
		publicMethod();
		protectedMethod();
		defaultMethod();		
	}

}
