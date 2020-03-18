package happy.com;

// 변수에 final 작성되어 있다면 반드시 처음에 입력해야 하고
// 입력된 값은 다시 값을 재입력 할 수 없다 -> 상수 ex) Math.PI
public class Variable_Final {
	
	// 맴버필드의 final(instance variable)
	// ?? 맴버필드는 클래스가 생성될 때 초기화 과정을 거침 따라서 재입력을 함
	final int N;
	static final String S;
	
	static {
		// 클래스 보다 가장 먼저 실행
		S="happy";
	}
	// 생성자를 맴버필드를 초기화 할때 사용한다
	public Variable_Final() {
		N = 100;
	}
	
	public void process() {
		// local variable 사용 범위가 실행 되기 때문에
		// 선언 후 입력 가능하지만 재입력 불가능
		final int a;
		a = 10;
//		a = 20;
	}

}
