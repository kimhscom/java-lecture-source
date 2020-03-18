package happy.com;

public class CoffeeProcess {
	
	public static void main(String[] args) {
		Arguments coffee = new Arguments();
		int n = coffee.make(1200); // 계산된 정수
		coffee.print(n);
	}

}
