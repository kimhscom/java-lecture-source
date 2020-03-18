package happy.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO_01 {
/*
 * java.io.*
 * -JAVA의 스트림 이란?
 * - JAVA의 스트림은 입출력 장치와 프로그램을 연결하여 이들 사이의 데이터 흐름을 처리
 * - 입력 스트림, 출력 스트림
 * - 입력 스트림의 기본 단위를 byte
 * - 출력 스트림의 단방향, FIFO(First In First Out)
 * - Reader를 연결해서 사용한다. <- 스트림을 도와주는 객체
 */
	
	public static void main(String[] args) {
		System.out.println("입력");
		InputStreamReader read = new InputStreamReader(System.in);
		try {
			int c = read.read();
			System.out.println(c);
		} catch (IOException e) {
			e.printStackTrace();
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("입력2");
		try {
			String str = br.readLine();
			System.out.println(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
