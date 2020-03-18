package happy.com;

import java.util.Scanner;

public class Area_Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1.원 / 2.삼각형 / 3. 사각형");
		int choice = scan.nextInt();
		
		Area_Comm area = Factory_Pattern_Area.factory(choice);
		area.make();
		area.print();
		
//		// 원을 계산
//		Circle c = new Circle(2, 3);
//		c.make();
//		c.print();
//		// 삼각형을 계산
//		Triangle t = new Triangle(2, 10);
//		t.make();
//		t.print();
//		// 사각형을 계산
//		Square s = new Square(5, 2.4);
//		s.make();
//		s.print();

	}

}
