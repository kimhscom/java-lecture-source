package happy.com;

import java.util.Scanner;

public class Factory_Pattern_Area {
	
	public static Area_Comm factory(int choice) {
		Area_Comm areaCal = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("x값 입력");
		double x = scan.nextDouble();
		System.out.println("y값 입력");
		double y = scan.nextDouble();
		
		if (choice==1) {
			System.out.println("원형 계산");
			areaCal = new Circle(x, y);
		} else if(choice==2 ) {
			System.out.println("삼각형 계산");
			areaCal = new Triangle(x, y);
		} else if(choice ==3 ) {
			System.out.println("사각형 계산");
			areaCal = new Square(x,y);
		}		
		return areaCal;
		}
	}
