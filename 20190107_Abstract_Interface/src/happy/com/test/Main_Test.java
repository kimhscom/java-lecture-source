package happy.com.test;

import happy.com.Abstract_Class_One;
import happy.com.Abstract_Class_Two;
import happy.com.Interface_One;

public class Main_Test {

	public static void main(String[] args) {
		// 생성자
		// abstract는 생성자가 있지만 new를 하지 않는다
		// 만약 new를 한다면 구성되어 있지 않는 abstract(추상메소드)를 구현해야 한다.
		
		/*int [] a = new int[] {1,2};
		Abstract_Class_One one = new Abstract_Class_One() {
			int b = 100;
		};*/
		
		/*Abstract_Class_Two = new Abstract_Class_Two() {
			
			@Override
			public void make() {
				// TODO Auto-generated method stub
				
			}
		};*/
		
		/*
		Interface_One one = new Interface_One() {
			
			@Override
			public void process() {
		}; // new 하지 말아라*/

	}

}
