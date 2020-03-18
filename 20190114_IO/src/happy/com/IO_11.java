package happy.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class IO_11 {

	public static void main(String[] args) {
		File src = new File("C:\\Windows\\system.ini"); // 소스파일
		File dst = new File("C:\\temp\\system.txt"); // 목적파일

		FileReader fr = null; // 파일(문자) 읽음
		FileWriter fw = null; // 파일(문자) 씀

		BufferedReader in = null; // 읽을 때 감쌈
		BufferedWriter out = null; // 쓸 때 감쌈

		int c;

		try {
			fr = new FileReader(src); // 원본 파일을 읽어 옴
			fw = new FileWriter(dst); // 쓸 파일을 읽어 옴

			in = new BufferedReader(fr);
			out = new BufferedWriter(fw);

			while ((c=in.read())!=-1) {
				out.write(c);
			}
		} catch (Exception e) {
				System.out.println("파일복사 오류");
			} // 쓸 파일 읽어 옴
		}

}
