package happy.com;

import java.lang.reflect.Array;

public class Pyramid_Two {

	public void pyramid(int stage) {
		// 중간값
		int mid = stage/2; // 2
		int j2 =0; // 변하는 값
		
		for (int i = 0; i < stage; i++) {
	         System.out.print(j2);
	         for (int j = 0; j < mid-j2 ; j++) {
	            System.out.print("X");
	         } //빈공간
	         for (int j = 0; j < j2*2+1; j++) {
	            System.out.print("O");
	         }
	         for (int j = 0; j < mid-j2; j++) {
	            System.out.print("X");
	         }
	         System.out.println("");
	         
	         isCheck(i,mid);
	         // 비교 판단
	         // if문, 3항 연산자
	      }
	      
	   } // pyramid
	   
	   // 층수랑 mid값을 입력받아서 j2값을 증가 혹은 감소
	   // 위는 연산하는 메소드 isCheck은 판단하는 메소드
	      public void isCheck(int staging, int mid) { 
	         int j2 =0;
			if(staging<mid) {
	            j2 ++;
	         }else {
	            j2--;
	         }
	      }
	}