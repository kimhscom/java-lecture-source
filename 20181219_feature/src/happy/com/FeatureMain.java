package happy.com;

public class FeatureMain {

	public static void main(String[] args) {
		int n =10;
		
		// 패키지와 hash code가 찍힘(주소는 계속 변하기 때문에 찍을 수 없음)
		// f2, f3 모두 같은 주소를 사용하지만 그에 대한 hash값은 다름
		Feature f = new Feature(); 
		Feature f1 = new Feature(); 
		Feature f3 = new Feature(); 
		System.out.println(n);
		System.out.println(f);
		System.out.println(f1);
		System.out.println(f3);
		
		/*Feature f = new Feature(); // 인스턴스화 객체화
		f.n = 1000;
		Feature f2 = f;
		f2.n=20000;
		System.out.println(f.n);
		
		Feature f1 = new Feature();
		f1.n = 2000;
		System.out.println(f.n);
		*/
		f.make();

	}

}
