package happy.com;
/*
// interface는 생성자가 존재하지 않음
 * 여러개를 일반적으로 임프리먼츠함
 */
public interface Interface_One extends Interface_Two {
	
	public int A = 100;
	
	// 접근제한자
	void make();
	// 당연한 상속 강요를 위한 interface이기 때문에 접근제한자는 protected 사용하지 못함
//	protected void print();
	public void print();
	// 상속이 되지 않는 private도 사용하지 못함
//	private void print2();

}
