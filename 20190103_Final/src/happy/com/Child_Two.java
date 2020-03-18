package happy.com;
// Parents_Two_Final 클래스는 final로 되어있기 때문에 상속이 불가
public class Child_Two extends Parents_Two_Final {
	
	public void check() {
		super.make();
		super.print();
	}

}
