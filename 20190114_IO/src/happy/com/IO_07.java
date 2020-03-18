package happy.com;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

public class IO_07 {
/*
 * 버퍼를 이용한 입출력
 * 버퍼를 가진 스트림 사용
 * 이를 사용하면 1바이트 처리가 아닌 버퍼를 통해 일시적으로 프로그램에 전달
 * 바이트 버퍼 : BufferedInputStream / BufferedOutputStream
 * 문자 버퍼(유니코드와 문자 데이터만 처리) : BufferedReader / BufferedWriter
 */
	public static void main(String[] args) {
		BufferedOutputStream bout = new BufferedOutputStream(System.out,20); // 20바이트
		
		Date d = null;
		
		d = new Date();
		long start = d.getTime();
		
		System.out.println(start);
		
		try {
			FileReader fin = new FileReader("C:\\Happy_Eclipse\\eclipse\\eclipse.ini");
			int c;
			try {
				while ((c=fin.read())!=-1) {
					bout.write((char)c);
				}
				d = new Date();
				long end = d.getTime();
				System.out.println(end+"------------------");
				
				// 버퍼가 다 채워지고 그 다음에 다음 값이 밀려 나감
				bout.flush();
				fin.close();
				bout.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
